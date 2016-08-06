/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collaborativetraining;

/**
 *
 * @author VoX
 */
public class CollaborativeTraining {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int prod = a * b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        // strings
        String d, e, f, g;
        d = "My name is ";
        e = "Paul";
        f = d + e;
        g = String.valueOf(a + b);
        System.out.println(f);
        System.out.println("Number converted to string is: " + g);
        //Double
        double h = Double.parseDouble("10.3324");
        h = Math.toRadians(h);
        System.out.println("Math.sin(" + h + ") =" + Math.sin(h));
        //miracle
        System.out.println("sin(a)*sin(a) + cos(a)*cos(a) = " + (Math.sin(h)* Math.sin(h) + Math.cos(h)* Math.cos(h)));
    }
   
}
