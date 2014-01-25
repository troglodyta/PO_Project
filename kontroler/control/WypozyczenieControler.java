package control;

import model.Model;
import FramesComponets.Wypozyczenie;
import Listeners.DataEnableListener;
import Listeners.KartyListener;

public class WypozyczenieControler extends AbstractContoler {
	
	@Override
	public void act(String operation) {
		switch (operation) {
		case "loadFirstFrame":
			Wypozyczenie wyp = (Wypozyczenie) views.get("Wypozyczenie");
			Model m = models.get("Wypozyczenie");
			wyp.getCheckDataUtworzenia().addItemListener(new DataEnableListener(m, wyp));;
			wyp.getKarty().addChangeListener(new KartyListener(m, wyp));
			wyp.setVisible(true);
			break;

		default:
			break;
		}
	}
}