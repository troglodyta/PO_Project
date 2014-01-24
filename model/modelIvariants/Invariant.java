package modelIvariants;

public interface Invariant {

	/**
	 * 
	 * @param name
	 * @param value
	 */
	boolean checkCorrect(String name, Object value);

}