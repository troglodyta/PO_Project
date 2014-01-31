package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JOptionPane;

import entity.DaneWypozyczenia;
import entity.Rezerwacja;
import FramesComponets.Wypozyczenie;
import FramesComponets.WypozyczenieSzczegoly3;
import model.Model;
import model.SessionStore;
import model.WypozyczenieModel;

public class Wypozyczenie3ButtonsListener extends AbstractSingleControler implements ActionListener {

	public Wypozyczenie3ButtonsListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				Wypozyczenie view = (Wypozyczenie) getView();
				WypozyczenieModel model = (WypozyczenieModel) getModel();
				switch (e.getActionCommand()) {
				case "Powrót":
					view.setCurrentWypozyczeniaPanel(1);

					break;
				case "Dalej":
						List<Rezerwacja> rezerwacje= (List<Rezerwacja>) SessionStore.INSTANCE.load("rezerwacjeList");
						Integer currentIndex = (Integer) SessionStore.INSTANCE.load("indexRezerwacji");
						Rezerwacja rezerwacja = rezerwacje.get(currentIndex);
						DaneWypozyczenia dane = rezerwacja.getDaneWypozyczenia();
						if(dane.getWplaconaZaliczka()>=(dane.getPlatnosc()*0.25) && dane.getWplaconaKaucja()>=dane.getKaucja()){
						String umowa = model.generujUmowe(rezerwacja.getDaneWypozyczenia(), rezerwacja.getKlient());
						System.out.println(umowa);
						SessionStore.INSTANCE.store("umowa", umowa);
						view.setCurrentWypozyczeniaPanel(3);
						final WypozyczenieSzczegoly3 panel3 = (WypozyczenieSzczegoly3) view.getWypozyczeniaPanel(3);
						panel3.addButtonsListeners(new Wypozyczenie4ButtonListener(model, view));
						panel3.setContent(rezerwacja.getDaneWypozyczenia().getPojazd());
						panel3.addPodpisanoUmoweListener(new WypozyczEnableListener(model, panel3));
					panel3.setUmowa(umowa);
				}
				else{
					JOptionPane.showMessageDialog(this.getView(),"Klient musi wp³aciæ zaliczkê oraz kaucje aby dokonaæ rezerwacji");
				}
					break;

				default:
					break;
				}

	}

}
