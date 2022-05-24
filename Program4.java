/**
 * prompt the user for their age and determine whether the user can drink alcohol or not
 * Welcome the user
 * Prompt the for their age
 * wait for the user's input and store that input into a variable
 * Check if the age/the age of the user is 21 or greater
 * Output the right message according, whether the user can drink alcohol or not
 * @author staceya
 *
 */
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int age;
		System.out.println("what's your age?: ");
		age = scnr.nextInt();
		
		if(age >= 21) {
			System.out.println("you can drink");
		}
		else if (age <= 21){
			System.out.println("you can not drink");
		}
		
		

	}

}
