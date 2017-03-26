import java.util.Scanner;

public class intro {
	static String introchoice1;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to AlexCalderon02s RPG!");
		System.out.println("You approach a sign,");
		System.out.println("Press 1 to read.");


		introchoice1 = in.nextLine();
		if (introchoice1.equals("1")){
			// I know. Seems cheap. I could of just done public void, didn't have to call a NEW class. But I like to keep things simple. simple.
			menus.main(args);
		}
		else {
			fakeclearconsole.main(args);
			System.out.println("Sigh, you just started and you going to be like this?");
			intro.main(args);
		}
}
}
	