/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

/**
 *
 * @author MNXC04
 */
public class Cancion {
    private String titulo;
    private String autor;

/**
 * Constructores
 */    
    
    public Cancion() {
        this.titulo="";
        this.autor="";        
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

  /**
   * Getters & Setters
   * @return 
   */  
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "**** Datos Cancion ****" + "\nTitulo: " + titulo + "\nAutor;" + autor;
    }
    
    
    
    
}
