package control;

import java.awt.Component;

import model.Model;

public interface Controler {
	public void addModel(String name, Model model);


	/**
	 * 
	 * @param name
	 */
	public boolean removeModel(String name) ;


	/**
	 * 
	 * @param name
	 * @param view
	 */
	public void addView(String name, Component view);

	/**
	 * 
	 * @param name
	 */
	public boolean removeView(String name);

	/**
	 * 
	 * @param operation
	 */
	public void act(String operation);
	
}
