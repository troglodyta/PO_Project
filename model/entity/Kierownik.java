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

public class Kierownik extends entity.Pracownik {
	public Kierownik() {
	}
	
	private entity.Oddzial odzial;
	
	private entity.Szef awansujacy;
	
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
	
	public String toString() {
		return super.toString();
	}
	
}
