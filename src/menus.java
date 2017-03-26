import java.util.Scanner;

public class menus {

	static String chapter = " One.";
	static String menuChoice;
	static String menuTutorial;
	static String menuStats;
	static String menuInventory;
	static String menuChapter;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		fakeclearconsole.main(args);
		System.out.println("Begin with caution. Save is not yet implented.");
		System.out.println("Welcome to AlexCalderon02's RPG.");
		System.out.println("1.) Begin Tutorial (Recommend for first timers).");
		System.out.println("2.) View Stats.");
		System.out.println("3.) View Inventory");
		System.out.println("4.) Begin Chapter" + chapter);
		menuChoice = in.nextLine();
		// Tutorial
		if (menuChoice.equals("1")) {
			menus.tutorial();
		}
		// Stats
		else if (menuChoice.equals("2")) {
			menus.stats();
		}

		// Inventory
		else if (menuChoice.equals("3")) {
			menus.inventory();
		}

		else if (menuChoice.equals("4")) {

		}
		else {
			menus.main(args);
		}
	}

	public static void tutorial() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		fakeclearconsole.main(null);
		System.out.println("Well hello. You have stumbled upon a placeholder");
		
		menuTutorial = in.nextLine();
		if (menuTutorial.equals("1")) {
			menus.main(null);
		}
	}
	
	public static void stats() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		fakeclearconsole.main(null);
		System.out.println("ANOTHER PLACEHOLDER? Lazy dev .-.");
		
		menuStats = in.nextLine();
		if (menuStats.equals("1")) {
			menus.main(null);
		}
	}
	
	public static void inventory() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		fakeclearconsole.main(null);
		System.out.println("Wow. Really lazy dev .-.");
		
		menuInventory = in.nextLine();
		if (menuInventory.equals("1")) {
			menus.main(null);
		}
	}
	
}
