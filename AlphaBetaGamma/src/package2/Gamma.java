/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

import package1.Alpha;

/**
 *
 * @author VoX
 */
public class Gamma {
    public int publicGamma = 34;
    protected int protectedGamma = 36;
    private int privateGamma = 38;
    int packageGamma = 40;

private void testAccess() {
    Alpha newObject = new Alpha();
    
    newObject.publicAlpha = 100;
    newObject.protectedAlpha = 100;
    newObject.privateAlpha = 100;
    newObject.packageAlpha = 100;
}
}
