import java.util.Random;
import java.util.Scanner;

public class HotPatato {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int numOfPlayers;
        String allPlayers = "";
        int playerOut;

        System.out.println("Welcome to the HotPatato!");
        System.out.println("Enter the number of players: ");
        numOfPlayers = in.nextInt();
        in.nextLine(); // clear buffer!!!!!!!!!!!!!

        for (int i = 1; i <= numOfPlayers; i++) {
            System.out.println("Enter name of player " + i + ": ");
            allPlayers += in.nextLine() + '\n';
        }

        int randomNum = rand.nextInt(50) + 1;
        playerOut = randomNum % numOfPlayers;
        if (playerOut == 0) {
            playerOut = numOfPlayers;
        }

        Scanner allPlayersScanner = new Scanner(allPlayers);
        String playerOutName = "";
        for (int i = 0; i < playerOut; i++) {
            playerOutName = allPlayersScanner.nextLine();
        }

        System.out.println("The number is " + randomNum + ". Player " + playerOutName + " out!");


    }
}
