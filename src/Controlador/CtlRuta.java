/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsRuta;
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
public class CtlRuta {
    
    public ArrayList<ClsRuta> registrarRuta(ArrayList<ClsRuta> listaRuta, String origen, String destino, String numeroRuta){
            try {          
           if(listaRuta.isEmpty()){
               ClsRuta  ruta = new ClsRuta(origen, destino, numeroRuta);
               listaRuta.add(ruta);
               JOptionPane.showMessageDialog(null, "Ruta Registrada");
           } else{
               
               for (int i = 0; i < listaRuta.size(); i++) {
                 
                   if(numeroRuta.equals(listaRuta.get(i).getNumeroRuta())){
                       JOptionPane.showMessageDialog(null, "Esta ruta ya existe");
                       break;
                   }else{
                       ClsRuta ruta = new ClsRuta(origen, destino, numeroRuta);
                       listaRuta.add(ruta);
                       JOptionPane.showMessageDialog(null, "Ruta Registrada");
                       break;
                   }       
               }
           }
   
       } catch (Exception e){
           System.out.println(e.toString());
       }
        return listaRuta;
    }
    
    public ClsRuta buscarRuta (ArrayList<ClsRuta> listaRuta, String numeroRuta){
         ClsRuta ruta = null;
       
         int encontrado  = 0;
         
         try{
             for (int i = 0; i < listaRuta.size(); i++) {
                 
                 if(numeroRuta.equals(listaRuta.get(i).getNumeroRuta())){
                     ruta = listaRuta.get(i);
                     encontrado++;
                     break;
                 }
             }
           if(encontrado == 0){
               JOptionPane.showMessageDialog(null, "No se encontro ninguna ruta con ese numero");
           }  
   
         }catch (Exception e){
         System.out.println(e.toString());
         }
       return ruta;
    }
    
    public ArrayList <ClsRuta> EliminarRuta(ArrayList<ClsRuta> listaRuta, String numeroRuta){
        int encontrado = 0;
        for (int i = 0; i < listaRuta.size(); i++) {
            if(numeroRuta.equals(listaRuta.get(i).getNumeroRuta())){
                listaRuta.remove(i);
                JOptionPane.showMessageDialog(null, "Ruta Eliminada Exitosamente");
                encontrado++;
                break;
            }
        }
        if(encontrado == 0){
            JOptionPane.showMessageDialog(null, "No se encontro ninguna ruta con ese numero");
            
        }               
        return listaRuta;
    }
    
    public ArrayList<ClsRuta> modificarRuta(ArrayList<ClsRuta> listaRuta, String origen, String destino, String numeroRuta){
        int encontrado = 0;
        for (int i = 0; i < listaRuta.size(); i++) {
            if(numeroRuta.equals(listaRuta.get(i).getNumeroRuta())){
                
              
                listaRuta.get(i).setOrigen(origen);
                listaRuta.get(i).setDestino(destino);
               
                
                JOptionPane.showMessageDialog(null, "Ruta Modificada");
                encontrado++;
                break;
            } 
        }
        if(encontrado == 0){
            JOptionPane.showMessageDialog(null, "No se encontro ninguna ruta con ese numero");
        }
  
        
        return listaRuta;
    }
    
    public DefaultTableModel listarElementos(ArrayList<ClsRuta> listaRuta){
       DefaultTableModel modelo;
       String nombreColumnas [] = {"Origen", "Destino", "Numero Ruta"};
       modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
       
       try{
          
           for (int i = 0; i < listaRuta.size(); i++) {
               
               modelo.addRow(new Object[]{listaRuta.get(i).getOrigen(), listaRuta.get(i).getDestino(),  listaRuta.get(i).getNumeroRuta()});
               
           }
       
       }catch(Exception e){
           System.out.println(e.toString());
       }
   
        return modelo;
    }
    
      public String guardarArchivo(ArrayList<ClsRuta> listaRuta) {
        FileOutputStream archivo = null; //reservar en memoria un espacio para la creacion del archivo

        try {
            archivo = new FileOutputStream("Ruta.dat");
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
            escrituraArchivo.writeObject(listaRuta);// ingresar el listado al archivo creado
            return "Se guardo correctamente";
        } catch (Exception e) {
            return "Error almacenando la informacion";
        }

    }

    public ArrayList<ClsRuta> cargarArchivo(ArrayList<ClsRuta> listaRuta) {
        FileInputStream archivo = null; // se reserva el espacio en memoria para el archivo que se va a cargar

        try {
            archivo = new FileInputStream("Ruta.dat");//se lee el archivo creado en el guardar
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
            listaRuta = (ArrayList<ClsRuta>) lecturaArchivo.readObject();// se saca la informacion del archivo cargado
        } catch (Exception e) {
            //return "Error cargando la informacion";
        }
        return listaRuta;
        // return "Archivo cargado correctamente";
    }
    
    
    
    
    
    
    
    
    
}
