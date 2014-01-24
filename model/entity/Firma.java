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

public class Firma extends Entity {
	
	private int ID;
	
	private entity.Adres adres;
	
	private String nazwaFirmy;
	
	private String NIP;
	
	public Firma() {
	}

	public Firma(int iD, Adres adres, String nazwaFirmy, String NIP) {
		super();
		ID = iD;
		this.adres = adres;
		this.nazwaFirmy = nazwaFirmy;
		this.NIP = NIP;
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
	
	public void setNazwaFirmy(String value) {
		this.nazwaFirmy = value;
	}
	
	public String getNazwaFirmy() {
		return nazwaFirmy;
	}
	
	public void setNIP(String value) {
		this.NIP = value;
	}
	
	public String getNIP() {
		return NIP;
	}
	
	public void setAdres(entity.Adres value) {
		this.adres = value;
	}
	
	public entity.Adres getAdres() {
		return adres;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
