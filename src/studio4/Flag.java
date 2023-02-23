package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.4);
		
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledCircle(0.5, 0.5, 0.2);
		
		Color purple = new Color (255, 0, 255);
		StdDraw.setPenColor(purple);
		
		double[] xCoord = new double[] {0.3, 0.5, 0.7};
		double[] yCoord = new double[] {0.3, 0.5, 0.3};
		StdDraw.filledPolygon(xCoord, yCoord);
		
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.text(0.5, 0.2, "VICKY");
	}
}