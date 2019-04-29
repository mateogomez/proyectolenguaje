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
    
    
    public ArrayList<ClsPromocion>registrarPromocion(ArrayList<ClsPromocion> listaPromociones,String fecha,String idPromocion, double equipaje, double millas, double valorPromocion){
        
        if(listaPromociones.isEmpty()){
         if(equipaje<10){
             valorPromocion=125000;
             ClsPromocion promocion=new ClsPromocion(fecha, idPromocion, millas, equipaje, valorPromocion);
             listaPromociones.add(promocion);
                 JOptionPane.showMessageDialog(null, "promocion registrado");
         }else {
             for(int i=0;i<listaPromociones.size();i++){
                 if(id)
             }
         }
            
        }
    }
}
