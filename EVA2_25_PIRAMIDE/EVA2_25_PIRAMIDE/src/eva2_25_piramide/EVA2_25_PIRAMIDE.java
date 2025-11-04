/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_piramide;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_25_PIRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeticion;
        System.out.println("Introduce un valor: *");
        repeticion = input.nextInt();

        for(int i = 1; i <= repeticion; i++){
          for(int j = 1; j <= i; j++){
              System.out.print("*");
          }
           System.out.println(" ");}
        for (int i = repeticion; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
        }
            System.out.println(" ");
        }
    }
}

    
