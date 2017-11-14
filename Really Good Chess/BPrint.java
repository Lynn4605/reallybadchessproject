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
	String imayges;
	public BPrint(String image, int x, int y, boolean c) {
		color = c;
		imayges=image;
		String prefix = "B";
		if (color==false)
			prefix = "W";
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
	public String name(){
		String prefixes = "B";
		if (color==false)
			prefixes = "W";
		return (prefixes + imayges);
	}

	// Overrides the paint method and draws the image that is supposed to be drawn.
	public void paintSelf(Graphics g, int xplace, int yplace, ImageObserver i) {
		int xprintplace = xplace;
		int yprintplace = yplace;
		g.drawImage(img, xprintplace, yprintplace, i);
	}
	public void move(int newx, int newy) {
		
	}
}