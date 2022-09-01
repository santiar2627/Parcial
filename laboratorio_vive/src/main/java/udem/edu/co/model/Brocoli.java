/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.model;


import udem.edu.co.abstracto.Plantas;
import udem.edu.co.interfaz.Clasificacion;

/**
 *
 * @author santiago.aristizabal
 */
public class Brocoli extends Plantas implements Clasificacion{
    
    private String nombre;
    private String color;
    
    //Metodos Interface

    @Override
    public int color() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int promedioVida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int TiempoVida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{"
                + "brocoli:{"
                + "\"color:\""+this.color
                + "\"nombre:\""+this.nombre
                +"}}";
    }
                                
}
    
    
    
    
    
    
  

