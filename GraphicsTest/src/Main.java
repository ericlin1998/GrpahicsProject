import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends JPanel{
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame("Graphics");
		frame.pack();
		frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		frame.add(paintComponent(Graphics g));
	}
	
	@Override
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 createDraw(g);
	 }
	
	public void createDraw(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.drawRect(1, 50, 10, 50);
		g2.fillRect(1, 50, 10, 50);
	}
}
