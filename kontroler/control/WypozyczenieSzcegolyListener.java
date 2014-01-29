package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;

import entity.*;
import FramesComponets.Wypozyczenie;
import FramesComponets.WypozyczenieSzczegoly;
import model.DBManager;
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
				HashMap<String, Object>[] fildsValues = panel.getFildsValue();
				HashMap<String, Object> daneKlienta = fildsValues[0];
				HashMap<String, Object> daneFirmy= fildsValues[1];
				System.out.println(fildsValues[0]);
				System.out.println(fildsValues[1]);
				rezerwacja.setUwagi((String)daneKlienta.get("uwagi"));

				Klient klient = rezerwacja.getKlient();
				klient.setFields(daneKlienta);

				Adres adresKlienta = klient.getAdres();
				adresKlienta.setFields(daneKlienta);

				Firma firma = rezerwacja.getDaneWypozyczenia().getFirma();
				firma.setFields(daneFirmy);

				Adres adresFirmy = firma.getAdres();
				adresFirmy.setFields(daneFirmy);
				System.out.println(rezerwacja);
				System.out.println(klient);
				System.out.println(firma);
				System.out.println(adresFirmy);
				DBManager.INSTANCE.updateEntity(rezerwacja);

			break;

		default:
			break;
		}

	}

}
