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
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("gato", "gato", "gato", "perro", "flor", "piedra", "sol", "Luna", "estrella", "montaña", "agua", "Arroz", "azucar", "Gato", "Perro", "Manzana", "Sol", "Luna", "Estrella", "Cielo", "sol", "Montaña", "Río", "Mar", "Noche", "perro", "flor", "piedra", "perro", "flor", "piedra", "perro", "flor", "piedra", "Árbol", "Viento", "Flor", "Viento", "Agua", "Piedra", "Lluvia", "Fuego", "Flor", "Viento", "Agua", "Vaca", "León", "Tigre", "Delfín", "Gato", "Coche", "Camión", "Avión", "Tren", "Lámpara", "Silla", "Mesa", "Libro", "Pelota", "Zapato", "Pantalón", "Camisa", "Falda", "Sombrero", "Ratón", "Conejo", "Águila", "Plátano", "Kiwi", "Naranja", "Fresa", "Cereza", "Pera", "Mango", "Papaya", "Uva", "Carro", "Bicicleta", "Mochila", "Espejo", "Reloj", "Teclado", "Computadora", "Teléfono", "Casa", "Ventana", "Puerta", "Almohada", "Sofá", "Refrigerador", "Cocina", "Cortina", "Escalera", "Fruta", "Dulce", "Pastel", "Tarta", "Pan", "Leche", "Café", "Té", "Chocolate", "Pizza", "Pasta", "Empanada", "Arroz", "Sopa", "Tortilla", "Ensalada", "Queso", "Pollo", "Carne", "Pescado", "Verdura", "Espinaca", "Zanahoria", "Tomate", "Cebolla", "Ajo", "Pimiento", "Pepino", "Lechuga", "Maíz", "Frijoles", "Garbanzo", "Arroz", "Azúcar", "Sal", "Pimienta", "Aceite", "Vinagre", "Salsa", "Mostaza", "Mantequilla", "Yogur", "Helado", "Miel", "Frambuesa", "Mora", "Sandía", "Melón", "Limón", "Nuez", "Almendra", "Pecan", "Cacahuate"
        ));
        System.out.println("Filtrar los nombres que comiencen con 'A'.");
        

            nombres.stream()
               .filter(nombre -> nombre.charAt(0) == 'A') 
               .forEach(System.out::println);

        
        System.out.println("");
        System.out.println("Convertir todos los nombres a mayusculas.");
        System.out.println("");
          nombres.stream()
               .map(String::toUpperCase)
                  
               .forEach(System.out::println); 
          System.out.println("Contar cuantos nombres tienen mas de 5 letras.");
        long contador = nombres.stream()
                               .filter(nombre -> nombre.length() > 5) 
                               .count();
        
        
        System.out.println("Hay " + contador + " palabras con mas de 5 letras.");

        System.out.println("");
              
             nombres.stream()
               .distinct() 
               .forEach(palabra -> {
                   long repeticiones = nombres.stream()
                                               .filter(p -> p.equals(palabra)) 
                                               .count(); 
                   System.out.println( palabra + "' se repite " + repeticiones + " veces.");
               });
         
           

        

    }

}
