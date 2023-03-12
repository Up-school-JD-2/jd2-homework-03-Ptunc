import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class soru1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String query;
        int guessCount = 0, guess, number;
        //int[] leadershipTable = new int[gameCount];
        List leadershipTable = new ArrayList();
        Random rand = new Random();

        while(true) {
            System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");
            System.out.println("--------------------------------------");
            number = rand.nextInt(1, 20);
            while (true) {
                System.out.print("Guess: ");
                guess = scan.nextInt();
                guessCount++;
                if (number != guess) query = number < guess ? "Too high, try again... " : "Too low, try again... ";
                else {
                    break;
                }
                System.out.println(query);
            }
            System.out.println("Congratulations! You Got It On " + guessCount + ". Guess!");
            System.out.println();
            while (true) {
                System.out.print("Do You Want To Play Again? (Y = 1/ N = 2): ");
                int decision = scan.nextInt();
                if (decision == 2) {
                    System.out.println("Thank You For Playing. Have a Nice Day!");
                    return;
                }
                if (decision == 1) {
                    System.out.println(leadershipTable.size());
                    leadershipTable.add(guessCount);
                    System.out.println("Leadership Table");
                    System.out.println("-----------------");
                    ShowTable(leadershipTable);
                    guessCount = 0;
                    System.out.println();
                    break;
                } else System.out.println("There is No Option Like This. Please Type Again. ");

            }
        }
    }
    static void ShowTable(List leadershipTable){
        for (int i = 0; i< leadershipTable.size(); i++){
            System.out.println((i+1) + ". Game: " + leadershipTable.get(i));
        }
    }
}
