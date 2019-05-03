/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mateo
 */
public class ClsCliente extends ClsUsuario {
    double millasRecorridas;

    public ClsCliente(double millasRecorridas, String nombre, String apellido, String genero, String cedula, String correo, String telefono, String password) {
        super(nombre, apellido, genero, cedula, correo, telefono, password);
        this.millasRecorridas = millasRecorridas;
    }

    public double getMillasRecorridas() {
        return millasRecorridas;
    }

    public void setMillasRecorridas(double millasRecorridas) {
        this.millasRecorridas = millasRecorridas;
    }
    
}
