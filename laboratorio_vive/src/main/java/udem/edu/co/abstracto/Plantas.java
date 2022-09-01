/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.abstracto;

/**
 * @autor Santiago Arredondo
 * @since 1-09-2020
 * @version 1.0
 * Clase abstracta que clasifica al reino planta
*/
public abstract class Plantas {
    //atributos globales
    
    private String color;
    private String tiempo;
    private String promedio;
    
    //Constructor

    public Plantas(String color) {
        this.color = color;
    }
    
    //getters and setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Plantas{" + '}';
    }
      
    
    
}
