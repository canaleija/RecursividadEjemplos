/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividadejemplos;

import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Busquedas 
{
        
    public static int busquedaLineal (int e, int[] conjunto){
        
        // iteraciones para recorrer el conjunto de datos 
        
        for (int x=0; x < conjunto.length; x++){
        
            if (e == conjunto[x]){
                 // si se cumple la igualdad 
                 return x;
            } 
        }
        // no encotró el elemento 
        return -1; 
    }
    
    public static int[] generaArregloAleatorio (int dim ){
     int[] arreglo = new int[dim];
     // declaramos un random para generar los elementos aleatorios
     Random ran = new Random();
     for (int x=0; x < dim; x++){
          arreglo[x]=ran.nextInt(1000);
        }
     
     return arreglo;
    
    }
    
}
