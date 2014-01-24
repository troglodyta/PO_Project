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

public class Pojazd extends Entity {
	
	private int ID;
	
	private entity.Oddzial oddzial;
	
	private entity.DaneModeluPojazdu danePojazdu;
	
	private String nrRejstracyjny;
	
	private java.util.Date dataWymianyOleju;
	
	private java.util.Date dataPrzegladu;
	
	private java.util.Date dataProdukcji;
	
	private boolean zdatnyDoWypozyczenia;
	
	private double cenaZakupu;
	
	private boolean czyWypozyczony;
	
	private entity.Polisa polisa;
	
	public Pojazd() {
	}
	
	public Pojazd(int iD, DaneModeluPojazdu danePojazdu, Oddzial oddzial,
			String nrRejstracyjny, Date dataWymianyOleju, Date dataPrzegladu,
			Date dataProdukcji, boolean zdatnyDoWypozyczenia,
			double cenaZakupu, boolean czyWypozyczony, Polisa polisa) {
		super();
		ID = iD;
		this.danePojazdu = danePojazdu;
		this.oddzial = oddzial;
		this.nrRejstracyjny = nrRejstracyjny;
		this.dataWymianyOleju = dataWymianyOleju;
		this.dataPrzegladu = dataPrzegladu;
		this.dataProdukcji = dataProdukcji;
		this.zdatnyDoWypozyczenia = zdatnyDoWypozyczenia;
		this.cenaZakupu = cenaZakupu;
		this.czyWypozyczony = czyWypozyczony;
		this.polisa = polisa;
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
	
	public void setNrRejstracyjny(String value) {
		this.nrRejstracyjny = value;
	}
	
	public String getNrRejstracyjny() {
		return nrRejstracyjny;
	}
	
	public void setDataWymianyOleju(java.util.Date value) {
		this.dataWymianyOleju = value;
	}
	
	public java.util.Date getDataWymianyOleju() {
		return dataWymianyOleju;
	}
	
	public void setDataPrzegladu(java.util.Date value) {
		this.dataPrzegladu = value;
	}
	
	public java.util.Date getDataPrzegladu() {
		return dataPrzegladu;
	}
	
	public void setDataProdukcji(java.util.Date value) {
		this.dataProdukcji = value;
	}
	
	public java.util.Date getDataProdukcji() {
		return dataProdukcji;
	}
	
	public void setZdatnyDoWypozyczenia(boolean value) {
		this.zdatnyDoWypozyczenia = value;
	}
	
	public boolean getZdatnyDoWypozyczenia() {
		return zdatnyDoWypozyczenia;
	}
	
	public void setCenaZakupu(double value) {
		this.cenaZakupu = value;
	}
	
	public double getCenaZakupu() {
		return cenaZakupu;
	}
	
	public void setCzyWypozyczony(boolean value) {
		this.czyWypozyczony = value;
	}
	
	public boolean getCzyWypozyczony() {
		return czyWypozyczony;
	}
	
	public void setDanePojazdu(entity.DaneModeluPojazdu value) {
		this.danePojazdu = value;
	}
	
	public entity.DaneModeluPojazdu getDanePojazdu() {
		return danePojazdu;
	}
	
	public void setOddzial(entity.Oddzial value) {
		this.oddzial = value;
	}
	
	public entity.Oddzial getOddzial() {
		return oddzial;
	}
	
	public entity.Ubezpieczyciel getUbezpieczyciel() {
		if(polisa != null) {
			return polisa.getUbezpieczyciel();
		}
		else {
			return null;
		}
	}
	
	public void removeUbezpieczyciel() {
		if(polisa!= null) {
			polisa.setUbezpieczyciel(null);
			this.setPolisa(null);
		}
	}
	
	public void addUbezpieczyciel(entity.Polisa aPolisa, entity.Ubezpieczyciel aUbezpieczyciel) {
		this.setPolisa(aPolisa);
		aPolisa.setUbezpieczyciel(aUbezpieczyciel);
	}
	
	public void setPolisa(entity.Polisa value) {
		this.polisa = value;
	}
	
	public entity.Polisa getPolisa() {
		return polisa;
	}
	
	@Override
	public String toString() {
		return "Pojazd [ID=" + ID + ", danePojazdu=" + danePojazdu
				+ ", oddzial=" + oddzial + ", nrRejstracyjny=" + nrRejstracyjny
				+ ", dataWymianyOleju=" + dataWymianyOleju + ", dataPrzegladu="
				+ dataPrzegladu + ", dataProdukcji=" + dataProdukcji
				+ ", zdatnyDoWypozyczenia=" + zdatnyDoWypozyczenia
				+ ", cenaZakupu=" + cenaZakupu + ", czyWypozyczony="
				+ czyWypozyczony + ", polisa=" + polisa + "]";
	}
	
}
