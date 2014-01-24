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

public class Umowa extends Entity {
	
	private int ID;
	
	private java.util.Date dataUmowy;
	
	private String tresc;
	
	private entity.Wypozyczenie wypozyczenie;
	
	private entity.Klient klient;
	
	public Umowa() {
	}
	
	public Umowa(int iD, Date dataUmowy, String tresc,
			Wypozyczenie wypozyczenie, Klient klient) {
		super();
		ID = iD;
		this.dataUmowy = dataUmowy;
		this.tresc = tresc;
		this.wypozyczenie = wypozyczenie;
		this.klient = klient;
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
	
	public void setDataUmowy(java.util.Date value) {
		this.dataUmowy = value;
	}
	
	public java.util.Date getDataUmowy() {
		return dataUmowy;
	}
	
	public void setTresc(String value) {
		this.tresc = value;
	}
	
	public String getTresc() {
		return tresc;
	}
	
	public void setKlient(entity.Klient value) {
		this.klient = value;
	}
	
	public entity.Klient getKlient() {
		return klient;
	}
	
	public void setWypozyczenie(entity.Wypozyczenie value) {
		this.wypozyczenie = value;
	}
	
	public entity.Wypozyczenie getWypozyczenie() {
		return wypozyczenie;
	}
	
	@Override
	public String toString() {
		return "Umowa [ID=" + ID + ", dataUmowy=" + dataUmowy + ", tresc="
				+ tresc + ", wypozyczenie=" + wypozyczenie + ", klient="
				+ klient + "]";
	}
	
}
