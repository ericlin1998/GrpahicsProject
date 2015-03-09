

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

    	//cast Graphics to Graphics2D
    	
    	//drawWhatever Use outline() for taking a shape of something   Crop a shape(s) and print an image
		
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
        
        setTitle("Graphics2D");
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