/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividadejemplos;

/**
 *
 * @author Roberto Cruz Leija
 */
public class RecursividadEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
     int[] arreglo = Busquedas.generaArregloAleatorio(5000);
     System.out.println(Busquedas.busquedaLineal(65, arreglo));
    }
    
    public static long calculaFactorial (long n){
    // caso base 
    // si en su momento la funcion resuelve el factorial
    // de 1 o 0 tiene que retornar 1 (caso sencillo)
    if (n<=1){
    return 1;
    } else {
      // ejecutamos la llamada recursiva
      // el caso general
      return n * calculaFactorial(n-1);
    }
    
    // caso recursivo o general 
    
    }
    
    public static int suma2NumerosEnteros (int a, int b){
        
        if (a==0){
           return b;}
        else if (b==0){
          return a;
        }
        if (b>0){
        // caso general o recursivo 
        return 1 + suma2NumerosEnteros(a, b - 1);
        }
        if (b<0){
         // caso general o recursivo 
        return 1 - suma2NumerosEnteros(a, b + 1);
        }
        // caso general o recursivo 
        return 1 + suma2NumerosEnteros(a, b - 1);
    }
    public static int fibonacci(int n ){
    
        // caso base 
        if (n <= 1){
          return n;
        
        }else {
        
        return fibonacci(n-1) + fibonacci(n-2);
        }
    
    }
    
}
