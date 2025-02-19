import java.util.Scanner;

public class RockScissorsPaper {
	// Scanner
	private static Scanner sc;
	// Action "Commands"
	private static final String ROCK = "R";
	private static final String PAPER = "P";
	private static final String SCISSORS = "S";
	// Control "Commands"
	private static final String HELP = "H";
	private static final String EXIT = "E";
	// Aux Structures
	private static final String[] GAME = { ROCK, PAPER, SCISSORS };
	// Game Messages
	private static final String WELCOME_MSG = "Hi! You are about to play Rock, Scissors, Papper!"
			+ "\n\nLet me introduce you the rules:";
	private static final String RULES_MSG = "Rock beats Scissors and lose against Papper.\nScissor beats Papper and lose against Rock."
			+ "\nPapper beats Rock and lose against Scissors.";
	private static final String COMMANDS_MSG = "For choosing your move you can type [R] for Rock [S] for Scissors and [P] for papper."
			+ "Additionaly you can Exit the game with [E], or ask for help with [H]." + "\n\nLet's play!";
	private static final String ASK_FOR_MOVE_MSG = "\nWhat you want to do?";
	private static final String WIN_MSG = "CONGRATULATION! YOU WIN!";
	private static final String LOOSE_MSG = "Sorry buddy, you lose";
	private static final String DRAW_MSG = "It's a Draw!";
	private static final String ERROR_MSG = "An Error has ocurred. Please check your answer and try again.";
	private static final String EXIT_MSG = "See you soon! Thanks for playing!";
	// Management "Commands"
	private static int ERROR_CASE = -1;
	private static int HELP_CASE = -2;
	private static int EXIT_CASE = -3;

	public static void main(String[] args) {
		// This int controls the reponse and the loop
		int control = 0;
		// Welcomes player
		welcomePlayer();
		// This loop allow you to play till you execute EXIT
		while (control != -3) {
			// First we get the Computer move
			String computerMove = randomMove();
			// We translate the response to and index
			int computerResponse = translateResponse(computerMove);

			// Second we ask the user for a Move
			String userMove = askForMove();
			// Again we translate the response to and index
			int userResponse = translateResponse(userMove);

			// Now we manage both responses
			switch (userResponse) {
			case -3:
				showMsg(EXIT_MSG);
				control = userResponse;
				break;
			case -2:
				showMsg(RULES_MSG);
				control = userResponse;
				break;
			case -1:
				showErrorMsg();
				control = userResponse;
				break;
			default:
				decideWinner(computerResponse, userResponse);
				System.out.println("Your move was: " + userMove + " And Computer move is: " + computerMove);
				break;
			}
		}
		sc.close();

	}

	/**
	 * Welcomes the player printing WELCOME and RULES_msg
	 */
	private static void welcomePlayer() {
		System.out.println(WELCOME_MSG);
		showMsg(RULES_MSG);
		showMsg(COMMANDS_MSG);
	}

	private static void showErrorMsg() {
		System.out.println(ERROR_MSG);
		showMsg(RULES_MSG);
	}

	private static void showMsg(String msg) {
		System.out.println(msg);
	}

	/**
	 * Generates Random move
	 * 
	 * @return command String R, S or P
	 */
	private static String randomMove() {
		int randomMove = (int) (Math.random() * GAME.length);
		return GAME[randomMove];
	}

	/**
	 * Ask user for move
	 * 
	 * @return user response (R,S,P,E,H,other)
	 */
	private static String askForMove() {
		System.out.println(ASK_FOR_MOVE_MSG);
		sc = new Scanner(System.in);
		String userResponse = sc.nextLine();

		return userResponse;
	}

	/**
	 * Translate the user response to number
	 * 
	 * @param response
	 * @return match return a number between 0 and 2, error returns -1, help returns
	 *         -2, exit returns -3
	 */
	private static int translateResponse(String response) {
		for (int i = 0; i < GAME.length; i++) {
			if (GAME[i].equalsIgnoreCase(response)) {
				return i;
			}
		}
		if (response.equalsIgnoreCase(HELP)) {
			return HELP_CASE;
		} else if (response.equalsIgnoreCase(EXIT)) {
			return EXIT_CASE;
		}
		return ERROR_CASE;
	}

	/**
	 * Subtract computerResponse from userResponse if result is negative number we add arrayLength to get a result 
	 * between 0 and 2; in case 0 we have a draw, in case 1 player wins and in case 2 computer wins
	 * @param computerResponse
	 * @param userResponse
	 */
	private static void decideWinner(int computerResponse, int userResponse) {
		int gameResult = userResponse - computerResponse;
		//If result is negative we add arrayLength
		if (gameResult < 0) {
			gameResult += GAME.length;
		}
		if (gameResult == 0) {
			showMsg(DRAW_MSG);
		} else if (gameResult == 1) {
			showMsg(WIN_MSG);
		} else if (gameResult == 2) {
			showMsg(LOOSE_MSG);
		}
	}

}
