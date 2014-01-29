package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import entity.Rezerwacja;
import FramesComponets.Wypozyczenie;
import FramesComponets.WypozyczenieSzczegoly;
import model.Model;
import model.SessionStore;

public class WypozyczenieSzcegolyListener extends AbstractSingleControler implements ActionListener {

	public WypozyczenieSzcegolyListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		Wypozyczenie wypozyczenie = (Wypozyczenie) this.getView();
		switch (command) {
		case "Powrót":
				wypozyczenie.setCurrentWypozyczeniaPanel(0);
			break;
		case "Zapisz" :
				WypozyczenieSzczegoly panel =(WypozyczenieSzczegoly)wypozyczenie.getWypozyczeniaPanel(1);
				List<Rezerwacja> rezerwacje = (List<Rezerwacja>) SessionStore.INSTANCE.load("rezerwacjeList");
				Integer currentIndex = (Integer) SessionStore.INSTANCE.load("indexRezerwacji");
				Rezerwacja rezerwacja = rezerwacje.get(currentIndex);
				System.out.println(panel.getFildsValue());
				System.out.println("Powrot");

//				Klient klient = rez.getKlient();
//				txtImi.setText(klient.getImie());
//				Adres adres = klient.getAdres();
//				txtNazwisko.setText(klient.getNazwisko());
//				txtUlica.setText(adres.getUlica());
//				txtKodPocztowy.setText(adres.getKodPocztowy());
//				txtMiejscowo.setText(adres.getMiejscowosc());
//				txtNrTelefonu.setText(klient.getNumerTelefonu());
//				txtEmail.setText(klient.getEmail());
//				if(!klient.getFirmy().isEmpty()){
//					checkNajemFirmowy.setSelected(true);
//					Firma firma = (Firma) klient.getFirmy().toArray()[0];
//					txtNazwaFirmy.setText(firma.getNazwaFirmy());
//					Adres adresFirmy = firma.getAdres();
//					txtUlica_1.setText(adresFirmy.getUlica());
//					txtKodPocztowy_1.setText(adresFirmy.getKodPocztowy());
//					txtMiejscowo_1.setText(adresFirmy.getMiejscowosc());
//					txtNrNip.setText(firma.getNIP());
//				}
//				txtKrajWydania.setSelectedItem(klient.getKrajWydaniaPrawaJazdy());
//				datePanel.setDate(klient.getDataUrodzenia());
//				txtNumerPrawaJazdy.setText(klient.getNumerPrawaJazdy());
//				txtUwagi.setText(rez.getUwagi());
//				int plecIndex = klient.getPlec().equals("M")? 0 : 1;
//				comboPlec.setSelectedIndex(plecIndex);
			break;

		default:
			break;
		}

	}

}
