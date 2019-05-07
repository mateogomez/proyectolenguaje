/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsAvion;
import Modelo.ClsVuelo;
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
public class CtVuelos {

    public ArrayList<ClsVuelo> registrarVuelo(ArrayList<ClsVuelo> listaVuelos, String fecha, String horaSalida, String horaLlegada, String numeroVuelo, String estado, String origen, String destino, String serial) {
        try {
            if (listaVuelos.isEmpty()) {
                ClsVuelo vuelo = new ClsVuelo(fecha, horaSalida, horaLlegada, numeroVuelo, estado, origen, destino, serial);
                listaVuelos.add(vuelo);
                JOptionPane.showMessageDialog(null, "Vuelo registrado");
            } else {
                for (int i = 0; i < listaVuelos.size(); i++) {
                    if (numeroVuelo.equals(listaVuelos.get(i).getNumeroVuelo())) {
                        JOptionPane.showMessageDialog(null, "Este vuelo ya existe");
                    } else {
                        ClsVuelo vuelo = new ClsVuelo(fecha, horaSalida, horaLlegada, numeroVuelo, estado, origen, destino, serial);
                        listaVuelos.add(vuelo);
                        JOptionPane.showMessageDialog(null, "Vuelo registrado");
                        break;
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return listaVuelos;
    }

    public ClsVuelo buscarVuelo(ArrayList<ClsVuelo> listaVuelos, String numeroVuelo) {
        ClsVuelo vuelo = null;
        int encontrado = 0;
        try {
            for (int i = 0; i < listaVuelos.size(); i++) {
                if (numeroVuelo.equals(listaVuelos.get(i).getNumeroVuelo())) {
                    vuelo = listaVuelos.get(i);
                    encontrado++;
                    break;
                }
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningún vuelo con ese numero de vuelo");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return vuelo;
    }

    public ArrayList<ClsVuelo> eliminarVuelo(ArrayList<ClsVuelo> listaVuelos, String numeroVuelo) {
        try {
            int encontrado = 0;

            for (int i = 0; i < listaVuelos.size(); i++) {
                if (numeroVuelo.equals(listaVuelos.get(i).getNumeroVuelo())) {
                    listaVuelos.remove(i);
                    JOptionPane.showMessageDialog(null, "vuelo eliminado");
                    encontrado++;
                    break;
                }
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningún vuelo con ese numero de vuelo");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listaVuelos;
    }

    public ArrayList<ClsVuelo> modificarVuelo(ArrayList<ClsVuelo> listaVuelos, String fecha, String horaSalida, String horaLlegada, String numeroVuelo, String estado, String origen, String destino, String serial) {
        int encontrado = 0;
        try {
            for (int i = 0; i < listaVuelos.size(); i++) {
                if (numeroVuelo.equals(listaVuelos.get(i).getNumeroVuelo())) {
                    listaVuelos.get(i).setFecha(fecha);
                    listaVuelos.get(i).setHoraSalida(horaSalida);
                    listaVuelos.get(i).setHoraLlegada(horaLlegada);
                    listaVuelos.get(i).setEstado(estado);
                    listaVuelos.get(i).setOrigen(origen);
                    listaVuelos.get(i).setDestino(destino);
                    listaVuelos.get(i).setSerial(serial);
                    JOptionPane.showMessageDialog(null, "Vuelo modificado");
                    encontrado++;
                    break;

                }
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningún vuelo con ese numero de vuelo");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listaVuelos;
    }

    public DefaultTableModel listarElementos(ArrayList<ClsVuelo> listaVuelos) {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"Fecha", "Numero vuelo", "Avion", "Origen", "Destino", "Hora salida", "Hora llegada", "Estado"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        try {

            for (int i = 0; i < listaVuelos.size(); i++) {
                modelo.addRow(new Object[]{listaVuelos.get(i).getFecha(), listaVuelos.get(i).getNumeroVuelo(), listaVuelos.get(i).getSerial(), listaVuelos.get(i).getOrigen(), listaVuelos.get(i).getDestino(), listaVuelos.get(i).getHoraSalida(), listaVuelos.get(i).getHoraLlegada(), listaVuelos.get(i).getEstado()});
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return modelo;
    }
     public String guardarArchivo(ArrayList<ClsVuelo> listaVuelo) {
        FileOutputStream archivo = null; //reservar en memoria un espacio para la creacion del archivo

        try {
            archivo = new FileOutputStream("Vuelo.dat");
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
            escrituraArchivo.writeObject(listaVuelo);// ingresar el listado al archivo creado
            return "Se guardo correctamente";
        } catch (Exception e) {
            return "Error almacenando la informacion";
        }

    }

    public ArrayList<ClsVuelo> cargarArchivo(ArrayList<ClsVuelo> listaVuelo) {
        FileInputStream archivo = null; // se reserva el espacio en memoria para el archivo que se va a cargar

        try {
            archivo = new FileInputStream("Vuelo.dat");//se lee el archivo creado en el guardar
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
            listaVuelo = (ArrayList<ClsVuelo>) lecturaArchivo.readObject();// se saca la informacion del archivo cargado
        } catch (Exception e) {
            //return "Error cargando la informacion";
        }
        return listaVuelo;
        // return "Archivo cargado correctamente";
    }
}
