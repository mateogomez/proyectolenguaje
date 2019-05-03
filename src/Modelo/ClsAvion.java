/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Javier Parra
 */
public class ClsAvion  implements Serializable{
    
    
    String serial, codigoPiloto, nombrePiloto, codigoAzafata, nombreAzafata;
    int capacidad;

    public ClsAvion(String serial, String codigoPiloto, String nombrePiloto, String codigoAzafata, String nombreAzafata, int capacidad) {
        this.serial = serial;
        this.codigoPiloto = codigoPiloto;
        this.nombrePiloto = nombrePiloto;
        this.codigoAzafata = codigoAzafata;
        this.nombreAzafata = nombreAzafata;
        this.capacidad = capacidad;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getCodigoPiloto() {
        return codigoPiloto;
    }

    public void setCodigoPiloto(String codigoPiloto) {
        this.codigoPiloto = codigoPiloto;
    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public String getCodigoAzafata() {
        return codigoAzafata;
    }

    public void setCodigoAzafata(String codigoAzafata) {
        this.codigoAzafata = codigoAzafata;
    }

    public String getNombreAzafata() {
        return nombreAzafata;
    }

    public void setNombreAzafata(String nombreAzafata) {
        this.nombreAzafata = nombreAzafata;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
}
