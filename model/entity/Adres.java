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

import java.util.HashMap;

public class Adres extends Entity {
	private int ID;

	private String ulica;

	private String kodPocztowy;

	private String miejscowosc;

	public Adres() {
	}

	public Adres(HashMap<String, Object> args){
		this((Integer)args.get("ID"), (String)args.get("ulica"), (String)args.get("kodPocztowy"), (String)args.get("miejscowosc"));
	}

	public Adres(int iD, String ulica, String kodPocztowy, String miejscowosc) {
		super();
		ID = iD;
		this.ulica = ulica;
		this.kodPocztowy = kodPocztowy;
		this.miejscowosc = miejscowosc;
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

	public void setUlica(String value)
	{
		if(value.matches("[A-• ”£åØè—]{1}+\\D+[0-9]+|[A-• ”£åØè—]{1}+\\D+[0-9]+[a-z]|[A-• ”£åØè—]{1}+\\D+[0-9]+/[a-z]|[A-• ”£åØè—]{1}+\\D+[0-9]+/[0-9]"))
		this.ulica = value;
		else
			throw new IllegalArgumentException("Nazwa ulicy musi zaczynaÊ siÍ wielkπ literπ "
					+ "i musi zawieraÊ numer mieszkania."+value);
	}

	public String getUlica() {
		return ulica;
	}

	public void setKodPocztowy(String value) {
		if(value.matches("[0-9]{2}-[0-9]{3}"))
		this.kodPocztowy = value;
		else
			throw new IllegalArgumentException("Kod pocztowy musi siÍ sk≥adaÊ ≥πcznie z 5 cyfr"+value);
	}

	public String getKodPocztowy() {
		return kodPocztowy;
	}

	public void setMiejscowosc(String value) {
		if(value.matches("[A-• ”£åØè—]{1}\\D+"))
		this.miejscowosc = value;
		else
			throw new IllegalArgumentException("Nazwa miejscowoúci musi zaczynaÊ siÍ wielkπ literπ "
					+ "i nie moøe zawieraÊ cyfr.");
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}


	@Override
	public String toString() {
		return "Adres [ID=" + ID + ", ulica=" + ulica + ", kodPocztowy="
				+ kodPocztowy + ", miejscowosc=" + miejscowosc + "]";
	}

}
