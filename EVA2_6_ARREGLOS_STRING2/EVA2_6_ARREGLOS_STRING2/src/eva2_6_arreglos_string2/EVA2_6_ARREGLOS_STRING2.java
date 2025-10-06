/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos_string2;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_6_ARREGLOS_STRING2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int dia;
       String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miiercoles", "Jueves", "Viernes", "Sabado"};
        System.out.println("Introduce el dia del numero (0-6) : ");
        dia = input.nextInt();
        System.out.println("El dia es " + diasSemana[dia]);
    }
    
}
