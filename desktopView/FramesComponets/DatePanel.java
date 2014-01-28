package FramesComponets;
import java.awt.Dimension;
import java.util.Date;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;

import com.toedter.calendar.JDateChooser;

import javax.swing.BoxLayout;


public class DatePanel extends JPanel {
	private JDateChooser dateChooser;
	private JLabel lblOd;
	/**
	 * Create the panel.
	 */
	public DatePanel(String label) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		lblOd = new JLabel(label);
		add(lblOd);

		dateChooser = new JDateChooser();
		add(Box.createRigidArea(new Dimension(20,0)));
		add(dateChooser);



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
