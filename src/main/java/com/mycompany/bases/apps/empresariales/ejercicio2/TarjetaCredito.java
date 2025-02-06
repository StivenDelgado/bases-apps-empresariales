/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bases.apps.empresariales.ejercicio2;

/**
 *
 * @author 319PC16
 */
public class TarjetaCredito implements Pagable{
    
    @Override
    public void procesarPago() {
        System.out.println("Pagando...");
    }
}
