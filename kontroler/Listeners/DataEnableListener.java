package Listeners;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import FramesComponets.Wypozyczenie;
import model.Model;
import control.AbstractContoler;
import control.AbstractSingleControler;

public class DataEnableListener extends AbstractSingleControler implements ItemListener {
	
	
	public DataEnableListener(Model model, Component view) {
		super(model, view);
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		Wypozyczenie wyp = (Wypozyczenie) this.getView();
		boolean state = wyp.getCheckDataUtworzenia().isSelected();
		wyp.getDataDo().setEnabled(state);
		wyp.getDataOd().setEnabled(state);
		
	}

}
