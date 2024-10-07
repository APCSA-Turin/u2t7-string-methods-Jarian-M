import java.util.Scanner;

public class MainMethod {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter one word: ");
        String word1 = scan.nextLine();
        System.out.print("Please enter another word: ");
        String word2 = scan.nextLine();

        int len1 = word1.length();
        int len2 = word2.length();
        if(len1 > len2) {
            System.out.println(word1 + " is longer");
        } else {
            if(len2 > len1) {
                System.out.println(word2 + " is longer");
            } else {
                System.out.println(word1 + " and " + word2 + " have the same length");
            }
        }

        String firstHalf1 = word1.substring(0, len1/2);
        String secondHalf1 = word1.substring(len1/2);
        String firstHalf2 = word2.substring(0, len2/2);
        String secondHalf2 = word2.substring(len2/2);
        System.out.println("First half: " + firstHalf1);
        System.out.println("Second half: " + secondHalf1);
        System.out.println("First half: " + firstHalf2);
        System.out.println("Second half: " + secondHalf2);

        int index = (word1.indexOf(word2));
        if(index != -1) {
            System.out.println(word2 + " is found in " + word1 + " at index " + index);
        } else {
            System.out.println(word2 + " is NOT found in " + word1);
        }
        scan.close();
    }
}