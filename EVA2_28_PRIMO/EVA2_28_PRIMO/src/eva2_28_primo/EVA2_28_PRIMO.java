/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_28_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         int valor;
         boolean esPrimo = true;
        System.out.println("Introduce un valor: ");
        valor = input.nextInt();
       for(int i = 2; i < valor; i++){
           //Dividir exacta
           int residuo = valor % i;
           if(residuo == 0){
               esPrimo = false;// una division exacta ya no es primo
               break;
           }
       }
       if(esPrimo)
            System.out.println("El valor " + valor + "Es primo");
       else{
           System.out.println("El valor " + valor + "No" esprimo);
    }
    }
    
}
