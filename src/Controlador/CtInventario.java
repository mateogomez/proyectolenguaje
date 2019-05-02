/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsInventario;
import Modelo.ClsPromocion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateo
 */
public class CtInventario {

    public ArrayList<ClsInventario> registrarInventario(ArrayList<ClsInventario> listaInventario, String idInventario, String categoria, int cantidad, String nombre) {
        try {
            if (listaInventario.isEmpty()) {
                ClsInventario inventario = new ClsInventario(idInventario, categoria, cantidad, nombre);
                listaInventario.add(inventario);
                JOptionPane.showMessageDialog(null, "Elemento registrado en el inventario");
            } else {
                for (int i = 0; i < listaInventario.size(); i++) {
                    if (idInventario.equals(listaInventario.get(i).getIdInventario())) {
                        JOptionPane.showMessageDialog(null, "Este elemento ya fue registrado");
                        break;
                    } else {
                        ClsInventario inventario = new ClsInventario(idInventario, categoria, cantidad, nombre);
                        listaInventario.add(inventario);
                        JOptionPane.showMessageDialog(null, "Elemento registrado en el inventario");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listaInventario;
    }

    public ClsInventario buscarInventario(ArrayList<ClsInventario> listaInventario, String idInventario) {
        ClsInventario inventario = null;
        int encontrado = 0;
        try {
            for (int i = 0; i < listaInventario.size(); i++) {
                if (idInventario.equals(listaInventario.get(i).getIdInventario())) {
                    inventario = listaInventario.get(i);
                    encontrado++;
                    break;
                }
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningún elemento con ese id");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return inventario;
    }
public ArrayList<ClsInventario> eliminarInventario(ArrayList<ClsInventario> listaPromocion, String idPromocion) {
        int encontrado = 0;
        for (int i = 0; i < listaPromocion.size(); i++) {
            if (idPromocion.equals(listaPromocion.get(i).getIdInventario())) {
                listaPromocion.remove(i);
                JOptionPane.showMessageDialog(null, "Promocion eliminada");
                encontrado++;
                break;

            }
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "No se encontro ningúna promocion con ese id");
        }

        return listaPromocion;
    }

    public ArrayList<ClsInventario> modificarInventario(ArrayList<ClsInventario> listaInventario, String idInventario, String categoria, int cantidad, String nombre) {
        int encontrado = 0;
        for (int i = 0; i < listaInventario.size(); i++) {
            if (idInventario.equals(listaInventario.get(i).getIdInventario())) {
                listaInventario.get(i).setCantidad(cantidad);
                listaInventario.get(i).setCategoria(categoria);
                listaInventario.get(i).setNombre(nombre);
                JOptionPane.showMessageDialog(null, "Elemento del inventario modificado");
                encontrado++;
                break;
            }
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "No se encontro ningún elemento con ese id");
        }

        return listaInventario;

    }
     public DefaultTableModel listarElementos(ArrayList<ClsInventario> listaInventario) {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"Id inventario", "Categoria", "Nombre", "Cantidad"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        try {
            for (int i = 0; i < listaInventario.size(); i++) {
                modelo.addRow(new Object[]{listaInventario.get(i).getIdInventario(), listaInventario.get(i).getCategoria(), listaInventario.get(i).getNombre(), listaInventario.get(i).getCantidad()});
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return modelo;
    }
     public String guardarArchivo(ArrayList<ClsInventario> listaInventario) {
        FileOutputStream archivo = null; //reservar en memoria un espacio para la creacion del archivo

        try {
            archivo = new FileOutputStream("Inventario.dat");
        } catch (Exception e) {
            return "Error creando el archivo";
        }

        ObjectOutputStream escrituraArchivo = null; //creamos un objeto para la escritura en el archivo

        try {
            escrituraArchivo = new ObjectOutputStream(archivo);// se asigna al archivo anteriormente cargado
        } catch (Exception e) {
            return "Error con el archivo";
        }

        try {
            escrituraArchivo.writeObject(listaInventario);// ingresar el listado al archivo creado
            return "Se guardo correctamente";
        } catch (Exception e) {
            return "Error almacenando la informacion";
        }

    }

    public ArrayList<ClsInventario> cargarArchivo(ArrayList<ClsInventario> listaInventario) {
        FileInputStream archivo = null; // se reserva el espacio en memoria para el archivo que se va a cargar

        try {
            archivo = new FileInputStream("Inventario.dat");//se lee el archivo creado en el guardar
        } catch (Exception e) {
            // return "Error cargando el archivo";
        }

        ObjectInputStream lecturaArchivo = null;// definimos un objeto para la lectura del archivo

        try {
            lecturaArchivo = new ObjectInputStream(archivo); // se lo asignamos al archivo leido anteiormente
        } catch (Exception e) {
            //  return "Error con el archivo";
        }

        try {
            listaInventario = (ArrayList<ClsInventario>) lecturaArchivo.readObject();// se saca la informacion del archivo cargado
        } catch (Exception e) {
            //return "Error cargando la informacion";
        }
        return listaInventario;
        // return "Archivo cargado correctamente";
    }
}
