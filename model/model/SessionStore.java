package model;

import java.util.HashMap;

public class SessionStore {
	private HashMap<String, Object> store = new HashMap<String, Object>();
	
	public static final SessionStore INSTANCE = new SessionStore();
	
	private SessionStore(){
		
	}
	
	public Object load(String name){
		return store.get(name);
	}
	
	public void store(String name, Object obj){
		store.put(name, obj);
	}
}
