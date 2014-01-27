package Listeners;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import FramesComponets.Wypozyczenie;
import FramesComponets.Wypozyczenie1Panel;
import model.Model;
import model.SessionStore;
import model.WypozyczenieModel;
import control.AbstractContoler;
import control.AbstractSingleControler;
import control.Controler;
import entity.*;

public class KartyListener extends AbstractSingleControler implements ChangeListener{
	
	public KartyListener(Model m, Component c) {
		super(m, c);
	}
	private void setTableRows(Wypozyczenie1Panel wypozyczenie, WypozyczenieModel model){
		List<Rezerwacja> rezerwacje = model.getWszytkieRezerwacje();
		
		wypozyczenie.setRezerwacjeTable(rezerwacje);
		SessionStore.INSTANCE.store("rezerwacjeList", rezerwacje);
	}
	
	private void setComboMarka(Wypozyczenie1Panel wypozyczenie, WypozyczenieModel model){
		String[] marki = model.getWszystkieMarki();
		JComboBox comboMarki = wypozyczenie.getComboMarka();
		
		for (int i = 0; i<comboMarki.getItemCount(); i++) {
			comboMarki.removeItemAt(0);
		}
		comboMarki.addItem("");
		for(String s : marki){
			comboMarki.addItem(s);
		}
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		Wypozyczenie wypozyczenie = (Wypozyczenie) this.getView();
		Wypozyczenie1Panel panel1 = (Wypozyczenie1Panel) wypozyczenie.getWypozyczeniaPanel(0);
		WypozyczenieModel model = (WypozyczenieModel)this.getModel();
		switch (wypozyczenie.getKarty().getSelectedIndex()) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3: {
			setTableRows(panel1, model);
			setComboMarka(panel1, model);
		}
			break;

		default:
			break;
		}
		
	}
	
	@Override
	public void act(String operation) {
		// TODO Auto-generated method stub
		super.act(operation);
	}
	
}

