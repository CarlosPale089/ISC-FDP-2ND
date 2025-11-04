/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int val;
        int cuenta = 100000;
        do{
            System.out.println("Cantidad a retirar: ");
            val = input.nextInt();
            cuenta = cuenta - val;
            System.out.println("Tu saldo es = " + cuenta);
        }while(cuenta > 0);
                  
                    
        }
    }
    

