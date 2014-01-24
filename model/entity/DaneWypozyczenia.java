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

public class DaneWypozyczenia {
	public DaneWypozyczenia() {
	}
	
	private int ID;
	
	private entity.Pojazd pojazd;
	
	private entity.Oddzial oddzialZwrotu;
	
	private entity.Oddzial odzialZwroru;
	
	private java.util.Date dataGodzinaOd;
	
	private java.util.Date dataGodzinaDo;
	
	private java.util.Date dataWpatyZaliczki;
	
	private java.util.Date dataWplatyKaucji;
	
	private double platnosc;
	
	private double kaucja;
	
	private double wplaconaZaliczka;
	
	private double wplaconaKaucja;
	
	private java.util.Collection akcesoria = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDataGodzinaOd(java.util.Date value) {
		this.dataGodzinaOd = value;
	}
	
	public java.util.Date getDataGodzinaOd() {
		return dataGodzinaOd;
	}
	
	public void setDataGodzinaDo(java.util.Date value) {
		this.dataGodzinaDo = value;
	}
	
	public java.util.Date getDataGodzinaDo() {
		return dataGodzinaDo;
	}
	
	public void setDataWpatyZaliczki(java.util.Date value) {
		this.dataWpatyZaliczki = value;
	}
	
	public java.util.Date getDataWpatyZaliczki() {
		return dataWpatyZaliczki;
	}
	
	public void setDataWplatyKaucji(java.util.Date value) {
		this.dataWplatyKaucji = value;
	}
	
	public java.util.Date getDataWplatyKaucji() {
		return dataWplatyKaucji;
	}
	
	public void setPlatnosc(double value) {
		this.platnosc = value;
	}
	
	public double getPlatnosc() {
		return platnosc;
	}
	
	public void setKaucja(double value) {
		this.kaucja = value;
	}
	
	public double getKaucja() {
		return kaucja;
	}
	
	public void setWplaconaZaliczka(double value) {
		this.wplaconaZaliczka = value;
	}
	
	public double getWplaconaZaliczka() {
		return wplaconaZaliczka;
	}
	
	public void setWplaconaKaucja(double value) {
		this.wplaconaKaucja = value;
	}
	
	public double getWplaconaKaucja() {
		return wplaconaKaucja;
	}
	
	public void setOdzialZwroru(entity.Oddzial value) {
		this.odzialZwroru = value;
	}
	
	public entity.Oddzial getOdzialZwroru() {
		return odzialZwroru;
	}
	
	public void setOddzialZwrotu(entity.Oddzial value) {
		this.oddzialZwrotu = value;
	}
	
	public entity.Oddzial getOddzialZwrotu() {
		return oddzialZwrotu;
	}
	
	public void setPojazd(entity.Pojazd value) {
		this.pojazd = value;
	}
	
	public entity.Pojazd getPojazd() {
		return pojazd;
	}
	
	public void setAkcesoria(java.util.Collection value) {
		this.akcesoria = value;
	}
	
	public java.util.Collection getAkcesoria() {
		return akcesoria;
	}
	
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
