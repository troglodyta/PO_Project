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

public class Umowa {
	public Umowa() {
	}
	
	private int ID;
	
	private java.util.Date dataUmowy;
	
	private String tresc;
	
	private entity.Wypozyczenie wypozyczenie;
	
	private entity.Klient klient;
	
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
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
