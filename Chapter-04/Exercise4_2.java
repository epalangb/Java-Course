
public class Exercise4_2 {
	/*
	 * List all the arguments you receive, but show their position.
	 */
	public static void main(String[] args) {
		showPosition(args);

	}

	private static void showPosition(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + ") " + args[i]);
		}
	}
}
