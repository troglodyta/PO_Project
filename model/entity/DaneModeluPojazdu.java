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

public class DaneModeluPojazdu extends Entity {
	
	private int ID;
	
	private String marka;
	
	private String model;
	
	private String typ;
	
	private String kategoria;
	
	private String zdjecie;
	
	private int miejscaSiedzace;
	
	private int maxMasaCalkowita;
	
	private int masaWlasna;
	
	private int pojemnoscSilnika;
	
	private int moc;
	
	private double cenaWypozyczenia;
	
	private double kaucja;
	
	private String rodzajPaliwa;
	
	private double cenaRynkowa;
	
	public DaneModeluPojazdu() {
	}
	
	public DaneModeluPojazdu(int iD, String marka, String model, String typ,
			String kategoria, String zdjecie, int miejscaSiedzace,
			int maxMasaCalkowita, int masaWlasna, int pojemnoscSilnika,
			int moc, double cenaWypozyczenia, double kaucja,
			String rodzajPaliwa, double cenaRynkowa) {
		super();
		ID = iD;
		this.marka = marka;
		this.model = model;
		this.typ = typ;
		this.kategoria = kategoria;
		this.zdjecie = zdjecie;
		this.miejscaSiedzace = miejscaSiedzace;
		this.maxMasaCalkowita = maxMasaCalkowita;
		this.masaWlasna = masaWlasna;
		this.pojemnoscSilnika = pojemnoscSilnika;
		this.moc = moc;
		this.cenaWypozyczenia = cenaWypozyczenia;
		this.kaucja = kaucja;
		this.rodzajPaliwa = rodzajPaliwa;
		this.cenaRynkowa = cenaRynkowa;
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
	
	public void setMarka(String value) {
		this.marka = value;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setModel(String value) {
		this.model = value;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setTyp(String value) {
		this.typ = value;
	}
	
	public String getTyp() {
		return typ;
	}
	
	public void setKategoria(String value) {
		this.kategoria = value;
	}
	
	public String getKategoria() {
		return kategoria;
	}
	
	public void setZdjecie(String value) {
		this.zdjecie = value;
	}
	
	public String getZdjecie() {
		return zdjecie;
	}
	
	public void setMiejscaSiedzace(int value) {
		this.miejscaSiedzace = value;
	}
	
	public int getMiejscaSiedzace() {
		return miejscaSiedzace;
	}
	
	public void setMaxMasaCalkowita(int value) {
		this.maxMasaCalkowita = value;
	}
	
	public int getMaxMasaCalkowita() {
		return maxMasaCalkowita;
	}
	
	public void setMasaWlasna(int value) {
		this.masaWlasna = value;
	}
	
	public int getMasaWlasna() {
		return masaWlasna;
	}
	
	public void setPojemnoscSilnika(int value) {
		this.pojemnoscSilnika = value;
	}
	
	public int getPojemnoscSilnika() {
		return pojemnoscSilnika;
	}
	
	public void setMoc(int value) {
		this.moc = value;
	}
	
	public int getMoc() {
		return moc;
	}
	
	public void setCenaWypozyczenia(double value) {
		this.cenaWypozyczenia = value;
	}
	
	public double getCenaWypozyczenia() {
		return cenaWypozyczenia;
	}
	
	public void setKaucja(double value) {
		this.kaucja = value;
	}
	
	public double getKaucja() {
		return kaucja;
	}
	
	public void setRodzajPaliwa(String value) {
		this.rodzajPaliwa = value;
	}
	
	public String getRodzajPaliwa() {
		return rodzajPaliwa;
	}
	
	public void setCenaRynkowa(double value) {
		this.cenaRynkowa = value;
	}
	
	public double getCenaRynkowa() {
		return cenaRynkowa;
	}
	
	@Override
	public String toString() {
		return "DaneModeluPojazdu [ID=" + ID + ", marka=" + marka + ", model="
				+ model + ", typ=" + typ + ", kategoria=" + kategoria
				+ ", zdjecie=" + zdjecie + ", miejscaSiedzace="
				+ miejscaSiedzace + ", maxMasaCalkowita=" + maxMasaCalkowita
				+ ", masaWlasna=" + masaWlasna + ", pojemnoscSilnika="
				+ pojemnoscSilnika + ", moc=" + moc + ", cenaWypozyczenia="
				+ cenaWypozyczenia + ", kaucja=" + kaucja + ", rodzajPaliwa="
				+ rodzajPaliwa + ", cenaRynkowa=" + cenaRynkowa + "]";
	}
	
}
