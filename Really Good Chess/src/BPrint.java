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
	int xcoordinate;
	int ycoordinate;
	boolean color;
	public BPrint(String image, int x, int y, boolean c) {
		color = c;
		String prefix = "B";
		if (color==false)
			prefix = "W";
		// img = new ImageIcon("").getImage();
		try {
			img = ImageIO.read(new File(prefix + image));
			xcoordinate = x;
			ycoordinate = y;
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	public boolean colorcheck() {
		return color;
	}

	// Overrides the paint method to draw whatever you want.
	public void paintSelf(Graphics g, ImageObserver i) {
		g.drawImage(img, xcoordinate, ycoordinate, i);

	}

}