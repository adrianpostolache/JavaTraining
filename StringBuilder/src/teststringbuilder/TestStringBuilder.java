/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststringbuilder;

/**
 *
 * @author VoX
 */
public class TestStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        
        //2 a)
        StringBuilder sbu = new StringBuilder("0123456789");
        System.out.println(sbu.length());
        
        //2 b)
        String sbh = "Did Hannah see bees? Hannah did.";
        System.out.println(sbh.length());
        System.out.println(sbh.charAt(12));
        
        //2 c)
        System.out.println(sbh.indexOf("b"));
        System.out.println(sbh.charAt(15));
        
        //3
        System.out.println(sbh.substring(9,12));
        
        
    }
    
}
