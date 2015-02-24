

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;

class Surface extends JComponent {

    private void doDrawing(Graphics g) {

    	Graphics2D g2 = (Graphics2D) g;
		g2.drawRect(100, 50, 10, 50);
		g2.fillRect(10, 50, 10, 50);
		
		//loads/reads image
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("crate.png"));
		} catch (IOException e) {
			System.out.println("nothing");
		}
		//draws image onto xy co-ord 
		g2.drawImage(img, 10, 50, null);
		
		
        }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

public class Points extends JFrame {

    public Points() {

        initUI();
    }

    private void initUI() {
        
        setTitle("Points");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //adds surface(JComponent/JPanel with Graphics drawings)
        //draws drawings onto the frame
        add(new Surface());

        setSize(350, 250);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
                Points ps = new Points();
                ps.setVisible(true);
            }
}