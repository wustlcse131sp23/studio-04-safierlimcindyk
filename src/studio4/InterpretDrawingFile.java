package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		StdDraw.setPenColor(red, green, blue);
		if (shape.equals("triangle")) {
			double [] xCoordinates = new double [3];
			double [] yCoordinates = new double [3];
			for (int d = 0; d < 3; d++) {
				xCoordinates[d] = in.nextDouble();
				yCoordinates[d] = in.nextDouble();
			}
			StdDraw.filledPolygon(xCoordinates, yCoordinates);
		}
		else {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		}
		
	}
}
