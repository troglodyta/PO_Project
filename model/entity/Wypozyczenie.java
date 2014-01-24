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

public class Wypozyczenie extends Entity {
	
	private int ID;
	
	private entity.Pracownik potwierdzajacy;
	
	private entity.DaneWypozyczenia daneWypozyczenia;
	
	private java.util.Date dataZwrotu;
	
	private double wplaconaPlatnosc;
	
	private entity.Umowa umowa;
	
	public Wypozyczenie() {
	}
	
	public Wypozyczenie(int iD, DaneWypozyczenia daneWypozyczenia,
			Pracownik potwierdzajacy, Date dataZwrotu, double wplaconaPlatnosc,
			Umowa umowa) {
		super();
		ID = iD;
		this.daneWypozyczenia = daneWypozyczenia;
		this.potwierdzajacy = potwierdzajacy;
		this.dataZwrotu = dataZwrotu;
		this.wplaconaPlatnosc = wplaconaPlatnosc;
		this.umowa = umowa;
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
	
	public void setDataZwrotu(java.util.Date value) {
		this.dataZwrotu = value;
	}
	
	public java.util.Date getDataZwrotu() {
		return dataZwrotu;
	}
	
	public void setWplaconaPlatnosc(double value) {
		this.wplaconaPlatnosc = value;
	}
	
	public double getWplaconaPlatnosc() {
		return wplaconaPlatnosc;
	}
	
	public void setPotwierdzajacy(entity.Pracownik value) {
		this.potwierdzajacy = value;
	}
	
	public entity.Pracownik getPotwierdzajacy() {
		return potwierdzajacy;
	}
	
	public entity.Klient getKlient() {
		if(umowa != null) {
			return umowa.getKlient();
		}
		else {
			return null;
		}
	}
	
	public void removeKlient() {
		if(umowa!= null) {
			umowa.setKlient(null);
			this.setUmowa(null);
		}
	}
	
	public void addKlient(entity.Umowa aUmowa, entity.Klient aKlient) {
		this.setUmowa(aUmowa);
		aUmowa.setKlient(aKlient);
	}
	
	public void setUmowa(entity.Umowa value) {
		this.umowa = value;
	}
	
	public entity.Umowa getUmowa() {
		return umowa;
	}
	
	public void setDaneWypozyczenia(entity.DaneWypozyczenia value) {
		this.daneWypozyczenia = value;
	}
	
	public entity.DaneWypozyczenia getDaneWypozyczenia() {
		return daneWypozyczenia;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
