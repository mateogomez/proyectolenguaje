/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsAdministrador;
import Modelo.ClsCliente;
import Modelo.ClsEmpleado;
import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class CtLogin {

    public String Login(ArrayList<ClsEmpleado> listaEmpleado, ArrayList<ClsCliente> listaCliente,ClsAdministrador administrador, String tipoUsuario, String cedula, String password) {
        String respuesta = "";
        if (tipoUsuario.equalsIgnoreCase("Empleado")) {
            for (int i = 0; i < listaEmpleado.size(); i++) {
                if ((cedula.equals(listaEmpleado.get(i).getCedula())) && (password.equals(listaEmpleado.get(i).getPassword()))) {
                    respuesta = "Si";
                    break;
                } else {
                    respuesta = "No";
                }
            }
        } else {
            if (tipoUsuario.equalsIgnoreCase("Cliente")) {
                for (int i = 0; i < listaCliente.size(); i++) {
                    if ((cedula.equals(listaCliente.get(i).getCedula())) && (password.equals(listaCliente.get(i).getPassword()))) {
                        respuesta = "Si";
                        break;
                    } else {
                        respuesta = "No";
                    }
                }
            } else {
                 if (tipoUsuario.equalsIgnoreCase("Administrador")){
                     if((cedula.equals(administrador.getUsuario()))&&(password.equals(administrador.getPassword()))){
                         respuesta="Si";
                     }else {
                         respuesta="No";
                     }
                 }
            }
        }
        return respuesta;
    }
}
