package control;

import java.awt.EventQueue;
import java.util.HashMap;

import FramesComponets.PrzegladaniePojazdow;
import FramesComponets.Wypozyczenie;
import FramesComponets.WypozyczenieSzczegoly;
import model.RezerwacjaModel;
import model.WypozyczenieModel;

public class MainControler extends AbstractContoler {
	private HashMap<String, Controler> controlers = new HashMap<String, Controler >();
	
	public MainControler() {
		super();
		Controler wypozyczenieC = (Controler) new WypozyczenieControler();
		controlers.put("Wypozyczenie", wypozyczenieC);
		
		wypozyczenieC.addModel("Wypozyczenie", new WypozyczenieModel());
		wypozyczenieC.addView("Wypozyczenie", new Wypozyczenie());
	}
	
	@Override
	public void act(String operation) {
		switch (operation) {
		case "loadFirstFrame":
			Controler c =  controlers.get("Wypozyczenie");
			c.act(operation);
			break;

		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		MainControler mc= new MainControler();
		mc.act("loadFirstFrame");
	}
}	
