
public class Exercise3_2 {
	/*
	 * Check the number of arguments your program receives. If it does not receive
	 * any arguments, notify the user. If it receives up to 4, indicate how many
	 * have been received. If it receives more, notify the user.
	 */
	public static void main(String[] args) {
		System.out.println(checkArgs(args));

	}
	private static String checkArgs (String[] args) {
		String msgArg;
		switch (args.length) {
		case 0:
			msgArg = "No arguments received";
			break;
		case 1:
		case 2:
		case 3:
		case 4:	
			msgArg = args.length + " arguments received";
			break;
		default:
			msgArg = "Too much arguments";
			break;
		}
		return msgArg;
	}
}
