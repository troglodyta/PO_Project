/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package entity;

import java.util.HashMap;

public class Adres extends Entity {
	private int ID;
	
	private String ulica;
	
	private String kodPocztowy;
	
	private String miejscowosc;
	
	public Adres() {
	}
	
	public Adres(HashMap<String, Object> args){
		this((Integer)args.get("ID"), (String)args.get("ulica"), (String)args.get("kodPocztowy"), (String)args.get("miejscowosc"));
	}
	
	public Adres(int iD, String ulica, String kodPocztowy, String miejscowosc) {
		super();
		ID = iD;
		this.ulica = ulica;
		this.kodPocztowy = kodPocztowy;
		this.miejscowosc = miejscowosc;
	}
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setUlica(String value) {
		this.ulica = value;
	}
	
	public String getUlica() {
		return ulica;
	}
	
	public void setKodPocztowy(String value) {
		this.kodPocztowy = value;
	}
	
	public String getKodPocztowy() {
		return kodPocztowy;
	}
	
	public void setMiejscowosc(String value) {
		this.miejscowosc = value;
	}
	
	public String getMiejcowosc() {
		return miejscowosc;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
