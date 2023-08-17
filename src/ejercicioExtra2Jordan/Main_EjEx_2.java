package ejercicioExtra2Jordan;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicioExtra2Jordan.servicios.CineService;

/**
 *
 * @author Jordan
 */
public class Main_EjEx_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CineService cine = new CineService();
        
//        System.out.println(cine.crearEspectador());
        cine.mostrarSala();
        
        cine.asignarAsiento();
        
        cine.mostrarSala();
        
        
    }
    
}
