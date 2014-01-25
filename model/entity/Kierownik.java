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

public class Kierownik extends entity.Pracownik {
	
	private entity.Oddzial odzial;
	
	private entity.Szef awansujacy;
	
	public Kierownik() {
	}
	
	public Kierownik(int iD, Adres adres, String imie, String nazwisko,
			String email, Date dataUrodzenia, String plec, String numerKonta,
			Date dataZatrudnienia, String login, String haslo,
			Szef zatrudniajacy, Szef awansujacy, Oddzial odzial) {
		super(iD, adres, imie, nazwisko, email, dataUrodzenia, plec,
				numerKonta, dataZatrudnienia, login, haslo, zatrudniajacy);
		this.awansujacy = awansujacy;
		this.odzial = odzial;
	}
	
	public void setAwansujacy(entity.Szef value) {
		this.awansujacy = value;
	}
	
	public entity.Szef getAwansujacy() {
		return awansujacy;
	}
	
	public void setOdzial(entity.Oddzial value) {
		this.odzial = value;
	}
	
	public entity.Oddzial getOdzial() {
		return odzial;
	}
	
	@Override
	public String toString() {
		return " Kierownik [awansujacy=" + awansujacy + "]";
	}
	
}
