package control;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;

import entity.DaneModeluPojazdu;
import FramesComponets.WypozyczenieSzczegoly2;
import model.Model;
import model.WypozyczenieModel;

public class DaneModeluPojazduListener extends AbstractSingleControler implements ItemListener {

	public DaneModeluPojazduListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		WypozyczenieModel model = (WypozyczenieModel) this.getModel();
		WypozyczenieSzczegoly2 view  = (WypozyczenieSzczegoly2) this.getView();
		String modelPojazdu = (String) e.getItem();
		String[] split = modelPojazdu.split(" ");
		System.out.println(split);
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("marka", split[0]);
		params.put("model", split[1]);
		params.put("typ", split[2]);
		System.out.println(params);
		DaneModeluPojazdu danePojazdu = model.getDaneModeluPojazdu(params);
		System.out.println(danePojazdu);
		view.setDanePojazduTable(danePojazdu);

	}

}
