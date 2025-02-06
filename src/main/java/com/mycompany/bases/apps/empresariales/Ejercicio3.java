package com.mycompany.bases.apps.empresariales;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DIEGO ANDRES
 */
public class Ejercicio3 {
    public static void main(String[] args) {
         ArrayList<String> nombres = new ArrayList<>(Arrays.asList( "gato", "perro", "flor", "piedra", "sol", "Luna", "estrella", "montaña", "Agua","Arroz","azucar"
        ));
         System.out.println("Filtrar los nombres que comiencen con 'A'.");
          for (int i = 0; i < nombres.size(); i++) {
              
                char [] letra =nombres.get(i).toCharArray();
              if('A'==(letra[0])){
                  
                  System.out.println(nombres.get(i));
              }
           
        }
          System.out.println("");
          System.out.println("Convertir todos los nombres a mayusculas.");
          System.out.println("");
           for (int i = 0; i < nombres.size(); i++) {
                
                System.out.println(nombres.get(i).toUpperCase());
            }
           int contador=0;
            System.out.println("Contar cuantos nombres tienen mas de 5 letras.");
            for (int i = 0; i < nombres.size(); i++) {
               
               
                if(nombres.get(i).length()>5){
                    contador++;
                }
                
            }
            System.out.println("Hay"+contador+"palabras con 5 letras");
            
            
          
    }
   
    
}
