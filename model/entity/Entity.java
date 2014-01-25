package entity;

public class Entity {

	@Override
	public boolean equals(Object obj) {
		if(obj.getClass().equals(this.getClass())){
			return this.toString().equals(obj.toString());
		}
		return false;
	}
	
}