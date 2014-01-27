package Listeners;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import FramesComponets.Wypozyczenie;
import model.Model;
import model.SessionStore;
import model.WypozyczenieModel;
import control.AbstractSingleControler;
import entity.Rezerwacja;

public class WyszukajRezerwacjeListener extends AbstractSingleControler implements ActionListener {

	public WyszukajRezerwacjeListener(Model model, Component view) {
		super(model, view);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Wypozyczenie view = (Wypozyczenie)this.getView();
		WypozyczenieModel mod = (WypozyczenieModel) this.getModel();
		HashMap<String, Object> params = new HashMap<String, Object>();
		String idRezerwacji = (view.getTextNrRezerwacji().getText());
		String imie = view.getTextImie().getText();
		String nazwisko = view.getTextNazwisko().getText();
		String marka = (String) view.getComboMarka().getSelectedItem();
		String model = (String) view.getComboModel().getSelectedItem();
		Date dataOd = null;
		Date dataDo = null;
		Boolean status = null;
		
		if(!view.getRadioWszystkie().isSelected()){
			status = view.getRadioPotwierdzone().isSelected();
		}
		
		if(view.getCheckDataUtworzenia().isSelected()){
			dataOd = view.getDataOd().getDate();
			dataDo = view.getDataDo().getDate();
		}
		
		if(idRezerwacji!=null && idRezerwacji.length()>0)
			params.put("idRezerwacji", Integer.parseInt(idRezerwacji));
		if(imie!=null && imie.length()>0)
			params.put("imie", imie);
		if(nazwisko!=null && nazwisko.length()>0)
			params.put("nazwisko", nazwisko);
		if(marka!=null && marka.length()>0)
			params.put("marka", marka);
		if(model!=null && model.length()>0)
			params.put("model", model);
		if(dataOd!=null)
			params.put("dataOd", dataOd);
		if(dataDo!=null)
			params.put("dataDo", dataDo);
		if(status!=null)
			params.put("status", status);
		
		List<Rezerwacja> rez = mod.getRezerwacjeByConditions(params);
		view.setRezerwacjeTable(rez);
		SessionStore.INSTANCE.store("rezerwacjeList", rez);
		
	}

}
