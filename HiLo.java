import java.util.Scanner;


public class HiLo {

	public static void main(String[] args) {
		//get ready for the player to use the keyboard
		Scanner scan = new Scanner(System.in);
		//play again string
		String playAgain = "";
		//game loop
		do {
			// create a random number from 1-100
			int theNumber = (int)(Math.random()*100 + 1);
			
			int guess = 0;
			
			//keep track of the number of tries
			int numberOfTries = 0;
			
			while ( guess != theNumber) {
				System.out.println("Guess a number between 1 and 100:");
				
				//get the users guess
				guess = scan.nextInt();
				
				//add one to the number of tries
				numberOfTries++;
				
				if (guess < theNumber) {
					System.out.println(guess + " is too low. Try again");
				}
				else if (guess > theNumber) {
					System.out.println(guess + " is too high. Try again");
				}
				else  {
					System.out.println(guess + " is correct! You win!");
					
				}
			}//end of while loop for guessing
			if (numberOfTries <= 7) {
				System.out.println("It only took you " + numberOfTries + " tries! Good work!");
			}
			else {
				System.out.println("Wow! It took you a while to guess. " + numberOfTries + " to be exact :(");
			}
			//ask for 'y' to play again
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
			
		}while(playAgain.equalsIgnoreCase("y"));
		//thank the user for playing
		System.out.println("Thank you for playing! Goodbye.");

	}

}
