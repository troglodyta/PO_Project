package FramesComponets;

import javax.swing.JFrame;
import java.awt.*;

public class FrameTest extends JFrame {
	public static JFrame frame;//=new MainFrame();
	public FrameTest(){
		setVisible(true);
		this.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new DanePojazdowSzczeguly());
		setLocation(500,200);
		pack();
		frame=this;	
	}
	
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Wypozyczenie frame = new Wypozyczenie();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}