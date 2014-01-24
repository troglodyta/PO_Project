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

public class Oddzial {
	public Oddzial() {
	}
	
	private int ID;
	
	private entity.Adres adres;
	
	private String telefon;
	
	private String email;
	
	private entity.Kierownik kierownik;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTelefon(String value) {
		this.telefon = value;
	}
	
	public String getTelefon() {
		return telefon;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setAdres(entity.Adres value) {
		this.adres = value;
	}
	
	public entity.Adres getAdres() {
		return adres;
	}
	
	public void setKierownik(entity.Kierownik value) {
		this.kierownik = value;
	}
	
	public entity.Kierownik getKierownik() {
		return kierownik;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
