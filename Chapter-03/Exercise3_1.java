
public class Exercise3_1 {
	/*
	 * Check the number of arguments your program receives. If it does not receive
	 * any arguments, notify the user ("No arguments received"). Otherwise, indicate
	 * how many have been received ("... arguments received").
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println(args.length + " arguments received");
		} else {
			System.out.println("No arguments received");
		}

	}

}
