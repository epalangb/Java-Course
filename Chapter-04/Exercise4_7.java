import java.util.Iterator;

public class Exercise4_7 {
	/*
	 * Print the numbers from zero to ninety-nine in a 10 x 10 matrix in Java.
	 */
	private static final int WIDTH = 10;
	private static final int HEIGHT = 10;
	
	public static void main(String[] args) {
		System.out.println(printMatrix(WIDTH, HEIGHT));
	}
	
	private static String printMatrix(int width, int height) {
		String matrix = "";
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				matrix += x + "" + y + " ";
			}
			matrix += "\n";
		}
		return matrix;
	}
}
