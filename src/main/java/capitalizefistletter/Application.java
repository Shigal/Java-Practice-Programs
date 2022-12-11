package capitalizefistletter;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        String s = "hey there";
        String r = s.substring(0,1).toUpperCase() + s.substring(1);
        System.out.println(r);
    }
}
