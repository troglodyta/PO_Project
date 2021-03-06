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

public class Ubezpieczyciel extends Entity {
	
	private int ID;
	
	private entity.Adres adres;
	
	private String nazwaUbezpieczyciela;
	
	private String telefon;
	
	private String email;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public Ubezpieczyciel() {
	}
	
	public Ubezpieczyciel(int iD, Adres adres, String nazwaUbezpieczyciela,
			String telefon, String email) {
		super();
		ID = iD;
		this.adres = adres;
		this.nazwaUbezpieczyciela = nazwaUbezpieczyciela;
		this.telefon = telefon;
		this.email = email;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNazwaUbezpieczyciela(String value) {
		this.nazwaUbezpieczyciela = value;
	}
	
	public String getNazwaUbezpieczyciela() {
		return nazwaUbezpieczyciela;
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
	
	@Override
	public String toString() {
		return "Ubezpieczyciel [ID=" + ID + ", adres=" + adres
				+ ", nazwaUbezpieczyciela=" + nazwaUbezpieczyciela
				+ ", telefon=" + telefon + ", email=" + email + "]";
	}
	
}
