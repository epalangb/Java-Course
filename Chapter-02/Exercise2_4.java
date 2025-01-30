
public class Exercise2_4 {

	/*
	 * Write a program that receives seven arguments,
	 * And prints the details of the whole family, one line for each member.
	 * outPrint example: 
	 * java Ejercicio02_04 Gómez García María Lucas Pedro Juan "María Luisa"
	 * Padre: Juan Gómez
	 * Madre: María Luisa García
	 * Hijos:
	 * María Gómez García
	 * Lucas Gómez García
	 * Pedro Gómez García
	 */
	public static void main(String[] args) {
		printName(buildName(args[5], args[0], ""));
		printName(buildName(args[6], args[1], ""));
		System.out.println("Hijos:");
		printName(buildName(args[2], args[0], args[1]));
		printName(buildName(args[3], args[0], args[1]));
		printName(buildName(args[4], args[0], args[1]));	
	}
	
	private static String buildName(String name, String surname1,String surname2) {
		String person = name + " " + surname1 + " " + surname2;
		return person;
	}
	
	private static void printName(String person) {
		System.out.println(person);
	}
}
