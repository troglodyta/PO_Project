package control;

import java.awt.Component;
import java.util.HashMap;

import model.*;

public abstract class AbstractContoler implements Controler {

	protected HashMap<String, Model> models = new HashMap<String, Model>();
	protected HashMap<String, Component> views = new HashMap<String, Component>();
	
	
	/**
	 * 
	 * @param name
	 * @param modelPojazdy
	 */
	public AbstractContoler() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstractContoler(Model m, Component c){
		System.out.println(m.getClass().getCanonicalName());
		models.put(m.getClass().getCanonicalName(), m);
		views.put(c.getClass().getCanonicalName(), c);
	}
	
	public void addModel(String name, Model model) {
		models.put(name, model);
	}

	/**
	 * 
	 * @param name
	 */
	public boolean removeModel(String name) {
		return models.remove(name) != null;
	}

	/**
	 * 
	 * @param name
	 * @param view
	 */
	public void addView(String name, Component view) {
		views.put(name, view);
	}

	/**
	 * 
	 * @param name
	 */
	public boolean removeView(String name) {
		return views.remove(name) != null;
	}

	/**
	 * 
	 * @param operation
	 */
	public void act(String operation) {
		// TODO - implement AbstractContoler.act
		throw new UnsupportedOperationException();
	}

}