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

import java.util.Calendar;

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

	public void setID(int value) {
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
		if(value.matches("[A-¥ÊÓ£Œ¯Ñ]{1}[a-z¹êó³œ¿Ÿæñ]+"))
			this.imie = value;
		else
			throw new IllegalArgumentException("Imiê zaczyna siê z du¿ej literu i sk³ada siê z ci¹gu znaków alfabetu");
	}

	public String getImie() {
		return imie;
	}

	public void setNazwisko(String value) {
		if(value.matches("[A-¥ÊÓ£Œ¯Ñ]{1}[a-z¹êó³œ¿Ÿæñ]+|[A-¥ÊÓ£Œ¯Ñ]{1}[a-z¹êó³œ¿Ÿæñ]+[-]{1}[A-¥ÊÓ£Œ¯Ñ]{1}[a-z¹êó³œ¿Ÿæñ]+"))
			this.nazwisko = value;
		else
			throw new IllegalArgumentException("Nazwisko zaczyna siê z du¿ej literu i sk³ada siê z ci¹gu znaków alfabetu oraz myœlnika");
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setEmail(String value) {
		//if(value.matches("[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4}"))
			this.email = value;
		//else
			//throw new IllegalArgumentException("Przyk³ad prawid³owego emaila: jan.kowalski@gmail.com");
	}

	public String getEmail() {
		return email;
	}

	public void setDataUrodzenia(java.util.Date value) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, -18);
		if(value.before(c.getTime()))
			this.dataUrodzenia = value;
		else
			throw new IllegalArgumentException("U¿ytkownik systemu musi byæ pe³noletni");
	}

	public java.util.Date getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setPlec(String value) {
		if(value.equals("K") || value.equals("M"))
			this.plec = value;
		else
			throw new IllegalArgumentException("Dopuszczalna wartoœæ K lub M");
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

	@Override
	public String toString() {
		return "Osoba [ID=" + ID + ", adres=" + adres + ", imie=" + imie
				+ ", nazwisko=" + nazwisko + ", email=" + email
				+ ", dataUrodzenia=" + dataUrodzenia + ", plec=" + plec + ", numerTelefonu=" + numerTelefonu + "]";
	}

}
