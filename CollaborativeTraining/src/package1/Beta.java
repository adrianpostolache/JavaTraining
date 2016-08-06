/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author VoX
 */
public class Beta {
    public int publicBeta = 18;
    protected int protectedBeta = 20;
    private int privateBeta = 22;
    int packageBeta = 24;
    
public void Beta() {
    publicBeta = 0;
    protectedBeta = 0;
    privateBeta = 0;
    packageBeta = 0;
}

private void testAccess() {
    Alpha newObject = new Alpha();
    
    newObject.publicAlpha = 100;
    newObject.protectedAlpha = 100;
    newObject.privateAlpha = 100;
    newObject.packageAlpha = 100;
}
}