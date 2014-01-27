package FramesComponets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class FrameTest extends JFrame {
	public static JFrame frame;//=new MainFrame();
	public FrameTest(){
		setVisible(true);
		this.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p  = new WypozyczenieSzczegoly();
		add(p);
		//JLabel l= new JLabel( "ssss"                            );
		//.setSize(1000, 1000);
		setLocation(500,200);
		pack();
		frame=this;	
	}
	
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				FrameTest frame = new FrameTest();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}