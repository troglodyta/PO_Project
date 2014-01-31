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

public class Oddzial extends Entity {

	private int ID;

	private entity.Adres adres;

	private String telefon;

	private String email;

	private entity.Kierownik kierownik;

	public Oddzial() {
	}

	public Oddzial(int iD, Adres adres, String telefon, String email,
			Kierownik kierownik) {
		super();
		ID = iD;
		this.adres = adres;
		this.telefon = telefon;
		this.email = email;
		this.kierownik = kierownik;
	}

	public void setID(int value) {
		this.ID = value;
	}

	public int getID() {
		return ID;
	}

	public int getORMID() {
		return getID();
	}

	public void setTelefon(String value) {
		if(value.matches("[0-9]+"))
		this.telefon = value;
		else
			throw new IllegalArgumentException("W numerze telefonu musz� by� cyfry");
	}

	public String getTelefon() {
		return telefon;
	}

	public void setEmail(String value) {
		if(value.matches("[a-zA-Z0-9_.]+@[a-zA-Z0-9_.]+[.][a-z]{2,4}"))
		this.email = value;
		else
			throw new IllegalArgumentException("Przyk�ad prawid�owego emaila: jan.kowalski@gmail.com");
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

	@Override
	public String toString() {
		return "Oddzial [ID=" + ID + ", adres=" + adres + ", telefon="
				+ telefon + ", email=" + email + ", kierownik=" + kierownik
				+ "]";
	}

}
