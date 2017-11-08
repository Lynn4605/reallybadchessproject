import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;

public class BPrint {
	// change/add instance variables as needed
	float x, deltaX, accelX;
	float y, deltaY, accelY;
	BufferedImage img;

	public BPrint() {
		// img = new ImageIcon("").getImage();
		try {
			img = ImageIO.read(new File("board.jpg"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	// Overrides the paint method to draw whatever you want.
	public void paintSelf(Graphics g, ImageObserver i) {
		g.drawImage(img, 0, 0, i);

	}

}
