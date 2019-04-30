/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
public class CtPromocion {

    public ArrayList<ClsPromocion> registrarPromocion(ArrayList<ClsPromocion> listaPromocion, String fecha, String nombrePromocion, int idPromocion, double equipaje, double millas, double valorPromocion) {
        try {
            if (listaPromocion.isEmpty()) {
                if (equipaje <= 10) {

                    ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                    listaPromocion.add(promocion);
                    JOptionPane.showMessageDialog(null, "promocion registrado");
                }
                if (equipaje > 10 && equipaje <= 25) {
                    ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                    listaPromocion.add(promocion);
                    JOptionPane.showMessageDialog(null, "promocion registrado");
                }
                if (equipaje > 25 && equipaje <= 32) {
                    ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                    listaPromocion.add(promocion);
                    JOptionPane.showMessageDialog(null, "promocion registrado");
                }
            } else {
                for (int i = 0; i < listaPromocion.size(); i++) {

                    if (idPromocion==(listaPromocion.get(i).getIdPromocion())) {
                        JOptionPane.showMessageDialog(null, "Promocion ya existente");
                        break;
                    } else {
                        if (equipaje <= 10) {
                            ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                            listaPromocion.add(promocion);
                            JOptionPane.showMessageDialog(null, "promocion registrado");
                        }
                        if (equipaje > 10 && equipaje <= 25) {
                            ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                            listaPromocion.add(promocion);
                            JOptionPane.showMessageDialog(null, "promocion registrado");
                        }
                        if (equipaje > 25 && equipaje <= 32) {
                            ClsPromocion promocion = new ClsPromocion(fecha, idPromocion, nombrePromocion, millas, equipaje, valorPromocion);
                            listaPromocion.add(promocion);
                            JOptionPane.showMessageDialog(null, "promocion registrado");
                        }
                        if (equipaje > 32) {
                            JOptionPane.showMessageDialog(null, "se excede del peso del equipaje");
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listaPromocion;
    }

    public ClsPromocion buscarPromocion(ArrayList<ClsPromocion> listaPromocion, int idPromocion) {
        ClsPromocion promocion = null;
        try {

            int encontrado = 0;
            for (int i = 0; i < listaPromocion.size(); i++) {
                if (idPromocion==(listaPromocion.get(i).getIdPromocion())) {
                    promocion = listaPromocion.get(i);
                    encontrado++;
                    break;
                }
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningúna promocion ese id");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return promocion;
    }

    public ArrayList<ClsPromocion> eliminarPromocion(ArrayList<ClsPromocion> listaPromocion, int idPromocion) {
        try {
            for (int i = 0; i < listaPromocion.size(); i++) {
                if (idPromocion==(listaPromocion.get(i).getIdPromocion())) {
                    listaPromocion.remove(i);
                    JOptionPane.showMessageDialog(null, "Promocion eliminada");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro ningúna promocion ese id");
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listaPromocion;
    }

    public ArrayList<ClsPromocion> modificarPromocion(ArrayList<ClsPromocion> listaPromocion, String nombrePromocion, String fecha, int idPromocion, double equipaje, double millas, double valorPromocion) {
        try {
            for (int i = 0; i < listaPromocion.size(); i++) {
                if (idPromocion==(listaPromocion.get(i).getIdPromocion())) {
                    listaPromocion.get(i).setNombrePromocion(nombrePromocion);
                    listaPromocion.get(i).setFecha(fecha);
                    listaPromocion.get(i).setEquipaje(equipaje);
                    listaPromocion.get(i).setMillas(millas);
                    listaPromocion.get(i).setValorPromocion(valorPromocion);
                    JOptionPane.showMessageDialog(null, "Promocion modificada");
                } else {
                    JOptionPane.showMessageDialog(null, "no se encontro ninguna promocion con ese id");
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listaPromocion;

    }

    public DefaultTableModel listarElementos(ArrayList<ClsPromocion> listaPromocion) {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"Fecha", "idPromocion", "Nombre promocion", "Equipaje", "Millas", "Valor Promocion"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        try {
            for (int i = 0; i < listaPromocion.size(); i++) {
                modelo.addRow(new Object[]{listaPromocion.get(i).getFecha(), listaPromocion.get(i).getIdPromocion(), listaPromocion.get(i).getNombrePromocion(), listaPromocion.get(i).getEquipaje(), listaPromocion.get(i).getMillas(), listaPromocion.get(i).getValorPromocion()});
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return modelo;
    }

    public String guardarArchivo(ArrayList<ClsPromocion> listapromocion) {
        FileOutputStream archivo = null; //reservar en memoria un espacio para la creacion del archivo

        try {
            archivo = new FileOutputStream("Promocion.dat");
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
            escrituraArchivo.writeObject(listapromocion);// ingresar el listado al archivo creado
            return "Se guardo correctamente";
        } catch (Exception e) {
            return "Error almacenando la informacion";
        }

    }

    public ArrayList<ClsPromocion> cargarArchivo(ArrayList<ClsPromocion> listapromocion) {
        FileInputStream archivo = null; // se reserva el espacio en memoria para el archivo que se va a cargar

        try {
            archivo = new FileInputStream("Promocion.dat");//se lee el archivo creado en el guardar
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
            listapromocion = (ArrayList<ClsPromocion>) lecturaArchivo.readObject();// se saca la informacion del archivo cargado
        } catch (Exception e) {
            //return "Error cargando la informacion";
        }
        return listapromocion;
        // return "Archivo cargado correctamente";
    }
}
