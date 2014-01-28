package control;

import java.awt.Component;
import java.util.List;

import javax.swing.JTabbedPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import FramesComponets.Wypozyczenie;
import FramesComponets.Wypozyczenie1Panel;
import FramesComponets.WypozyczenieSzczegoly;
import model.Model;
import model.SessionStore;
import model.WypozyczenieModel;
import entity.Rezerwacja;

public class RezerwacjeListListener extends AbstractSingleControler implements ListSelectionListener {

	public RezerwacjeListListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(!e.getValueIsAdjusting()){
			Wypozyczenie wypozyczenie = (Wypozyczenie) this.getView();
			WypozyczenieModel model = (WypozyczenieModel) this.getModel();
			Wypozyczenie1Panel panel1 = (Wypozyczenie1Panel) wypozyczenie.getWypozyczeniaPanel(0);
			List<Rezerwacja> rezerwacje = (List<Rezerwacja>) SessionStore.INSTANCE.load("rezerwacjeList");
			int index = panel1.getRezerwacjeTable().getSelectedRow();
			if(index > -1){
				Rezerwacja wybrana = rezerwacje.get(index);
				System.out.println(wybrana);
				wypozyczenie.setCurrentWypozyczeniaPanel(1);
				WypozyczenieSzczegoly panelSzczegoly= (WypozyczenieSzczegoly) wypozyczenie.getWypozyczeniaPanel(1);
				String[] countries = model.allCountries();
				panelSzczegoly.setCountries(countries);
				panelSzczegoly.addButtonsListener(new WypozyczenieSzcegolyListener(model, wypozyczenie));
				panelSzczegoly.addEditableListener(new DaneOsoboweEditableListener(model, panelSzczegoly));
				panelSzczegoly.setContent(wybrana);
				panelSzczegoly.setEditable(false);
			}
		}
	}

}
