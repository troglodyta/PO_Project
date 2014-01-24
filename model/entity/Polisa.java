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

import java.util.Date;

public class Polisa extends Entity {
	
	private int ID;
	
	private String numerPolisy;
	
	private java.util.Date dataUbezpieczenia;
	
	private entity.Ubezpieczyciel ubezpieczyciel;
	
	public Polisa() {
	}
	
	public Polisa(int iD, String numerPolisy, Date dataUbezpieczenia,
			Ubezpieczyciel ubezpieczyciel) {
		super();
		ID = iD;
		this.numerPolisy = numerPolisy;
		this.dataUbezpieczenia = dataUbezpieczenia;
		this.ubezpieczyciel = ubezpieczyciel;
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
	
	public void setNumerPolisy(String value) {
		this.numerPolisy = value;
	}
	
	public String getNumerPolisy() {
		return numerPolisy;
	}
	
	public void setDataUbezpieczenia(java.util.Date value) {
		this.dataUbezpieczenia = value;
	}
	
	public java.util.Date getDataUbezpieczenia() {
		return dataUbezpieczenia;
	}
	
	public void setUbezpieczyciel(entity.Ubezpieczyciel value) {
		this.ubezpieczyciel = value;
	}
	
	public entity.Ubezpieczyciel getUbezpieczyciel() {
		return ubezpieczyciel;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
