package liaohd01_hw2;
import java.util.Random;
import java.util.Scanner;
public class RPSGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int rngValue;
		int playerWins = 0;
		int computerWins = 0;
		boolean tie = true;
		char playAgain;
		String computerChoice;
		System.out.println("Welcome to the Rock, Paper, Scissors Game. \n");
		System.out.print("Enter your Nick name: ");
		// asks user for their name 
		String name = keyboard.nextLine();
		System.out.println("");
		Random generator = new Random();
		do // loop that allows the user to play as many times as they want
		{
			do // loop that forces the game to be played again if there was a tie
			{	
				rngValue = generator.nextInt(3)+1;
				if (rngValue == 1)
				{
					computerChoice = "Rock";
				}
				else if (rngValue == 2)
				{
					computerChoice = "Paper";
				}
				else
				{
					computerChoice = "Scissors";
				}
				// deciding what the computer's choice is this round 
				System.out.println("choose:  ");
				System.out.println("	r - rock");
				System.out.println("	p - paper");
				System.out.println("	s - scissors");
				System.out.print(">> ");
				String playerChoice = keyboard.nextLine();
				// menu that gives the user choices and asks them to chose 	
				System.out.println("The computer choice is " + computerChoice);
				// displays the computer's choice 
				if (playerChoice.equals("r"))
				{
					if (computerChoice.equals("Rock"))
					{
						System.out.println("It's a tie! please play again");
						tie = true;
					}
					else if (computerChoice.equals("Paper"))
					{
						System.out.println("You lose this round!!");
						computerWins++;
						tie = false;
					}
					else 
					{
						System.out.println("You win this round!!");
						playerWins++;
						tie = false;
					}
					// decides the winner when the player chooses rock
				}
				else if (playerChoice.equals("p"))
				{
					if (computerChoice.equals("Paper"))
					{
						System.out.println("It's a tie! please play again");
						tie = true;
					}
					else if (computerChoice.equals("Scissors"))
					{
						System.out.println("You lose this round!!");
						computerWins++;
						tie = false;
					}
					else 
					{
						System.out.println("You win this round!!");
						playerWins++;
						tie = false;
					}
					// decides the winner when the player chooses paper
				}
				else
				{
					if (computerChoice.equals("Scissors"))
					{
						System.out.println("It's a tie! please play again");
						tie = true;
					}
					else if (computerChoice.equals("Rock"))
					{
						System.out.println("You lose this round!!");
						computerWins++;
						tie = false;
					}
					else 
					{
						System.out.println("You win this round!!");
						playerWins++;
						tie = false;
					}
					// decides the winner when the player chooses scissors
				}
			} while (tie);
			System.out.println(name + ": " + playerWins + " vs. Computer: " + computerWins);
			System.out.printf("\n" + name + ", do you want to play again (y/n)? ");
			playAgain = keyboard.nextLine().charAt(0);
			// lets the user decide if they want to play again 
		} while (playAgain == 'y'|| playAgain == 'Y');
		keyboard.close();
		System.out.println("\n!!! GAME OVER !!!");
		if(computerWins > playerWins)
		{
			System.out.println("The computer wins. \nGood luck next time, " + name + "!!");
		}
		else if(playerWins > computerWins)
		{
			System.out.println("You win! \nNice job, " + name + "!!");
		}
		else
		{
			System.out.println("It's a tie! \nGood luck next time, " + name + "!!");
		}
		// message that is displayed at the end depending on who has won more times 
	}

}
