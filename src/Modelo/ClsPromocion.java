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
public class ClsPromocion implements Serializable {

    String fecha;
    String idPromocion;
    String nombrePromocion;
    double millas;
    double equipaje;
    double valorPromocion;

    public ClsPromocion(String fecha, String idPromocion, String nombrePromocion, double millas, double equipaje, double valorPromocion) {
        this.fecha = fecha;
        this.idPromocion = idPromocion;
        this.nombrePromocion = nombrePromocion;
        this.millas = millas;
        this.equipaje = equipaje;
        this.valorPromocion = valorPromocion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(String idPromocion) {
        this.idPromocion = idPromocion;
    }

    public String getNombrePromocion() {
        return nombrePromocion;
    }

    public void setNombrePromocion(String nombrePromocion) {
        this.nombrePromocion = nombrePromocion;
    }

    public double getMillas() {
        return millas;
    }

    public void setMillas(double millas) {
        this.millas = millas;
    }

    public double getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(double equipaje) {
        this.equipaje = equipaje;
    }

    public double getValorPromocion() {
        return valorPromocion;
    }

    public void setValorPromocion(double valorPromocion) {
        this.valorPromocion = valorPromocion;
    }

}
