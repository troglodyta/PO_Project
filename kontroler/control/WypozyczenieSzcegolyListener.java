package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import FramesComponets.Wypozyczenie;
import model.Model;

public class WypozyczenieSzcegolyListener extends AbstractSingleControler implements ActionListener {

	public WypozyczenieSzcegolyListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Wypozyczenie wypozyczenie = (Wypozyczenie) this.getView();
		wypozyczenie.setCurrentWypozyczeniaPanel(0);

	}

}
