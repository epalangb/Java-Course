
public class Exercise4_4 {
	/*
	 * Convert this code from for to while. if (args.length == 1) { int res = 1;
	 * for(int num = Integer.valueOf(args[0]); num > 0; num --) { res *= num; }
	 * System.out.println("Resultado: " + res); } else {
	 * System.err.println("Necesito un argumento, ni más ni menos"); }
	 */
	public static void main(String[] args) {
		if (args.length == 1) {

			int res = 1;
			int num = Integer.valueOf(args[0]);

			while (num > 0) {
				res *= num;
				num--;
			}

//			for (int num = Integer.valueOf(args[0]); num > 0; num--) {
//				res *= num;
//			}

			System.out.println("Resultado: " + res);
		} else {
			System.err.println("Necesito un argumento, ni más ni menos");
		}
	}

}
