package FramesComponets;

import javax.swing.JFrame;
import java.awt.*;

public class FrameTest extends JFrame {
	public static JFrame frame;//=new MainFrame();
	public FrameTest(){
		setVisible(true);
		this.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Wypozyczenie1Panel());
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