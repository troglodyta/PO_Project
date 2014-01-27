package Listeners;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import FramesComponets.Wypozyczenie;
import FramesComponets.Wypozyczenie1Panel;
import model.Model;
import model.WypozyczenieModel;
import control.AbstractSingleControler;

public class ComboMarkiListener extends AbstractSingleControler implements ItemListener {

	public ComboMarkiListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Wypozyczenie wypozyczenie =(Wypozyczenie)this.getView();
		Wypozyczenie1Panel firstPanel = (Wypozyczenie1Panel) wypozyczenie.getWypozyczeniaPanel("Wypozyczenie1");
		WypozyczenieModel model = (WypozyczenieModel) this.getModel();
		String selectedMarka = (String) firstPanel.getComboMarka().getSelectedItem();
		String[] modele = model.getModel(selectedMarka);
		JComboBox comboModel = firstPanel.getComboModel();
		
		for (int i = 0; i<comboModel.getItemCount(); i++) {
			comboModel.removeItemAt(0);
		}
		
		for(String s : modele){
			comboModel.addItem(s);
		}
		
		
	}

}
