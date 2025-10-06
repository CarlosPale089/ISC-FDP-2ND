/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_exa1;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_EXA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 5000;
        int pin, opc, monto, calculo;
        System.out.println("Introduce el PIN");
        pin = input.nextInt();

        if (pin == 1234) {
            System.out.println("1. Consultar saldo"
                    + "2. Retirar monto"
                    + "3. Depositar monto"
                    + "Selecciona la operación");
            opc = input.nextInt();
            if (opc == 1) {
                System.out.println("Tu saldo es de: " + saldo);
            } else if (opc == 2) {
                System.out.println("Cuanto vas a retirar?");
                monto = input.nextInt();
                if (monto <= saldo) {
                    calculo = saldo - monto;
                    System.out.println("Tu saldo es: " + calculo);
                } else {
                    System.out.println("No cuentas con el saldo suficiente");
                }
            } else if (opc == 3) {
                System.out.println("Cuanto monto vas a depositar?");
                monto = input.nextInt();
                if (monto > 0) {
                    calculo = saldo + monto;
                    System.out.println("Tu saldo es: " + calculo);
                } else {
                    System.out.println("Monto negativo");

                }

            }
        } else {
            System.out.println("Es incorrecto");
        }

    }

}
