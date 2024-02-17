import java.util.Scanner;
// Write a program which validate whether given string is palindrome
// (A palindrome is a sequence of characters which reads the same backward as forward, such as madam or racecar)

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type the word: ");
        String word = scan.next();
        int len = word.length();
        int p = 0;
        for (int i = 0; i <= ((len/2) - 1); i++ ) {
            char a = word.charAt(i);
            char b = word.charAt((len-i-1));
            System.out.println(a + " " + b);
            if (a == b) {
                p = p + 1;
            }
            System.out.println(p);
        }
        if (p == len/2) {
            System.out.println("The word is palindrome");
        }
        else {
            System.out.println("The word is NOT palindrome");
        }
    }
}
