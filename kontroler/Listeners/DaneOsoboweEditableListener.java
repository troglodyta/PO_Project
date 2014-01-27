package Listeners;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import FramesComponets.Wypozyczenie1Panel;
import FramesComponets.WypozyczenieSzczegoly;
import model.Model;
import control.AbstractSingleControler;

public class DaneOsoboweEditableListener extends AbstractSingleControler implements ItemListener {

	public DaneOsoboweEditableListener(Model model, Component view) {
		super(model, view);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("AAA");
		WypozyczenieSzczegoly panel = (WypozyczenieSzczegoly) this.getView();
		panel.setEditable(panel.isEditable());
		
	}

}
