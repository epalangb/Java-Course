
public class Exercise2_3 {

	/*
	 * Write a program that calculates the area of a rectangle 
	 * and prints <<The rectangle of ... by ... has an area of ....>>
	 * It will receive the size of the two sides as arguments.
	 */
	public static void main(String[] args) {
		System.out.println("The rectangle of " + args[0] 
				+ " by " + args[1] + " has an area of " 
				+ rectangleArea(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
	
	private static int rectangleArea(int base, int high) {
		@SuppressWarnings("unused")
		int area;
		return area = base * high;
	}

}
