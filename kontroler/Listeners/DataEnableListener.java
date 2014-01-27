package Listeners;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import FramesComponets.Wypozyczenie;
import FramesComponets.Wypozyczenie1Panel;
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
		Wypozyczenie1Panel firstPanel = (Wypozyczenie1Panel) wyp.getWypozyczeniaPanel("Wypozyczenie1");
		boolean state = firstPanel.getCheckDataUtworzenia().isSelected();
		firstPanel.getDataDo().setEnabled(state);
		firstPanel.getDataOd().setEnabled(state);
		
	}

}
