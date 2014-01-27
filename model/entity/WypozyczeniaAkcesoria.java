package entity;

public class WypozyczeniaAkcesoria extends Entity {
private int ID;
	
	private int ilosc;
	private Akcesoria akcesoria;
	
	public WypozyczeniaAkcesoria() {
		// TODO Auto-generated constructor stub
	}
	

	public WypozyczeniaAkcesoria(int iD, int ilosc, Akcesoria akcesoria) {
		super();
		ID = iD;
		this.ilosc = ilosc;
		this.akcesoria = akcesoria;
	}


	public void setID(int iD) {
		ID = iD;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

	public Akcesoria getAkcesoria() {
		return akcesoria;
	}

	public void setAkcesoria(Akcesoria akcesoria) {
		this.akcesoria = akcesoria;
	}

	public int getID() {
		return ID;
	}



	@Override
	public String toString() {
		return "WypozyczeniaAkcesoria [ID=" + ID + ", ilosc=" + ilosc
				+ ", akcesoria="
				+ akcesoria + "]";
	}
	
	
	
	

}
