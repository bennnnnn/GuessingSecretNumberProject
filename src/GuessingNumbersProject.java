import java.util.Random;
import java.util.Scanner;

public class GuessingNumbersProject {
	
	public static void main(String args[]){
	
	int secretNumber; // holds the secret number generated from Random class.
	int  guessNumber ;  // holds the users guess number  
	
	
	Scanner scan = new Scanner(System.in); // Scanner class object for keyboard input
	
	Random rand = new Random();           // Random class object for random numbers.
	
	secretNumber= 1+rand.nextInt(10);
	
	System.out.println("Enter the secret number:");  // prompt the user to enter a guess number
		
	 guessNumber= scan.nextInt(); // get the guess number from the keyboard
	 
	while(guessNumber !=secretNumber){     // if the secret number and the guess number are not the same repeat this
		if(guessNumber > secretNumber)     //  if the guess is greater than secret number tell user it is too high.
		System.out.println("Your guess is too high. try again.");
		else 
			System.out.println( "Your guess too low. try again."); // else tell the customer the guess is too low 
		guessNumber =scan.nextInt();
	 
	}
	
	System.out.println("You got it! " + secretNumber +" is the secret number"); // congratulate the user when knows the number
	}
	}
	 
