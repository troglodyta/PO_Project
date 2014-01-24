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

public class Akcesoria  extends Entity {
	
	private int ID;
	
	private entity.Oddzial oddzial;
	
	private String nazwaAkcesorium;
	
	private double cenaWypozyczenia;
	
	public Akcesoria() {
	}
	
	public Akcesoria(int iD, Oddzial oddzial, String nazwaAkcesorium,
			double cenaWypozyczenia) {
		super();
		ID = iD;
		this.oddzial = oddzial;
		this.nazwaAkcesorium = nazwaAkcesorium;
		this.cenaWypozyczenia = cenaWypozyczenia;
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
	
	public void setNazwaAkcesorium(String value) {
		this.nazwaAkcesorium = value;
	}
	
	public String getNazwaAkcesorium() {
		return nazwaAkcesorium;
	}
	
	public void setCenaWypozyczenia(double value) {
		this.cenaWypozyczenia = value;
	}
	
	public double getCenaWypozyczenia() {
		return cenaWypozyczenia;
	}
	
	public void setOddzial(entity.Oddzial value) {
		this.oddzial = value;
	}
	
	public entity.Oddzial getOddzial() {
		return oddzial;
	}
	
	@Override
	public String toString() {
		return "Akcesoria [ID=" + ID + ", oddzial=" + oddzial
				+ ", nazwaAkcesorium=" + nazwaAkcesorium
				+ ", cenaWypozyczenia=" + cenaWypozyczenia + "]";
	}
	
}
