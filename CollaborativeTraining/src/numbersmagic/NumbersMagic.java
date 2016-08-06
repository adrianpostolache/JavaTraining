/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersmagic;

import java.util.Calendar;

/**
 *
 * @author VoX
 */

public class NumbersMagic {
    public static void main(String[] args) {
        // Math 
        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45; {
        System.out.printf("The absolute value of " + "%.3f is %.3f%n", a, Math.abs(a));
        System.out.printf("The ceiling of " + "%.2f is %.0f%n", b, Math.ceil(b));
        System.out.printf("The floor of " + "%.2f is %.0f%n", b, Math.floor(b));
        System.out.printf("The rint of %.2f" + " is %.0f%n", b, Math.rint(b));
        System.out.printf("The max of %d and " + "%d is %d%n", c, d, Math.max(c, d));
        System.out.printf("The min of %d and " + "%d is %d%n", c, d, Math.min(c, d));
        System.out.format("\n");
    }
        // Math 2
        double x = 11.635;
        double y = 2.76; {
        System.out.printf("The value of " + "E is %.4f%n", Math.E);
        System.out.printf("The exponent of " + "%.3f is %.3f%n", x, Math.exp(x));
        System.out.printf("The logarithm of " + "%.3f is %.3f%n", x, Math.log(x));
        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n", x, y, Math.pow(x, y));
        System.out.printf("sqrt(%.3f) " + "is %.3f%n", x, Math.sqrt(x));
        System.out.printf("primul: " + Math.random() * 10 + "al doilea: " + Math.random() * 10 + "al treilea: " + Math.random() * 10);
        System.out.format("\n");
    }
        // Number formatting
        long z = 461012; {
        System.out.format("\nThe value of z is: %d%n", z);
        System.out.format("The value of z is: %08d%n", z);
        System.out.format("The value of z is: %+8d%n", z);
        System.out.format("The value of z is: %,8d%n", z);
        System.out.format("The value of z is: %+,8d%n", z);
        System.out.format("\n");
    }
        // Calendar
        Calendar w = Calendar.getInstance(); {
        System.out.format("%tB %te, %tY%n", w, w, w);
        System.out.format("%tl:%tM %tp%n", w, w, w);
        System.out.format("%tD%n", w);
        System.out.format("\n");
    }
        // PI
        double pi = Math.PI; {
        System.out.format("%f%n", pi);
        System.out.format("%.3f%n", pi);
        System.out.format("%10.3f%n", pi);
        System.out.format("%-10.3f%n", pi);
    }
    }
}
