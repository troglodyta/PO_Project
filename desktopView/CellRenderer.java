import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;


public class CellRenderer extends JPanel implements ListCellRenderer<String> {
	JPanel panel;
	public CellRenderer() {
		panel= this;
	}
	@Override
	public Component getListCellRendererComponent(JList<? extends String> list,
			String value, int index, boolean isSelected, boolean cellHasFocus) {
		panel.removeAll();;
		panel.add(new JLabel(value));
		System.out.println(value);
		if(isSelected){
			panel.setBackground(Color.GRAY);
		}
		else{
			panel.setBackground(Color.white);
		}
		return panel;
	}

}
