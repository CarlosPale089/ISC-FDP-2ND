/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_11_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor2;
        int valo;
        int resi;
             Scanner input = new Scanner (System.in);
             System.out.println("Introduce el numero que inicie la lista");
        valo = input.nextInt();
        System.out.println("Introduce el numero en el que termine la lista");
        valor2 = input.nextInt();
        for(int i = valo; i <= valor2; i++){
            resi = i % 2; // saber si el numero es par
            if(resi == 0)
                System.out.print(i + "-");
        }
    }
    
}
