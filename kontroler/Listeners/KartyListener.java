package Listeners;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import FramesComponets.Wypozyczenie;
import model.Model;
import model.WypozyczenieModel;
import control.AbstractContoler;
import control.AbstractSingleControler;
import control.Controler;
import entity.*;

public class KartyListener extends AbstractSingleControler implements ChangeListener{
	
	public KartyListener(Model m, Component c) {
		super(m, c);
	}
	private void setTableRows(Wypozyczenie wypozyczenie, WypozyczenieModel model){
		List<Rezerwacja> rezerwacje = model.getWszytkieRezerwacje();
		List<Object[]> rows = new ArrayList<Object[]>(rezerwacje.size());
		for (Rezerwacja r : rezerwacje) {
			Klient k = r.getKlient();
			Pojazd p = r.getDaneWypozyczenia().getPojazd();
			DaneModeluPojazdu daneP = p.getDanePojazdu();
			String status = r.getCzyPotwierdzona() ? "Potwiedzona"
					: "Nie potwierdzona";
			Object[] row = new Object[] {
					r.getID(),
					k.getImie(),
					k.getNazwisko(),
					daneP.getMarka() + " " + daneP.getModel() + " "
					+ daneP.getTyp(),
					r.getDataRezerwacji().toString(), status };
			rows.add(row);
		}
		System.out.println(rows);
		wypozyczenie.setRezerwacjeTable(rows);
	}
	
	private void setComboMarka(Wypozyczenie wypozyczenie, WypozyczenieModel model){
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		Wypozyczenie wypozyczenie = (Wypozyczenie) this.getView();
		WypozyczenieModel model = (WypozyczenieModel)this.getModel();
		switch (wypozyczenie.getKarty().getSelectedIndex()) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3: {
			setTableRows(wypozyczenie, model);
		}
			break;

		default:
			break;
		}
		
	}
	
}

