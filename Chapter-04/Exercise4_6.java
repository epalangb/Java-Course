import java.util.Scanner;

public class Exercise4_6 {
	/*
	 * Ask the user to type "abracadabra" and keep insisting until they do it
	 * correctly.
	 */	
	private static String SPELL = "Abracadabra";
	
	public static void main(String[] args) {
		askForSpell();

	}
	private static void askForSpell() {
		System.out.println("Hi! please write the correct spell");
		Scanner sc = new Scanner(System.in);
		String spell = sc.nextLine();
		while (!spell.toString().equals("Abracadabra")) {
			System.out.println("That's not the spell we looking for, type " + SPELL);
			spell = sc.nextLine();
		}
		System.out.println("That's the spell! Congratulations!");
		sc.close();
	}
}
