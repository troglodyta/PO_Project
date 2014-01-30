package control;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import model.Model;

public class DaneModeluPojazduListener extends AbstractSingleControler implements ItemListener {

	public DaneModeluPojazduListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String model = (String) e.getItem();
		System.out.println(model);

	}

}
