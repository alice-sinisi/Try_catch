/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try_catch2;

/**
 *
 * @author alice
 */
public class Try_catch2 {

    /**
     * @param args the command line arguments
     */
    private static Integer a = null;
    public static void main(String[] args) {
        // TODO code application logic here
        
		
	
		// leads to NullPointerException:
		// System.out.println(i.toString());
		try {
			System.out.println(a.toString());
		} catch(NullPointerException e) {
			System.err.println("Caught NullPointerException");
			e.printStackTrace();
		} 
		try {
			a = 10;
			System.out.println(a.toString());
		} catch(NullPointerException e) {
			System.err.println("Caught NullPointerException");
			e.printStackTrace();
		} finally {
			System.out.println("Got through it");
		}
	}	
}
   
    

