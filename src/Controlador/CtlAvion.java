/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.ClsAvion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier Parra
 */
public class CtlAvion {
    
    public ArrayList<ClsAvion> registrarAvion(ArrayList<ClsAvion> listaAvion, String serial, String codigoPiloto, String nombrePiloto, String codigoAzafata, String nombreAzafata, int capacidad ){
        
       try {
           
           if(listaAvion.isEmpty()){
               ClsAvion  avion = new ClsAvion(serial, codigoPiloto, nombrePiloto, codigoAzafata, nombreAzafata, capacidad);
               listaAvion.add(avion);
               JOptionPane.showMessageDialog(null, "Avion Registrado");
           } else{
               
               for (int i = 0; i < listaAvion.size(); i++) {
                 
                   if(serial.equals(listaAvion.get(i).getSerial())){
                       JOptionPane.showMessageDialog(null, "Este Avion ya existe");
                       break;
                   }else{
                       ClsAvion  avion = new ClsAvion(serial, codigoPiloto, nombrePiloto, codigoAzafata, nombreAzafata, capacidad);
                       listaAvion.add(avion);
                       JOptionPane.showMessageDialog(null, "Avion Registrado");
                       break;
                   }
        
               }
           }
   
       } catch (Exception e){
           System.out.println(e.toString());
       }
   
        return listaAvion;
    }
    
    public ClsAvion buscarAvion(ArrayList<ClsAvion> listaAvion, String serial){
         ClsAvion avion = null;
       
         int encontrado  = 0;
         
         try{
             for (int i = 0; i < listaAvion.size(); i++) {
                 
                 if(serial.equals(listaAvion.get(i).getSerial())){
                     avion = listaAvion.get(i);
                     encontrado++;
                     break;
                 }
             }
           if(encontrado == 0){
               JOptionPane.showMessageDialog(null, "No se encontro ningun avion con ese serial");
           }  
   
         }catch (Exception e){
         System.out.println(e.toString());
         }
       return avion;
    }
    
    public ArrayList <ClsAvion> EliminarAvion(ArrayList<ClsAvion> listaAvion, String serial){
        int encontrado = 0;
        for (int i = 0; i < listaAvion.size(); i++) {
            if(serial.equals(listaAvion.get(i).getSerial())){
                listaAvion.remove(i);
                JOptionPane.showMessageDialog(null, "Avion Eliminado Exitosamente");
                encontrado++;
                break;
            }
        }
        if(encontrado == 0){
            JOptionPane.showMessageDialog(null, "No se encontro ningun avion con ese serial");
            
        }               
        return listaAvion;
    }
    
    public ArrayList<ClsAvion> modificarAvion(ArrayList<ClsAvion> listaAvion, String serial,String codigoPiloto, String nombrePiloto, String codigoAzafata, String nombreAzafata, int capacidad  ){
        int encontrado = 0;
        for (int i = 0; i < listaAvion.size(); i++) {
            if(serial.equals(listaAvion.get(i).getSerial())){
                
              
                listaAvion.get(i).setCapacidad(capacidad);
                listaAvion.get(i).setCodigoPiloto(codigoPiloto);
                listaAvion.get(i).setNombrePiloto(nombrePiloto);
                listaAvion.get(i).setCodigoAzafata(codigoAzafata);
                listaAvion.get(i).setNombreAzafata(nombreAzafata);
                
                JOptionPane.showMessageDialog(null, "Avion Modificado");
                encontrado++;
                break;
            } 
        }
        if(encontrado == 0){
            JOptionPane.showMessageDialog(null, "No se encontro ningun avion con ese serial");
        }
  
        
        return listaAvion;
    }
    
    
    public DefaultTableModel listarElementos(ArrayList<ClsAvion> listaAvion){
       DefaultTableModel modelo;
       String nombreColumnas [] = {"Serial", "Capacidad", "Codigo Piloto", "Nombre Piloto", "Codigo Azafata", "Nombre Azafata"};
       modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
       
       try{
          
           for (int i = 0; i < listaAvion.size(); i++) {
               
               modelo.addRow(new Object[]{listaAvion.get(i).getSerial(), listaAvion.get(i).getCapacidad(),  listaAvion.get(i).getCodigoPiloto(), listaAvion.get(i).getNombrePiloto(),
                   
               listaAvion.get(i).getCodigoAzafata(), listaAvion.get(i).getNombreAzafata()});
               
           }
       
       }catch(Exception e){
           System.out.println(e.toString());
       }
   
        return modelo;
    }
    
    public String guardarArchivo(ArrayList<ClsAvion> listaAvion) {
        FileOutputStream archivo = null; //reservar en memoria un espacio para la creacion del archivo

        try {
            archivo = new FileOutputStream("Avion.dat");
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
            escrituraArchivo.writeObject(listaAvion);// ingresar el listado al archivo creado
            return "Se guardo correctamente";
        } catch (Exception e) {
            return "Error almacenando la informacion";
        }

    }

    public ArrayList<ClsAvion> cargarArchivo(ArrayList<ClsAvion> listaAvion) {
        FileInputStream archivo = null; // se reserva el espacio en memoria para el archivo que se va a cargar

        try {
            archivo = new FileInputStream("Avion.dat");//se lee el archivo creado en el guardar
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
            listaAvion = (ArrayList<ClsAvion>) lecturaArchivo.readObject();// se saca la informacion del archivo cargado
        } catch (Exception e) {
            //return "Error cargando la informacion";
        }
        return listaAvion;
        // return "Archivo cargado correctamente";
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
