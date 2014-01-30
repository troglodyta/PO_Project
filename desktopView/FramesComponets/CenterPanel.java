package FramesComponets;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;

import javax.swing.*;

public class CenterPanel extends JPanel{


	//aby mapowanie componetów dzia³a³o
	//1.0 zmienne komponentów musz¹ nazywaæ siê tak jak odpowiadaj¹ce pola klas entity
	//2.0 metoda ta musi byæ wywo³ana po utworzeniu komponentów
	//3.0 komponenty musz¹ byæ pogrupowane w tablice
	protected  void setComponentsNames(){
		try {
			Class c = Class.forName(this.getClass().getCanonicalName());
			Field[] fields = c.getDeclaredFields();
			for (Field f : fields) {
				if( Component.class.isAssignableFrom(f.getType())){
					f.setAccessible(true);
					Component comp =(Component) f.get(this);
					comp.setName(f.getName());
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	protected void fillFilds(Component[] cmp,HashMap<String, Object> map){
		for(Component c: cmp){
			if(c instanceof JTextField){
				JTextField txt = (JTextField)c;
				String value = map.get(txt.getName()).toString();
				txt.setText(value);
			}
			else if(c instanceof JComboBox){
				JComboBox combo = (JComboBox)c;
				String value = map.get(combo.getName()).toString();
				combo.setSelectedItem(value);
			}
			else if(c instanceof JCheckBox){
				JCheckBox box = (JCheckBox)c;
				Boolean value = (Boolean) map.get(box.getName());
				box.setSelected(value);
			}
			else if(c instanceof DatePanel){
				DatePanel date = (DatePanel)c;
				Date value = (Date) map.get(date.getName());
				date.setDate(value);
			}
			else if(c instanceof JLabel){
				JLabel label = (JLabel) c;
				String value = map.get(label.getName()).toString();
				label.setText(value);
			}
		}
	}

	protected void fillHashMap(Component[] cmp,HashMap<String, Object> map){
		for(Component c: cmp){
			if(c instanceof JTextField){
				JTextField txt = (JTextField)c;
				map.put(txt.getName(), txt.getText());
			}
			else if(c instanceof JComboBox){
				JComboBox combo = (JComboBox)c;
				map.put(combo.getName(), combo.getSelectedItem());
			}
			else if(c instanceof JCheckBox){
				JCheckBox box = (JCheckBox)c;
				map.put(box.getName(), box.isSelected());
			}
			else if(c instanceof DatePanel){
				DatePanel date = (DatePanel)c;
				map.put(date.getName(), date.getDate());
			}
		}
	}

}
