/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeresult;

/**
 *
 * @author VoX
 */
public class ComputeResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String original ="software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');
        
        /*1*/
        result.setCharAt(0, original.charAt(0));
        System.out.println(result);
        /*2*/
        result.setCharAt(1, original.charAt(original.length()-1));
        System.out.println(result);
        /*3*/
        result.insert(1, original.charAt(4));
        System.out.println(result);
        /*4*/
        result.append(original.substring(1,4));
        System.out.println(result);
        /*5*/
        result.insert(3, (original.substring(index, index+2) + " "));
        
        System.out.println(result);
    }
    
}
