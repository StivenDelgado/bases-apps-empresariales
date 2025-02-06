/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bases.apps.empresariales;

import java.util.List;

/**
 *
 * @author 319PC16
 */
public class Empresa {
    List<Empleado> empleados;

    public Empresa(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public double calcularSalario(){
        double salarios = 0;
        for (Empleado empleado : empleados) {
            salarios += empleado.getSalario();
        }
        return salarios / empleados.size();
    }
}
