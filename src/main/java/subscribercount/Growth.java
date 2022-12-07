package subscribercount;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Scanner;

public class Growth {
    public static void main(String[] args) {
        // y = a(r+1)^x
        // a - initial value
        // r - growth rate
        // x - time interval
        Scanner input = new Scanner(System.in);
        System.out.println("Lets calculate Subscribers count!");
        System.out.println("This program uses y = a (1 + r) ^ x");

        System.out.print("Enter initial value (a): ");
        int a = input.nextInt();

        System.out.print("Enter growth rate value (r): ");
        double r = input.nextDouble();

        System.out.print("Enter time interval in days (x): ");
        int x = input.nextInt();

        System.out.println("Your subscribers count is : " + calculateSubs(a, r, x));

    }

    private static int calculateSubs(int a, double r, int x){
        return (int) (a * Math.pow((1+r), x));
    }
}
