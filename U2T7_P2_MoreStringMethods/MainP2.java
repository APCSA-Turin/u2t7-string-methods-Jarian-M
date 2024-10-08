package U2T7_P2_MoreStringMethods;

import java.util.Scanner;

public class MainP2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int pts = 0;
        int numWords = 0;

        System.out.print("Enter first word: ");
        String word = scan.nextLine();
        numWords = 1;

        while(pts<50) {
            System.out.print("Enter next word: ");
            String newWord = scan.nextLine();
            if(newWord.compareTo(word) > 0) {
                pts += 2;
                System.out.println("You've earned 2 pts");
            }
            if(newWord.compareTo(word) < 0) {
                pts -= 5;
                System.out.println("You've lost 5 pts");
            }
            if(newWord.equals(word)) {
                pts -= 10;
                System.out.println("You've lost 10 pts");
            }
            if(word.substring(word.length()-2).equals(newWord.substring(0,2))) {
                pts += 5;
                System.out.println("You've earned 5 pts");
            }
            if((newWord.indexOf(word.substring(0,1))) != -1) {
                pts += 3;
                System.out.println("You've earned 3 pts");
            }
            if(word.length() == newWord.length()) {
                pts += 10;
                System.out.println("You've earned 10 pts");
            }
            word = newWord;
            numWords ++;
        }

        System.out.println("GAME OVER!");
        System.out.println("Score: " + pts);
        System.out.println("How many words used to reach score: " + numWords + " words");
        System.out.println("You can do better than that! \nTry again and try to get a better score!");
        
        scan.close();
    }
}