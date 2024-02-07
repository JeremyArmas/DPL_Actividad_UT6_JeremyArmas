/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dpl.jeremyarmasproyecto;

import java.util.Scanner;

public class DPLJeremyArmasProyecto {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = reader.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("La suma es " + resultado);

        // Cierra el scanner después de su uso
        reader.close();
    }
}
