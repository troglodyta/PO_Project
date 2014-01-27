package control;

import model.Model;
import FramesComponets.Wypozyczenie;
import FramesComponets.Wypozyczenie1Panel;
import Listeners.ComboMarkiListener;
import Listeners.DataEnableListener;
import Listeners.KartyListener;
import Listeners.RezerwacjeListListener;
import Listeners.WyszukajRezerwacjeListener;

public class WypozyczenieControler extends AbstractContoler {
	
	@Override
	public void act(String operation) {
		switch (operation) {
		case "loadFirstFrame":
			Wypozyczenie wyp = (Wypozyczenie) views.get("Wypozyczenie");
			Model m = models.get("Wypozyczenie");
			Wypozyczenie1Panel firstPanel = (Wypozyczenie1Panel) wyp.getWypozyczeniaPanel("Wypozyczenie1");
			
			firstPanel.getRezerwacjeTable().getSelectionModel().addListSelectionListener(new RezerwacjeListListener(m, wyp));
			firstPanel.getPrzyciskSzukaj().addActionListener(new WyszukajRezerwacjeListener(m,wyp));
			firstPanel.getComboMarka().addItemListener(new ComboMarkiListener(m, wyp));
			firstPanel.getCheckDataUtworzenia().addItemListener(new DataEnableListener(m, wyp));;
			wyp.getKarty().addChangeListener(new KartyListener(m, wyp));
			wyp.setVisible(true);
			break;

		default:
			break;
		}
	}
}