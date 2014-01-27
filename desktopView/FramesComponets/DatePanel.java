package FramesComponets;
import java.util.Date;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;


public class DatePanel extends JPanel {
	private JDateChooser dateChooser;
	private JLabel lblOd;
	/**
	 * Create the panel.
	 */
	public DatePanel(String label) {
		setLayout(new MigLayout("", "[33.00,grow][40.00,grow][78.00,grow][61.00,grow]", "[grow]"));
		
		lblOd = new JLabel(label);
		add(lblOd, "cell 0 0");
		
		dateChooser = new JDateChooser();
		add(dateChooser, "cell 1 0 3 1,grow");


		
	}
	
	public Date getDate(){
		return dateChooser.getDate();
	}
	
	public void setDate(Date date){
		dateChooser.setDate(date);
	}
	
	@Override
	public void setEnabled(boolean enabled) {
		dateChooser.setEnabled(enabled);
		lblOd.setEnabled(enabled);
		
	}
	
}
