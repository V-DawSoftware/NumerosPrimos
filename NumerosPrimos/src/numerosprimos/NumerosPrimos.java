/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */

//Devuelve True si el numero es primo, False en caso contrario

public class NumerosPrimos {
    public static boolean CompruebaPrimo(int num){
        boolean primo = true;
        for (int i = 2; i<num; i++){
            if ((num % i) == 0){
                primo = false;
                i = num + 1;
            }
        }
        
        return primo;
    }
    
    //Devuelve el siguiente numero primo, tanto si el de arriba es False o True
    public static int PrimoSiguiente(int num) {
        int primo = 0;
        boolean bandera = true;
        int i = num;
        i=i+1;
        while (bandera==true){
            if (CompruebaPrimo(i)){
                bandera = false;
                primo = i;
              }    
            i = i + 1;
           }
        return primo;
    }
            
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num = 0;
        boolean bandera = true;
        
      
        while (bandera){
            System.out.println("Escribe un número cualquiera: ");
            num = leer.nextInt();
            
            if (CompruebaPrimo(num)){
                System.out.println("El numero "+num+" es primo");
                System.out.println("El siguien numero primo es: "+PrimoSiguiente(num));
            }
            else{
                System.out.println("El numero "+num+" NO es primo");
                System.out.println("El siguien numero primo es: "+PrimoSiguiente(num));
            }
            
            if (num == 0){
                bandera = false;
            }
        }
        
        
    }
    
}
