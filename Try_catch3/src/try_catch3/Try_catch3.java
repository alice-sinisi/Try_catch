/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try_catch3;

/**
 *
 * @author alice
 */
public class Try_catch3 {

 private static int[] b = new int[2];	
	public static void main(String[] args) {
		try {
			b[2] = 3;	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Caught ArrayIndexOutOfBoundsException");
			e.printStackTrace();
                }
        }
    
}
