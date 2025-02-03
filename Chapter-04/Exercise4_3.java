
public class Exercise4_3 {
	/*
	 * List all the arguments you receive while following these rules: if the word
	 * is short (five or fewer characters), print it four times on the same line; if
	 * it is long, repeat it only twice.
	 */
	private static final int FEWER = 5;
	private static final int REP_SHORT = 4;
	private static final int REP_LONG = 2;

	public static void main(String[] args) {
		System.out.println(argsChar(args));
	}

	private static String argsChar(String[] arg) {
		String msg = "";
		for (String argument : arg) {
			if (argument.length() < FEWER) {
				for (int i = 0; i < REP_SHORT; i++) {
					msg += argument.toString() + " ";
				}

			} else {
				for (int i = 0; i < REP_LONG; i++) {
					msg += argument.toString() + " ";
				}

			}
			msg += "\n";
		}
		return msg;

	}
}
