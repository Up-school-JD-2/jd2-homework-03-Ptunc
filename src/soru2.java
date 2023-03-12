import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = scan.next();
        char[] reverseWord = new char[word.length()];
        int a = (word.length()-1);
        for (int i = 0; i < word.length(); i++) {
            reverseWord[i] = word.charAt(a);
            a--;
        }
        int count = 0;
        for (int i = 0; i < reverseWord.length; i++) {
            if(reverseWord[i] == word.charAt(i)) count++;
        }
        if(count == reverseWord.length) System.out.println("palindrome.");
        else System.out.println("not palindrome.");

    }
}
