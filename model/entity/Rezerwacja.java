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

public class Rezerwacja extends Entity {

	private int ID;

	private entity.DaneWypozyczenia daneWypozyczenia;

	private entity.Klient klient;

	private entity.Pracownik potwierdzajacy;

	private java.util.Date dataRezerwacji;

	private String uwagi;

	private String sposobWplatyZaliczki;

	private String sposobWplatyKaucji;

	private boolean czyPotwierdzona = false;

	private boolean czyAnulowana = false;

	public Rezerwacja() {
	}

	public Rezerwacja(int iD, Pracownik potwierdzajacy, Klient klient,
			java.util.Date dataRezerwacji, String uwagi, String sposobWplatyZaliczki,
			String sposobWplatyKaucji, boolean czyPotwierdzona,
			boolean czyAnulowana, DaneWypozyczenia daneWypozyczenia) {
		super();
		ID = iD;
		this.potwierdzajacy = potwierdzajacy;
		this.klient = klient;
		this.dataRezerwacji = dataRezerwacji;
		this.uwagi = uwagi;
		this.sposobWplatyZaliczki = sposobWplatyZaliczki;
		this.sposobWplatyKaucji = sposobWplatyKaucji;
		this.czyPotwierdzona = czyPotwierdzona;
		this.czyAnulowana = czyAnulowana;
		this.daneWypozyczenia = daneWypozyczenia;
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

	public void setDataRezerwacji(java.util.Date value) {
		this.dataRezerwacji = value;
	}

	public java.util.Date getDataRezerwacji() {
		return dataRezerwacji;
	}

	public void setUwagi(String value) {
		this.uwagi = value;
	}

	public String getUwagi() {
		return uwagi;
	}

	public void setSposobWplatyZaliczki(String value) {
		this.sposobWplatyZaliczki = value;
	}

	public String getSposobWplatyZaliczki() {
		return sposobWplatyZaliczki;
	}

	public void setSposobWplatyKaucji(String value) {
		this.sposobWplatyKaucji = value;
	}

	public String getSposobWplatyKaucji() {
		return sposobWplatyKaucji;
	}

	public void setCzyPotwierdzona(boolean value) {
		this.czyPotwierdzona = value;
	}

	public boolean getCzyPotwierdzona() {
		return czyPotwierdzona;
	}

	public void setCzyAnulowana(boolean value) {
		this.czyAnulowana = value;
	}

	public boolean getCzyAnulowana() {
		return czyAnulowana;
	}

	public void setKlient(entity.Klient value) {
		this.klient = value;
	}

	public entity.Klient getKlient() {
		return klient;
	}

	public void setPotwierdzajacy(entity.Pracownik value) {
		this.potwierdzajacy = value;
	}

	public entity.Pracownik getPotwierdzajacy() {
		return potwierdzajacy;
	}

	public void setDaneWypozyczenia(entity.DaneWypozyczenia value) {
		this.daneWypozyczenia = value;
	}

	public entity.DaneWypozyczenia getDaneWypozyczenia() {
		return daneWypozyczenia;
	}

	public void setDataRezerwacji(String dataRezerwacji) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Rezerwacja [ID=" + ID + ", potwierdzajacy=" + potwierdzajacy
				+  ", dataRezerwacji=" + dataRezerwacji
				+ ", uwagi=" + uwagi + ", sposobWplatyZaliczki="
				+ sposobWplatyZaliczki + ", sposobWplatyKaucji="
				+ sposobWplatyKaucji + ", czyPotwierdzona=" + czyPotwierdzona
				+ ", czyAnulowana=" + czyAnulowana + ", daneWypozyczenia="
				+ daneWypozyczenia + "]";
	}

}
