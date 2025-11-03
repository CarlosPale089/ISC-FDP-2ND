/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_break;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_21_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int valor, adivinar;
        adivinar = (int)(Math.random() * 5) +1;
  
        
        while(true){
            System.out.println("Adivina el numero. -1 para terminar");
            valor = input.nextInt();
            
            if(valor == adivinar){
                System.out.println("Felicidades, adivinaste");
                break;
            }
            if(valor == -1)
                break;
        }
                   System.out.println("Gracias por jugar");
        }
        
    }
    
}
