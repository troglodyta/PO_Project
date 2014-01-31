package control;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import FramesComponets.WypozyczenieSzczegoly3;
import model.Model;

public class WypozyczEnableListener extends AbstractSingleControler implements ItemListener {

	public WypozyczEnableListener(Model model, Component view) {
		super(model, view);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		WypozyczenieSzczegoly3 view = (WypozyczenieSzczegoly3) this.getView();
		view.setWypozyczEnable(view.getPodpisanoUmoweEnable());

	}

}
