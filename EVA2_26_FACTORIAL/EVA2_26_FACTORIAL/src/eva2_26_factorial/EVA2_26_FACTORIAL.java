/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_26_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        int repeticion, factorial = 1;
        System.out.println("Introduce un valor: *");
       repeticion = input.nextInt();
       
       for(int i = 1; i <= repeticion; i++){
           factorial = factorial * i;
       }
        System.out.println("Factorial de " + repeticion + " es = " + repeticion + factorial);
    }
    
}
