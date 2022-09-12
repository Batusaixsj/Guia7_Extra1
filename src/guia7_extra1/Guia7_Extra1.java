package guia7_extra1;

import Entidades.Cancion;
import Servicios.ServicioCancion;

public class Guia7_Extra1 {
    public static void main(String[] args) {
        ServicioCancion sCancion = new ServicioCancion();
        Cancion cancion1 = sCancion.crearCancion();
        sCancion.mostrarCancion(cancion1);
        
        
    }
    
}
