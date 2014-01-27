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

public abstract class Osoba extends Entity {
	
	private int ID;
	
	private entity.Adres adres;
	
	private String imie;
	
	private String nazwisko;
	
	private String email;
	
	private java.util.Date dataUrodzenia;
	
	private String plec;
	
	private String numerTelefonu;
	
	public Osoba() {
	}
	
	public Osoba(int iD, Adres adres, String imie, String nazwisko,
			String email, java.util.Date dataUrodzenia, String plec, String numerTelefonu) {
		super();
		ID = iD;
		this.adres = adres;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.email = email;
		this.dataUrodzenia = dataUrodzenia;
		this.plec = plec;
		this.numerTelefonu = numerTelefonu;
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
	
	public String getNumerTelefonu() {
		return numerTelefonu;
	}
	
	public void setNumerTelefonu(String numerTelefonu) {
		this.numerTelefonu = numerTelefonu;
	}
	
	public void setImie(String value) {
		this.imie = value;
	}
	
	public String getImie() {
		return imie;
	}
	
	public void setNazwisko(String value) {
		this.nazwisko = value;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setDataUrodzenia(java.util.Date value) {
		this.dataUrodzenia = value;
	}
	
	public java.util.Date getDataUrodzenia() {
		return dataUrodzenia;
	}
	
	public void setPlec(String value) {
		this.plec = value;
	}
	
	public String getPlec() {
		return plec;
	}
	
	public void setAdres(entity.Adres value) {
		this.adres = value;
	}
	
	public entity.Adres getAdres() {
		return adres;
	}
	
	public void setDataUrodzenia(String dataUrodzenia) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String toString() {
		return "Osoba [ID=" + ID + ", adres=" + adres + ", imie=" + imie
				+ ", nazwisko=" + nazwisko + ", email=" + email
				+ ", dataUrodzenia=" + dataUrodzenia + ", plec=" + plec + ", numerTelefonu=" + numerTelefonu + "]";
	}
	
}
