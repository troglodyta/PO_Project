package FramesComponets;
import java.util.Date;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;


public class DatePanel extends JPanel {
	private JComboBox dayBox;
	private JComboBox monthBox;
	private JComboBox yearBox;

	/**
	 * Create the panel.
	 */
	public DatePanel(String label) {
		setLayout(new MigLayout("", "[33.00,grow][40.00,grow][78.00,grow][61.00,grow]", "[]"));
		
		dayBox = new JComboBox();
		add(dayBox, "cell 1 0,growx");
		
		monthBox = new JComboBox();
		add(monthBox, "cell 2 0,growx");
		
		yearBox = new JComboBox();
		add(yearBox, "cell 3 0,growx");
		
		JLabel lblOd = new JLabel(label);
		add(lblOd, "cell 0 0");
		
		//dane do box�w danych
		for(int i=1;i<32;i++)
		{
			dayBox.addItem(i);
		}
		
		monthBox.addItem("stycze�");
		monthBox.addItem("luty");
		monthBox.addItem("marzec");
		monthBox.addItem("kwiecie�");
		monthBox.addItem("maj");
		monthBox.addItem("czerwiec");
		monthBox.addItem("lipiec");
		monthBox.addItem("sierpie�");
		monthBox.addItem("wrzesie�");
		monthBox.addItem("pa�dziernik");
		monthBox.addItem("listopad");
		monthBox.addItem("grudzie�");
		
		for(int i=1990;i<2021;i++)
		{
			yearBox.addItem(i);
		}

		
	}
	
	

	public JComboBox getDayBox() {
		return dayBox;
	}
	public JComboBox getMonthBox() {
		return monthBox;
	}
	public JComboBox getYearBox() {
		return yearBox;
	}
}
