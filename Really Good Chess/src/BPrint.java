import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;
public class BPrint {
	// change/add instance variables as needed
	BufferedImage img;
	Scanner imag = new Scanner(System.in);
	String image = imag.next();
	Scanner xcoordinate = new Scanner(System.in);
	int x = xcoordinate.nextInt();
	Scanner ycoordinate = new Scanner(System.in);
	int y=ycoordinate.nextInt();
	public BPrint() {
		// img = new ImageIcon("").getImage();
		try {
			img = ImageIO.read(new File(image));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	// Overrides the paint method to draw whatever you want.
	public void paintSelf(Graphics g, ImageObserver i) {
		g.drawImage(img, x, y, i);

	}

}
