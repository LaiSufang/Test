//import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LangRenKill {
    public static void main(String[] args) {
        // HotPotato Create a project that prompts the user to enter the number of players in a hot potato game.
        // Prompt the user for each player’s name.
        // Create a randomized number between 1 and 50 to generate the number of times the potato will be passed.
        // Output the name of the player that will be out based on them receiving the potato based on the number generated.
        // (Ex. 5 players Tim Sally June Alex Barry Number of passes: 19 Player Out: Alex)
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(50) + 1;
        int playerOut;
        String playerOutName = "";
        int numOfPlayers;

        System.out.println("Enter the number of players: ");
        numOfPlayers = in.nextInt();
        in.nextLine(); // clear buffer!!!!!!!!!!!!!

        playerOut = randomNum % numOfPlayers;

        if (playerOut == 0) {
            playerOut = numOfPlayers;
        }

        for (int i = 1; i <= numOfPlayers; i++) {
            System.out.println("Enter name of player " + i + ": ");
            if (i == playerOut) {
                playerOutName = in.nextLine();
            } else {
                in.nextLine();
            }

        }

        System.out.println("The number is " + randomNum + ".Player " + playerOutName + " out!");






    }
}

