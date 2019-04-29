/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsPromocion;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class CtPromocion {

    public ArrayList<ClsPromocion> registrarPromocion(ArrayList<ClsPromocion> listaPromociones, String nombrePromocion, String fecha, String idPromocion, double equipaje, double millas, double valorPromocion) {
        try {
            if (listaPromociones.isEmpty()) {
                if (equipaje <= 10) {
                    valorPromocion = 125000;
                    nombrePromocion = "Viva";
                    millas = 100;
                    ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                    listaPromociones.add(promocion);
                    JOptionPane.showMessageDialog(null, "promocion registrado");
                }
                if (equipaje > 10 && equipaje <= 25) {
                    valorPromocion = 193000;
                    nombrePromocion = "VivaSuper";
                    millas = 110;
                    ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                    listaPromociones.add(promocion);
                    JOptionPane.showMessageDialog(null, "promocion registrado");
                }
                if (equipaje > 25 && equipaje <= 32) {
                    valorPromocion = 296500;
                    nombrePromocion = "VivaMax";
                    millas = 120;
                    ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                    listaPromociones.add(promocion);
                    JOptionPane.showMessageDialog(null, "promocion registrado");
                }
            } else {
                for (int i = 0; i < listaPromociones.size(); i++) {
                    if (idPromocion.equalsIgnoreCase(listaPromociones.get(i).getIdPromocion())) {
                        JOptionPane.showMessageDialog(null, "Promocion ya existente");
                        break;
                    } else {
                        if (equipaje <= 10) {
                            valorPromocion = 125000;
                            nombrePromocion = "Viva";
                            millas = 100;
                            ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                            listaPromociones.add(promocion);
                            JOptionPane.showMessageDialog(null, "promocion registrado");
                        }
                        if (equipaje > 10 && equipaje <= 25) {
                            valorPromocion = 193000;
                            nombrePromocion = "VivaSuper";
                            millas = 110;
                            ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                            listaPromociones.add(promocion);
                            JOptionPane.showMessageDialog(null, "promocion registrado");
                        }
                        if (equipaje > 25 && equipaje <= 32) {
                            valorPromocion = 296500;
                            nombrePromocion = "VivaMax";
                            millas = 120;
                            ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                            listaPromociones.add(promocion);
                            JOptionPane.showMessageDialog(null, "promocion registrado");
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listaPromociones;
    }

    public ClsPromocion buscarPromocion(ArrayList<ClsPromocion> listaPromocion, String idPromocion) {
        ClsPromocion promocion = null;
        int encontrado = 0;
        for (int i = 0; i < listaPromocion.size(); i++) {
            if (idPromocion.equalsIgnoreCase(listaPromocion.get(i).getIdPromocion())) {
                promocion = listaPromocion.get(i);
                encontrado++;
                break;
            }
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "No se encontro ningúna promocion ese id");
        }
        return promocion;
    }
    
     public ArrayList<ClsPromocion> eliminarPromocion(ArrayList<ClsPromocion> listaPromocion, String idPromocion) {
        for (int i = 0; i < listaPromocion.size(); i++) {
            if (idPromocion.equalsIgnoreCase(listaPromocion.get(i).getIdPromocion())) {
                listaPromocion.remove(i);
                JOptionPane.showMessageDialog(null, "Promocion eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro ningúna promocion ese id");
            }
        }
        return listaPromocion;
    }

}
