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
    
    
    public DefaultTableModel listarElementos(ArrayList<ClsAvion> listaAvion){
       DefaultTableModel modelo;
       String nombreColumnas [] = {"Serial", "Capacidad", "Codigo Piloto", "Nombre Piloto", "Codigo Azafata", "Nombre Azafata"};
       modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
       
       try{
          
           for (int i = 0; i < listaAvion.size(); i++) {
               
               modelo.addRow(new Object[]{listaAvion.get(i).getSerial(), listaAvion.get(i).getCodigoPiloto(), listaAvion.get(i).getNombrePiloto(), listaAvion.get(i).getCodigoAzafata(),
                   
               listaAvion.get(i).getNombreAzafata(), listaAvion.get(i).getCapacidad()});
               
           }
       
       }catch(Exception e){
           System.out.println(e.toString());
       }
   
        return modelo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
