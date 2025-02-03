
public class Exercise3_3 {
	/*
	 * Check the number of arguments your program receives. If it does not receive
	 * any arguments, notify the user. If it receives up to 4, indicate how many
	 * have been received. If it receives more, notify the user. (Use a Constant)
	 * and dont recycle the code from exercise 3_2
	 */

	public static final int TOOMUCHARGS = 5;

	public static void main(String[] args) {
		System.out.println(checkArgs(args));

	}

	private static String checkArgs (String[] args) {
		String msgArg;
		
		if (args.length < 1) {
			msgArg = "No arguments received";
		}else if (args.length >= TOOMUCHARGS ) {
			msgArg = "Too much arguments";
		}else {
			msgArg = args.length + " arguments received";
		}
		
		return msgArg;
	}
}
