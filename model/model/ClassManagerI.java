package model;

import java.util.HashMap;

import entity.*;

public interface ClassManagerI {

	Entity createClass(String className, HashMap<String, Object> parameters);

}