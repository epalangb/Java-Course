
public class Exercise4_5 {
	/*
	 * Notify the position of the first argument received that is too long (more
	 * than 10 characters): "The Xth word is too long." (starting from the first) or
	 * "All words are correct." if none exceed that length.
	 */
	private static final int TOO_LONG = 10;
	
	public static void main(String[] args) {
		int i = 0;
		String length = "All words are correct";
		
		while (i != args.length) {
			if (args[i].length() > TOO_LONG) {
				length = "The "+ Integer.valueOf(i+1) +"th word is too long."; 
			}
			i++;
		}
		System.out.println(length);
	}

}
