import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

import java.awt.GridLayout;

import javax.swing.JToolBar;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JComboBox;

import java.awt.Insets;

import javax.swing.BoxLayout;

import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.SpringLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


public class PrzegladaniePojazdow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrzegladaniePojazdow frame = new PrzegladaniePojazdow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrzegladaniePojazdow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane pojazdyLista = new JScrollPane();
		contentPane.add(pojazdyLista, BorderLayout.CENTER);
		
		table = new JTable();
		pojazdyLista.setViewportView(table);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("Szukaj pojazdów");
		
		JLabel lblMarka = new JLabel("Marka");
		
		JLabel lblModel = new JLabel("Model");
		
		JComboBox comboBox = new JComboBox();
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblNrRejestracyjny = new JLabel("Nr rejestracyjny");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblDataPrzegldu = new JLabel("Data przegl\u0105du");
		
		JLabel lblStatus = new JLabel("Status");
		
		JRadioButton rdbtnWszystkie = new JRadioButton("Wszystkie");
		
		JRadioButton rdbtnWypoyczone = new JRadioButton("Wypo\u017Cyczone");
		
		JRadioButton rdbtnWolne = new JRadioButton("Wolne");
		
		ButtonGroup status=new ButtonGroup();
		status.add(rdbtnWszystkie);
		status.add(rdbtnWypoyczone);
		status.add(rdbtnWolne);
		
		
		JButton btnSzukaj = new JButton("Szukaj");
		
		
		//tych elementów nie widaæ w desingu
		DatePanel odDate = new DatePanel("Od");
		
		DatePanel doDate = new DatePanel("Do");
		
		JButton btnResetuj = new JButton("Resetuj");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(73)
					.addComponent(lblNewLabel))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblMarka)
					.addGap(48)
					.addComponent(lblModel))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblNrRejestracyjny))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblDataPrzegldu))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(odDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(doDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblStatus))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(rdbtnWszystkie))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(rdbtnWypoyczone))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(rdbtnWolne))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(btnSzukaj)
					.addGap(14)
					.addComponent(btnResetuj))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(7)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMarka)
						.addComponent(lblModel))
					.addGap(4)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(lblNrRejestracyjny)
					.addGap(4)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(lblDataPrzegldu)
					.addGap(4)
					.addComponent(odDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(doDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(lblStatus)
					.addGap(4)
					.addComponent(rdbtnWszystkie)
					.addGap(4)
					.addComponent(rdbtnWypoyczone)
					.addGap(4)
					.addComponent(rdbtnWolne)
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSzukaj)
						.addComponent(btnResetuj)))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JButton btnDodaj = new JButton("Dodaj");
		
		JButton btnUsu = new JButton("Usuñ");
		
		JButton btnWyloguj = new JButton("Wyloguj");
		
		JLabel lblZalogowanyJako = new JLabel("Zalogowany jako:");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(7)
					.addComponent(btnDodaj)
					.addGap(4)
					.addComponent(btnUsu)
					.addPreferredGap(ComponentPlacement.RELATED, 417, Short.MAX_VALUE)
					.addComponent(lblZalogowanyJako)
					.addGap(18)
					.addComponent(btnWyloguj)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnDodaj)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnUsu)
							.addComponent(btnWyloguj)
							.addComponent(lblZalogowanyJako))))
		);
		panel_1.setLayout(gl_panel_1);
		
		
	}
}
