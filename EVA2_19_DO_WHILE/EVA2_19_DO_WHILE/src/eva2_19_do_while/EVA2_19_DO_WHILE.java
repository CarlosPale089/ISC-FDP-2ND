/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_19_DO_WHILE {

  final static String USUARIO = "admin";
    final static String PWD = "admin";
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);  
       String usu, contra;
       do{
        System.out.println("Usuario");
        usu = input.nextLine();
        System.out.println("Contraseña");
        contra = input.nextLine();
       }while(!(usu.equals(USUARIO) && contra.equals(PWD)));
       /* if(usu.equals(USUARIO) && contra.equals(PWD))
        System.out.println("Acceso concedido. Bienvenido al sistema");
        
        else System.out.println("Acceso denegado");*/
        
                }
}
