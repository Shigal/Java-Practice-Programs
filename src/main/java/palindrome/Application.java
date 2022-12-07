package palindrome;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        // mom, dad, race car, nurses run

        Scanner input = new Scanner(System.in);

        String str = input.next();
        String reverse = "";
        boolean isPalindrome = true;

        for(int j=str.length()-1; j>=0; j--) {
            reverse += str.charAt(j);
        }
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != reverse.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("A Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }
    }
}

