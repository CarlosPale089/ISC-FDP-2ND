/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for (int i = 1; i <= 20; i++)
           System.out.println(i + "-");
        System.out.println("");
       for(int i = 0; i <= 100; i+=2)
           System.out.print(i + "-");
        System.out.println("");
          
         for(int i = 100; i >= 1; i-=2)
           System.out.print(i + "-");
        System.out.println("");
        
          int valor2;
        int valo;
             Scanner input = new Scanner (System.in);
             System.out.println("Introduce el numero que inicie la lista");
        valo = input.nextInt();
        System.out.println("Introduce el numero en el que termine la lista");
        valor2 = input.nextInt();
        for(int i = valo; valo <= valor2; valo++)
            System.out.print(valo + "-");
        System.out.println("");
        
        
        
    }
    
}
