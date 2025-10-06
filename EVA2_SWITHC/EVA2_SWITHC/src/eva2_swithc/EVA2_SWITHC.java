/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_swithc;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_SWITHC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int opc;
       System.out.println("1. Consultar saldo" + "2. Retirar monto" + "3. Depositar monto" + "Selecciona la operación");
       opc = input.nextInt();
       switch(opc){
           case 1:
               System.out.println("Elegiste imprimir saldo!!");
               break;
           case 2:
               System.out.println("Elegiste retirar dinero!!");
               break;
           case 3:
               System.out.println("Elegiste depositar dinero!!");
           default:
               System.out.println("Opcion incorrecta");
           
    
                
               
    }
       
    }
    
}
