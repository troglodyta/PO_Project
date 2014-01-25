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

import java.util.Set;

public class Klient extends entity.Osoba {
	
	private String numerPrawaJazdy;
	
	private String krajWydaniaPrawaJazdy;
	
	private double znizka;
	
	private java.util.Set rezerwacje = new java.util.HashSet();
	
	private java.util.Set umowas = new java.util.HashSet();
	
	private java.util.Set firmy = new java.util.HashSet();
	
	public Klient() {
	}
	
	public Klient(String numerPrawaJazdy, String krajWydaniaPrawaJazdy,
			double znizka, Set rezerwacje, Set umowas, Set firmy) {
		super();
		this.numerPrawaJazdy = numerPrawaJazdy;
		this.krajWydaniaPrawaJazdy = krajWydaniaPrawaJazdy;
		this.znizka = znizka;
		this.rezerwacje = rezerwacje;
		this.umowas = umowas;
		this.firmy = firmy;
	}
	
	public void setNumerPrawaJazdy(String value) {
		this.numerPrawaJazdy = value;
	}
	
	public String getNumerPrawaJazdy() {
		return numerPrawaJazdy;
	}
	
	public void setKrajWydaniaPrawaJazdy(String value) {
		this.krajWydaniaPrawaJazdy = value;
	}
	
	public String getKrajWydaniaPrawaJazdy() {
		return krajWydaniaPrawaJazdy;
	}
	
	public void setZnizka(double value) {
		this.znizka = value;
	}
	
	public double getZnizka() {
		return znizka;
	}
	
	public void setRezerwacje(java.util.Set value) {
		this.rezerwacje = value;
	}
	
	public java.util.Set getRezerwacje() {
		return rezerwacje;
	}
	
	
	public entity.Wypozyczenie[] getWypozyczenies() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = umowas.iterator();lIter.hasNext();) {
			lValues.add(((entity.Umowa)lIter.next()).getWypozyczenie());
		}
		return (entity.Wypozyczenie[])lValues.toArray(new entity.Wypozyczenie[lValues.size()]);
	}
	
	public void removeWypozyczenie(entity.Wypozyczenie aWypozyczenie) {
		entity.Umowa[] lUmowas = (entity.Umowa[])umowas.toArray(new entity.Umowa[umowas.size()]);
		for(int i = 0; i < lUmowas.length; i++) {
			if(lUmowas[i].getWypozyczenie().equals(aWypozyczenie)) {
				umowas.remove(lUmowas[i]);
			}
		}
	}
	
	public void addWypozyczenie(entity.Umowa aUmowa, entity.Wypozyczenie aWypozyczenie) {
		aUmowa.setWypozyczenie(aWypozyczenie);
		umowas.add(aUmowa);
	}
	
	public entity.Umowa getUmowaByWypozyczenie(entity.Wypozyczenie aWypozyczenie) {
		entity.Umowa[] lUmowas = (entity.Umowa[])umowas.toArray(new entity.Umowa[umowas.size()]);
		for(int i = 0; i < lUmowas.length; i++) {
			if(lUmowas[i].getWypozyczenie().equals(aWypozyczenie)) {
				return lUmowas[i];
			}
		}
		return null;
	}
	
	public void setUmowas(java.util.Set value) {
		this.umowas = value;
	}
	
	public java.util.Set getUmowas() {
		return umowas;
	}
	
	
	public void setFirmy(java.util.Set value) {
		this.firmy = value;
	}
	
	public java.util.Set getFirmy() {
		return firmy;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" Klient [numerPrawaJazdy=" + numerPrawaJazdy
				+ ", krajWydaniaPrawaJazdy=" + krajWydaniaPrawaJazdy
				+ ", znizka=" + znizka + ", rezerwacje=" + rezerwacje
			    + ", firmy=" + firmy + "]";
	}
	
}
