package wpmcounter;/*
 *
 * @author Lawshiga
 *
 */

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
    public static void main(String[] args) throws InterruptedException {

        String[] word = {"Alpha", "Beta", "Gamma", "Theta", "Delta"};

        System.out.println(3);
        TimeUnit.SECONDS.sleep(1);

        System.out.println(2);
        TimeUnit.SECONDS.sleep(1);

        System.out.println(1);
        TimeUnit.SECONDS.sleep(1);

        Random ran = new Random();
        System.out.println(word[ran.nextInt(4)]); // random number from 0 to 4

        System.out.println("Now start typing . . . ");

        double start = LocalTime.now().toNanoOfDay();
        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();
        double end = LocalTime.now().toNanoOfDay();

        double elapsedTime = end - start;
        elapsedTime = elapsedTime/1000000000;
        System.out.println(elapsedTime + " seconds");

        // word count
        // (x characters / 5) / 1min = y wpm

        int numChar = typedWords.length();
        int wpm = (int) ((((double)(numChar / 5) / elapsedTime) * 60));

        System.out.println("Your words per minute is " + wpm);

    }
}
