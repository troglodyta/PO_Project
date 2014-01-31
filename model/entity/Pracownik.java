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

public class Pracownik extends entity.Osoba {
	
	private String numerKonta;
	
	private java.util.Date dataZatrudnienia;
	
	private String login;
	
	private String haslo;
	
	private entity.Szef zatrudniajacy;
	
	public Pracownik() {
	}
	
	public Pracownik(int iD, Adres adres, String imie, String nazwisko,
			String email, java.util.Date  dataUrodzenia, String plec, String numerKonta,
			Date dataZatrudnienia, String login, String haslo,
			Szef zatrudniajacy, String numerTelefonu) {
		super(iD, adres, imie, nazwisko, email, dataUrodzenia, plec, numerTelefonu);
		this.numerKonta = numerKonta;
		this.dataZatrudnienia = dataZatrudnienia;
		this.login = login;
		this.haslo = haslo;
		this.zatrudniajacy = zatrudniajacy;
	}
	
	public void setNumerKonta(String value) {
		this.numerKonta = value;
	}
	
	public String getNumerKonta() {
		return numerKonta;
	}
	
	public void setDataZatrudnienia(java.util.Date value) {
		this.dataZatrudnienia = value;
	}
	
	public java.util.Date getDataZatrudnienia() {
		return dataZatrudnienia;
	}
	
	public void setLogin(String value) {
		this.login = value;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setHaslo(String value) {
		this.haslo = value;
	}
	
	public String getHaslo() {
		return haslo;
	}
	
	public void setZatrudniajacy(entity.Szef value) {
		this.zatrudniajacy = value;
	}
	
	public entity.Szef getZatrudniajacy() {
		return zatrudniajacy;
	}
	
	@Override
	public String toString() {
		return "Pracownik [numerKonta=" + numerKonta + ", dataZatrudnienia="
				+ dataZatrudnienia + ", login=" + login + ", haslo=" + haslo
				+ ", zatrudniajacy=" + zatrudniajacy + "]";
	}
	
}
