/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsCliente;
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
public class CtCliente {

    public ArrayList<ClsCliente> registrarCliente(ArrayList<ClsCliente> listacliente, double millasRecorridas, String nombre, String apellido, String genero, String cedula, String correo, String telefono, String password) {
        try {
            if (listacliente.isEmpty()) {
                ClsCliente cliente = new ClsCliente(millasRecorridas, nombre, apellido, genero, cedula, correo, telefono, password);
                listacliente.add(cliente);
                JOptionPane.showMessageDialog(null, "Cliente registrado");
            } else {
                for (int i = 0; i < listacliente.size(); i++) {
                    if (cedula.equals(listacliente.get(i).getCedula())) {
                        JOptionPane.showMessageDialog(null, "Cliente ya existente");
                    } else {
                        ClsCliente cliente = new ClsCliente(millasRecorridas, nombre, apellido, genero, cedula, correo, telefono, password);
                        listacliente.add(cliente);
                        JOptionPane.showMessageDialog(null, "Cliente registrado");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listacliente;
    }

    public ClsCliente buscarCliente(ArrayList<ClsCliente> listaCliente, String cedula) {
        ClsCliente cliente = null;
        int encontrado = 0;
        try {
            for (int i = 0; i < listaCliente.size(); i++) {
                if (cedula.equals(listaCliente.get(i).getCedula())) {
                    cliente = listaCliente.get(i);
                    encontrado++;
                    break;
                }
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningún cliente con esa cedula");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return cliente;
    }

    public ArrayList<ClsCliente> eliminarCliente(ArrayList<ClsCliente> listaCliente, String cedula) {
        try {
            int encontrado = 0;

            for (int i = 0; i < listaCliente.size(); i++) {
                if (cedula.equals(listaCliente.get(i).getCedula())) {
                    listaCliente.remove(i);
                    JOptionPane.showMessageDialog(null, "Cliente eliminado");
                    encontrado++;
                    break;
                }
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningún cliente con esa cedula");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listaCliente;
    }

    public ArrayList<ClsCliente> modificarCliente(ArrayList<ClsCliente> listaCliente, double millasRecorridas, String nombre, String apellido, String genero, String cedula, String correo, String telefono, String password) {
        int encontrado = 0;
        try {
            for (int i = 0; i < listaCliente.size(); i++) {
                if (cedula.equals(listaCliente.get(i).getCedula())) {
                    listaCliente.get(i).setNombre(nombre);
                    listaCliente.get(i).setApellido(apellido);
                    listaCliente.get(i).setGenero(genero);
                    listaCliente.get(i).setCorreo(correo);
                    listaCliente.get(i).setTelefono(telefono);
                    listaCliente.get(i).setPassword(password);
                    listaCliente.get(i).setMillasRecorridas(millasRecorridas);
                    JOptionPane.showMessageDialog(null, "Cliente modificado");
                    encontrado++;
                    break;

                }
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningún cliente con esa cedula");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listaCliente;
    }

    public DefaultTableModel listarElementos(ArrayList<ClsCliente> listaCliente) {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"Cedula", "Nombre", "Apellido", "Genero", "Correo", "Telefono", "Millas recorridas"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        try {
            for (int i = 0; i < listaCliente.size(); i++) {
                modelo.addRow(new Object[]{listaCliente.get(i).getCedula(), listaCliente.get(i).getNombre(), listaCliente.get(i).getApellido(), listaCliente.get(i).getGenero(), listaCliente.get(i).getCorreo(), listaCliente.get(i).getTelefono(), listaCliente.get(i).getMillasRecorridas()});
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return modelo;
    }
     public String guardarArchivo(ArrayList<ClsCliente> listaCliente) {
        FileOutputStream archivo = null; //reservar en memoria un espacio para la creacion del archivo

        try {
            archivo = new FileOutputStream("Cliente.dat");
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
            escrituraArchivo.writeObject(listaCliente);// ingresar el listado al archivo creado
            return "Se guardo correctamente";
        } catch (Exception e) {
            return "Error almacenando la informacion";
        }

    }

    public ArrayList<ClsCliente> cargarArchivo(ArrayList<ClsCliente> listaCliente) {
        FileInputStream archivo = null; // se reserva el espacio en memoria para el archivo que se va a cargar

        try {
            archivo = new FileInputStream("Cliente.dat");//se lee el archivo creado en el guardar
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
            listaCliente = (ArrayList<ClsCliente>) lecturaArchivo.readObject();// se saca la informacion del archivo cargado
        } catch (Exception e) {
            //return "Error cargando la informacion";
        }
        return listaCliente;
        // return "Archivo cargado correctamente";
    }
}
