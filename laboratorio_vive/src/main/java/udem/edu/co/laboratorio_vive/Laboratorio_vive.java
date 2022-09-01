/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package udem.edu.co.laboratorio_vive;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.interfaz.Clasificacion;
import udem.edu.co.model.Perro;

/**
 *
 * @author santiago.aristizabal
 */
public class Laboratorio_vive {

    public static void main(String[] args) {
        
        List<Clasificacion> seresvivos= new ArrayList<>();
        seresvivos.add(new Perro());
        System.out.println(seresvivos);
        
        
    }
}
