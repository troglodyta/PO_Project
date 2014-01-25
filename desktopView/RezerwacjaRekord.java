import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;


public class RezerwacjaRekord extends JPanel {

	/**
	 * Create the panel.
	 */
	public RezerwacjaRekord() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JLabel lblNrrezerwacij = new JLabel("NrRezerwacji");
		lblNrrezerwacij.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblNrrezerwacij);
		
		JLabel label = new JLabel("  ");
		add(label);
		
		JLabel lblZbigniew = new JLabel("Wiktoria");
		add(lblZbigniew);
		
		JLabel label_1 = new JLabel("  ");
		add(label_1);
		
		JLabel lblKowalskibrodzeki = new JLabel("Kowalska-Brodzeka");
		add(lblKowalskibrodzeki);
		
		JLabel label_2 = new JLabel("  ");
		add(label_2);
		
		JLabel lblSkodaFabia = new JLabel("Skoda Fabia 1.2 v6");
		add(lblSkodaFabia);
		
		JLabel label_3 = new JLabel("  ");
		add(label_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);

	}

}
