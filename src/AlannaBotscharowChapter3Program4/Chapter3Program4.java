package AlannaBotscharowChapter3Program4;
import java.util.Scanner; 
/*
 * Alanna Botscharow
 * 10/18
 * This program converts pounds into kilograms.
 */
public class Chapter3Program4 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		// Prompt the user for input. (pounds)
			System.out.println("Please enter the number of pounds that you would like to convert into kilograms.");
		//Declare the variable for the input
			double lbs = input.nextDouble();
		//Convert pounds to kilograms. 
			//one pound = 0.454 kilograms. 
			double kg = lbs * 0.454; 
		//Display the results 
			System.out.println("The total amount of kilograms is: "+kg);
	}

}
