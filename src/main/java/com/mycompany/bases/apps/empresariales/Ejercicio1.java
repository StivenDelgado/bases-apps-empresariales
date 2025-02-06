/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bases.apps.empresariales;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juand
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 1.1 Numero Primo");
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }

        sc.close();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ejercicio 1.2 Numero Max y Min");

        int[] listaNumeros = new int[10];
        Random rand = new Random();

        for (int i = 0; i < listaNumeros.length; i++) {
            int numeroRandom = rand.nextInt(100); // Número entre 0 y 99
            listaNumeros[i] = numeroRandom;
        }

        int maximo = listaNumeros[0];
        int minimo = listaNumeros[0];
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] > maximo) {
                maximo = listaNumeros[i];
            }
            if (listaNumeros[i] < minimo) {
                minimo = listaNumeros[i];
            }
        }
        
        System.out.println("La lista de numeros aleatorios es:");
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print(listaNumeros[i] + ", ");
            
        }
        System.out.println(" ");
        // Imprimimos el máximo y el mínimo
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);

        System.out.println("-----------------------------------------------------------------");
    }

    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
