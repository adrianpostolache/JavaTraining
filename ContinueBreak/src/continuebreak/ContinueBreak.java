/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuebreak;

/**
 *
 * @author VoX
 */
public class ContinueBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] numbers = { 10, 20, 30, 40, 50 };
    int sum = 0;
    for (int x : numbers) {
    if (x == 30) {
    continue;
}
    sum += x;
    if (sum > 100) {
    break;
}
    System.out.print(x);
    System.out.print("\n");
}
    System.out.print("sum: " + sum);
    System.out.format("\n");
    }
    
}
