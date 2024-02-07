/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dpl.jeremyarmasproyecto;

import java.util.Scanner;

public class DPLJeremyArmasProyecto {

     /**
     * Función principal que inicia la ejecución del programa.
     * @param args Argumentos de la línea de comandos (no se utilizan en este proyecto).
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.println("Introduce el primer número:");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Introduce el segundo número:");
        int numero3 = scanner.nextInt();

        // Calcular la suma de los dos números
        int resultado = numero1 + numero3;

        // Mostrar el resultado en la pantalla
        System.out.println("La suma es: " + resultado);

        // Cerrar el scanner después de su uso para evitar fugas de recursos
        scanner.close();
    }
}
