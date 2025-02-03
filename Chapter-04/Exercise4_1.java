
public class Exercise4_1 {
	/*
	 * Print all the arguments you receive on the screen. If an argument has fewer
	 * than five characters, write it in uppercase. Otherwise, write it in
	 * lowercase.
	 */
	private static final int FEWER = 5;

	public static void main(String[] args) {
		for (String argument : args) {
			System.out.println(argsChar(argument));
		}

	}

	private static String argsChar(String arg) {
		if (arg.length() < FEWER) {
			return arg.toUpperCase();
		} else {
			return arg.toLowerCase();
		}
	}
}
