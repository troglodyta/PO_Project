package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import entity.*;
import FramesComponets.Wypozyczenie;
import FramesComponets.WypozyczenieSzczegoly;
import FramesComponets.WypozyczenieSzczegoly2;
import model.DBManager;
import model.Model;
import model.SessionStore;
import model.WypozyczenieModel;

public class WypozyczenieSzcegolyListener extends AbstractSingleControler implements ActionListener {

	public WypozyczenieSzcegolyListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		Wypozyczenie wypozyczenie = (Wypozyczenie) this.getView();
		WypozyczenieModel model = (WypozyczenieModel) this.getModel();
		switch (command) {
		case "Powrót":
				wypozyczenie.setCurrentWypozyczeniaPanel(0);
			break;
		case "Zapisz" :
				WypozyczenieSzczegoly panel =(WypozyczenieSzczegoly)wypozyczenie.getWypozyczeniaPanel(1);
				List<Rezerwacja> rezerwacje = (List<Rezerwacja>) SessionStore.INSTANCE.load("rezerwacjeList");
				Integer currentIndex = (Integer) SessionStore.INSTANCE.load("indexRezerwacji");
				Rezerwacja rezerwacja = rezerwacje.get(currentIndex);
				HashMap<String, Object>[] fildsValues = panel.getFildsValue();
				HashMap<String, Object> daneKlienta = fildsValues[0];
				HashMap<String, Object> daneFirmy= fildsValues[1];
				System.out.println(fildsValues[0]);
				System.out.println(fildsValues[1]);
				rezerwacja.setUwagi((String)daneKlienta.get("uwagi"));

				try{
				Klient klient = rezerwacja.getKlient();
				klient.setFields(daneKlienta);

				Adres adresKlienta = klient.getAdres();
				adresKlienta.setFields(daneKlienta);

				Firma firma = rezerwacja.getDaneWypozyczenia().getFirma();
				if(firma !=null){
				firma.setFields(daneFirmy);

				Adres adresFirmy = firma.getAdres();
				adresFirmy.setFields(daneFirmy);
				}
				DBManager.INSTANCE.updateEntity(rezerwacja);
				}
				catch(java.lang.IllegalArgumentException exc){
					JOptionPane.showMessageDialog(panel, exc.getMessage());
					System.out.println("AAA");
					break;
				}
//				adresFirmy.setFields(daneFirmy);
//				System.out.println(rezerwacja);
//				System.out.println(klient);
//				System.out.println(firma);
//				System.out.println(adresFirmy);

			break;
		case "Anuluj":
			WypozyczenieSzczegoly panel2 =(WypozyczenieSzczegoly)wypozyczenie.getWypozyczeniaPanel(1);
			List<Rezerwacja> rezerwacje2= (List<Rezerwacja>) SessionStore.INSTANCE.load("rezerwacjeList");
			Integer currentIndex2 = (Integer) SessionStore.INSTANCE.load("indexRezerwacji");
			Rezerwacja rezerwacja2 = rezerwacje2.get(currentIndex2);
			panel2.setContent(rezerwacja2);

			break;

		case "Dalej" :
				wypozyczenie.setCurrentWypozyczeniaPanel(2);
				WypozyczenieSzczegoly2 panel3 =(WypozyczenieSzczegoly2)wypozyczenie.getWypozyczeniaPanel(2);
				List<Rezerwacja> rezerwacje3= (List<Rezerwacja>) SessionStore.INSTANCE.load("rezerwacjeList");
				Integer currentIndex3 = (Integer) SessionStore.INSTANCE.load("indexRezerwacji");
				Rezerwacja rezerwacja3 = rezerwacje3.get(currentIndex3);
				DaneWypozyczenia dane = rezerwacja3.getDaneWypozyczenia();


				String[] oddzialy = model.getOddzialy();
				List<DaneModeluPojazdu> danePojazdow = model.getDanePojazdow();
				panel3.setOddzialyCombo(oddzialy);
				panel3.setModelListener(new DaneModeluPojazduListener(model, panel3));
				panel3.setComboPojazdy(danePojazdow);
				panel3.addButtonsListeners(new Wypozyczenie3ButtonsListener(model, wypozyczenie));
				System.out.println(dane);
				panel3.setConntent(dane);

			break;

		default:
			break;
		}

	}

}
