/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch3;
import java.lang.ArrayIndexOutOfBoundsException;

/**
 *
 * @author alice
 */
public class TryCatch3 {

    public static int[] Array = new int[10]; // dichiarazione array
    public static void main(String[] args) {
        try {
            Array[10]=20;
        }catch (ArrayIndexOutOfBoundsException x){ 
            System.out.println("Errore"); //stampa errore
            x.printStackTrace(); //visualizza quanto è l'array, se non lo metto stampa solo "Errore"
        }
    }
    
}
