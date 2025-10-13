/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_mult;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_12_TABLA_MULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, resu;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce tu numero para hacer la tabla de multiplicar");
        num1 = input.nextInt();
        for(int i = 1; i <= 10; i++){
            resu = num1 * i;
            System.out.println(num1 + "x" + i + "=" + resu);
        }
        
        
    }
    
}
