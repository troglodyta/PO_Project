package control;

import java.awt.Component;

import model.Model;

public class AbstractSingleControler implements Controler {
	protected Model model;
	protected Component view;
	
	public AbstractSingleControler(Model model, Component view){
		this.model = model;
		this.view = view;
	}
	@Override
	public void addModel(String name, Model model) {
		model = model;		
	}

	@Override
	public boolean removeModel(String name) {
		model = null;
		return true;
	}

	@Override
	public void addView(String name, Component view) {
		view = view;
	}

	@Override
	public boolean removeView(String name) {
		view = null;
		return true;
	}
	
	public Model getModel(){
		return model;
	}
	
	public Component getView(){
		return view;
	}

	@Override
	public void act(String operation) {
		// TODO Auto-generated method stub
		
	}


}

