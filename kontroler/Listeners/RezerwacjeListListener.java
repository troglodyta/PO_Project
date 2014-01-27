package Listeners;

import java.awt.Component;
import java.util.List;

import javax.swing.JTabbedPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import FramesComponets.Wypozyczenie;
import model.Model;
import model.SessionStore;
import control.AbstractSingleControler;
import entity.Rezerwacja;

public class RezerwacjeListListener extends AbstractSingleControler implements ListSelectionListener {

	public RezerwacjeListListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(!e.getValueIsAdjusting()){
			Wypozyczenie wypozyczenie = (Wypozyczenie) this.getView();
			List<Rezerwacja> rezerwacje = (List<Rezerwacja>) SessionStore.INSTANCE.load("rezerwacjeList");
			int index = wypozyczenie.getRezerwacjeTable().getSelectedRow();
			if(index > -1){
				Rezerwacja wybrana = rezerwacje.get(index);
				System.out.println(wybrana);
			}
		}
	}

}
