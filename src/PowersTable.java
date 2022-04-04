import java.util.Scanner;

/**
 * Lab 2.3: Powers Table
 * 
 * What will the application do?
 * 	Prompt the user to enter an integer
 * 	Display a table of squares and cubes from 1 to the value entered
 * 	Ask if the user wants to continue
 * 
 * @author Brendan
 *
 */
public class PowersTable {
	
	public static void main(String[] args) {
		System.out.println("Learn your squares and cubes!");
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter an integer:");
			int num = scanner.nextInt();
			generateTable(num);
			//Ask user if they want multiplication table because larger numbers can be a bit overwhelming
			System.out.println("Generate multiplication table? (y/n)");
			if (scanner.next().equalsIgnoreCase("y")) {
				generateMultiplicationTable(num);
			}
			System.out.println("Continue? (y/n)");
		} while(scanner.next().equalsIgnoreCase("y"));
		System.out.println("Goodbye!");
		scanner.close();
	}

	/**
	 * Generates the main table to the command line which contains the cubes and squares of the given integer.
	 * 
	 * @param number The number that we will be getting the cubed and squared versions of.
	 */
	private static void generateTable(int number) {
		//Top row, tab after each column
		String topRow = "Number\tSquared\tCubed";
		System.out.println(topRow);
		//Woo, hard coded dividers!
		System.out.println("=======\t=======\t=====");
		//Print the number, squared, and cubed
		for (int i = 1; i <= number; i++) {
			System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
		}
		System.out.print("\n");
	}
	
	/**
	 * Generates and prints a multiplication table for the given number.
	 * 
	 * @param number The number to generate a multiplication table for.
	 */
	private static void generateMultiplicationTable(int number) {
		//Top row, starting with empty space
		System.out.format("      ");
		//Then adding each number
		for (int i = 1; i <= number; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		
		//Divider row, starting with empty space
		String divider = "      ";
		//This is kind of a guesstimate but it seems accurate
		for (int i = 0; i < number; i++) {
			divider += "----";
		}
		System.out.println(divider);
		
		//Print each row for the actual table
		for (int i = 1; i <= number; i++) {
			System.out.printf("%4d |", i);
			for (int j = 1; j <= number; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
	}
}
