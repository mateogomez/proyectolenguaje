/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsEmpleado;
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
public class CtEmpleado {

    public ArrayList<ClsEmpleado> registrarEmpleado(ArrayList<ClsEmpleado> listaEmpleados, String cargo, String nombre, String apellido, String genero, String cedula, String correo, String telefono, String password) {
        try {
            if (listaEmpleados.isEmpty()) {
                ClsEmpleado empleado = new ClsEmpleado(cargo, nombre, apellido, genero, cedula, correo, telefono, password);
                listaEmpleados.add(empleado);
                JOptionPane.showMessageDialog(null, "Empleado registrado");
            } else {
                for (int i = 0; i < listaEmpleados.size(); i++) {
                    if (cedula.equals(listaEmpleados.get(i).getCedula())) {
                        JOptionPane.showMessageDialog(null, "Empleado ya existe");
                        break;
                    } else {
                        ClsEmpleado empleado = new ClsEmpleado(cargo, nombre, apellido, genero, cedula, correo, telefono, password);
                        listaEmpleados.add(empleado);
                        JOptionPane.showMessageDialog(null, "Empleado registrado");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return listaEmpleados;
    }

    public ClsEmpleado buscarEmpleado(ArrayList<ClsEmpleado> listaEmpleado, String cedula) {
        ClsEmpleado empleado = null;
        int encontrado = 0;
        try {
            for (int i = 0; i < listaEmpleado.size(); i++) {
                if (cedula.equals(listaEmpleado.get(i).getCedula())) {
                    empleado = listaEmpleado.get(i);
                    encontrado++;
                    break;
                }
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningún empleado esa cedula");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return empleado;
    }

    public ArrayList<ClsEmpleado> eliminarEmpleado(ArrayList<ClsEmpleado> listaEmpleado, String cedula) {
        int encontrado = 0;
        for (int i = 0; i < listaEmpleado.size(); i++) {
            if (cedula.equals(listaEmpleado.get(i).getCedula())) {
                listaEmpleado.remove(i);
                JOptionPane.showMessageDialog(null, "Empleado eliminado");
                encontrado++;
                break;

            }
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "No se encontro ningún empleado esa cedula");
        }

        return listaEmpleado;
    }

    public ArrayList<ClsEmpleado> modificarEmpleado(ArrayList<ClsEmpleado> listaEmpleado, String cargo, String nombre, String apellido, String genero, String cedula, String correo, String telefono, String password) {
        int encontrado = 0;
        for (int i = 0; i < listaEmpleado.size(); i++) {
            if (cedula.equals(listaEmpleado.get(i).getCedula())) {
                listaEmpleado.get(i).setCargo(cargo);
                listaEmpleado.get(i).setNombre(nombre);
                listaEmpleado.get(i).setApellido(apellido);
                listaEmpleado.get(i).setGenero(genero);
                listaEmpleado.get(i).setTelefono(telefono);
                listaEmpleado.get(i).setPassword(password);

                JOptionPane.showMessageDialog(null, "Empleado modificado");
                encontrado++;
                break;
            }
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "No se encontro ningún empleado esa cedula");
        }

        return listaEmpleado;

    }

    public DefaultTableModel listarElementos(ArrayList<ClsEmpleado> listaEmpleado) {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"Cargo", "Cedula", "Nombre", "Apellido", "Genero", "Correo", "Telefono"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        try {
            for (int i = 0; i < listaEmpleado.size(); i++) {
                modelo.addRow(new Object[]{listaEmpleado.get(i).getCargo(), listaEmpleado.get(i).getCedula(), listaEmpleado.get(i).getNombre(), listaEmpleado.get(i).getApellido(), listaEmpleado.get(i).getGenero(), listaEmpleado.get(i).getCorreo(), listaEmpleado.get(i).getTelefono()});
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return modelo;
    }

    public String guardarArchivo(ArrayList<ClsEmpleado> listaEmpleado) {
        FileOutputStream archivo = null; //reservar en memoria un espacio para la creacion del archivo

        try {
            archivo = new FileOutputStream("Empleado.dat");
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
            escrituraArchivo.writeObject(listaEmpleado);// ingresar el listado al archivo creado
            return "Se guardo correctamente";
        } catch (Exception e) {
            return "Error almacenando la informacion";
        }

    }

    public ArrayList<ClsEmpleado> cargarArchivo(ArrayList<ClsEmpleado> listaEmpleado) {
        FileInputStream archivo = null; // se reserva el espacio en memoria para el archivo que se va a cargar

        try {
            archivo = new FileInputStream("Empleado.dat");//se lee el archivo creado en el guardar
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
            listaEmpleado = (ArrayList<ClsEmpleado>) lecturaArchivo.readObject();// se saca la informacion del archivo cargado
        } catch (Exception e) {
            //return "Error cargando la informacion";
        }
        return listaEmpleado;
        // return "Archivo cargado correctamente";
    }
}
