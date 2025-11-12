/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_29_CONTRA_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usu;
        int contra;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Introduce tu usuario");
            usu = input.nextLine();
            System.out.println("Introduce tu contraseña");
            contra = input.nextInt();
            if (usu.equals("pale") && contra == 1234) {
                System.out.println("Acceso concedido");
                break;
            } else if (i == 4) {
                System.out.println("Acceso denegado");

            } else {
                System.out.println("VUelvelo a intentar");
                System.out.println("");
            }
        }
    }
}
