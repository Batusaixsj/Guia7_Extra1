/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author MNXC04
 */
public class ServicioCancion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion crearCancion(){
        String ingCancion,ingAutor;
        System.out.println("**** CREACION CANCION ****");
        System.out.print("Titulo Cancion: ");
        ingCancion =leer.next();
        System.out.print("Autor Cancion: ");
        ingAutor = leer.next();
        Cancion cancion1 = new Cancion(ingCancion,ingAutor);
          
        return cancion1;
                
    }
    
    public void mostrarCancion(Cancion cancion1){
        System.out.println(cancion1.toString());
        
    }
    
    
}
