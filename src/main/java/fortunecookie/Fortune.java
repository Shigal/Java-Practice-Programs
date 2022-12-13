package fortunecookie;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Random;

public class Fortune {

    static String[] fortunes = {"Today it's up to you to create the peacefulness you long for",
    "A friend asks only for your time not your money",
    "If you refuse to accept anything but the best, you very often get it",
    "A smile is your passport into the hearts of others",
    "Your high-minded principles spell success",
    "Hard work pays off in the future, laziness pays off now",
    " Enjoy the good luck a companion brings you",
    "You cannot love life until you live the life you love",
    "People are naturally attracted to you",
    "A chance meeting opens new doors to success and friendship",
    "A dream you have will come true"};

    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(11);
        System.out.println(fortunes[r]);
    }
}
