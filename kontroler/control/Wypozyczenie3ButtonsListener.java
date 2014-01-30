package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import FramesComponets.Wypozyczenie;
import model.Model;

public class Wypozyczenie3ButtonsListener extends AbstractSingleControler implements ActionListener {

	public Wypozyczenie3ButtonsListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				Wypozyczenie view = (Wypozyczenie) getView();
				switch (e.getActionCommand()) {
				case "Powrót":
					view.setCurrentWypozyczeniaPanel(1);

					break;

				default:
					break;
				}

	}

}
