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

import java.util.Collection;
import java.util.Date;

public class DaneWypozyczenia extends Entity {

	private int ID;

	private entity.Pojazd pojazd;

	private entity.Oddzial oddzialOdbioru;

	private entity.Oddzial oddzialZwrotu;

	private java.util.Date dataGodzinaOd;

	private java.util.Date dataGodzinaDo;

	private java.util.Date dataWpatyZaliczki;

	private java.util.Date dataWplatyKaucji;

	private double platnosc;

	private double kaucja;

	private double wplaconaZaliczka;

	private double wplaconaKaucja;
	private Firma firma;

	private java.util.Collection wypozyczeniaAkcesoria = new java.util.ArrayList<WypozyczeniaAkcesoria>();

	public DaneWypozyczenia() {
	}

	public DaneWypozyczenia(int iD, Pojazd pojazd, Oddzial oddzialZwrotu,
			Oddzial odzialZwroru, Date dataGodzinaOd, Date dataGodzinaDo,
			Date dataWpatyZaliczki, Date dataWplatyKaucji, double platnosc,
			double kaucja, double wplaconaZaliczka, double wplaconaKaucja,
			Collection akcesoria, Firma firma) {
		super();
		ID = iD;
		this.pojazd = pojazd;
		this.oddzialOdbioru = oddzialZwrotu;
		this.oddzialZwrotu = odzialZwroru;
		this.dataGodzinaOd = dataGodzinaOd;
		this.dataGodzinaDo = dataGodzinaDo;
		this.dataWpatyZaliczki = dataWpatyZaliczki;
		this.dataWplatyKaucji = dataWplatyKaucji;
		this.platnosc = platnosc;
		this.kaucja = kaucja;
		this.wplaconaZaliczka = wplaconaZaliczka;
		this.wplaconaKaucja = wplaconaKaucja;
		this.wypozyczeniaAkcesoria = akcesoria;
		this.firma = firma;
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

	public Firma getFirma() {
		return firma;
	}

	public void setFirma(Firma firma) {
		this.firma = firma;
	}

	public void setDataGodzinaOd(java.util.Date value) {
		this.dataGodzinaOd = value;
	}

	public java.util.Date getDataGodzinaOd() {
		return dataGodzinaOd;
	}

	public void setDataGodzinaDo(java.util.Date value)
	{
		if(value.after(dataGodzinaOd))
		this.dataGodzinaDo = value;
		else
			throw new IllegalArgumentException("Data oddania musi byæ póŸniejsza od daty po¿yczenia");
	}

	public java.util.Date getDataGodzinaDo() {
		return dataGodzinaDo;
	}

	public void setDataWpatyZaliczki(java.util.Date value)
	{
		if(value.before(dataGodzinaOd))
			this.dataWpatyZaliczki = value;
		else
			throw new IllegalArgumentException("Zaliczka musi byæ wp³acona przed wypo¿yczeniem");
	}

	public java.util.Date getDataWpatyZaliczki() {
		return dataWpatyZaliczki;
	}

	public void setDataWplatyKaucji(java.util.Date value) {
	//	if(dataGodzinaDo==null || value.before(dataGodzinaOd))
			this.dataWplatyKaucji = value;
	//	else
		//	throw new IllegalArgumentException("Kaucja musi byæ wp³acona przed wypo¿yczeniem");
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

	public entity.Oddzial getOddzialOdbioru() {
		return oddzialOdbioru;
	}

	public void setOddzialOdbioru(entity.Oddzial oddzialOdbioru) {
		this.oddzialOdbioru = oddzialOdbioru;
	}

	public entity.Oddzial getOddzialZwrotu() {
		return oddzialZwrotu;
	}

	public void setOddzialZwrotu(entity.Oddzial oddzialZwrotu) {
		this.oddzialZwrotu = oddzialZwrotu;
	}

	public void setPojazd(entity.Pojazd value) {
		this.pojazd = value;
	}

	public entity.Pojazd getPojazd() {
		return pojazd;
	}

	public void setWypozyczeniaAkcesoria(java.util.Collection value) {
		this.wypozyczeniaAkcesoria = value;
	}

	public java.util.Collection getWypozyczeniaAkcesoria() {
		return wypozyczeniaAkcesoria;
	}


	@Override
	public String toString() {
		return "DaneWypozyczenia [ID=" + ID + ", odzialOdbioru=" + oddzialOdbioru
				+ ", oddzialZwrotu=" + oddzialZwrotu + ", pojazd=" + pojazd
				+ ", dataGodzinaOd="
				+ dataGodzinaOd + ", dataGodzinaDo=" + dataGodzinaDo
				+ " Firma " + firma
				+ ", dataWpatyZaliczki=" + dataWpatyZaliczki
				+ ", dataWplatyKaucji=" + dataWplatyKaucji + ", platnosc="
				+ platnosc + ", kaucja=" + kaucja + ", wplaconaZaliczka="
				+ wplaconaZaliczka + ", wplaconaKaucja=" + wplaconaKaucja
				+ ", akcesoria="+ wypozyczeniaAkcesoria + "]";
	}

}
