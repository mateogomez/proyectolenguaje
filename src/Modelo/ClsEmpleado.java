/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class ClsEmpleado extends ClsUsuario {
    String cargo;

    public ClsEmpleado(String cargo, String nombre, String apellido, String genero, String cedula, String correo, String telefono, String password) {
        super(nombre, apellido, genero, cedula, correo, telefono, password);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}