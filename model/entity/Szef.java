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

public class Szef extends entity.Osoba {
	
	private String numerKonta;
	
	private String login;
	
	private String haslo;
	
	public Szef() {
	}
	
	public Szef(int iD, Adres adres, String imie, String nazwisko,
			String email, java.util.Date dataUrodzenia, String plec, String numerKonta,
			String login, String haslo) {
		super(iD, adres, imie, nazwisko, email, dataUrodzenia, plec);
		this.numerKonta = numerKonta;
		this.login = login;
		this.haslo = haslo;
	}
	
	public void setNumerKonta(String value) {
		this.numerKonta = value;
	}
	
	public String getNumerKonta() {
		return numerKonta;
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
	
	@Override
	public String toString() {
		return "Szef [numerKonta=" + numerKonta + ", login=" + login
				+ ", haslo=" + haslo + "]";
	}
	
}
