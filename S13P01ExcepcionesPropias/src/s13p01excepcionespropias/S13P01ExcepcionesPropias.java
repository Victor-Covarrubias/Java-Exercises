/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s13p01excepcionespropias;

import java.util.Scanner;

/**
 * 
 * Excepciones propias:
 * -se requiere un metodo que indique desde su encabezado que "throws Exception".
 * -Dentro de ese metodo, si se cumple una condicion para lanzar la excepcion requiere la instruccion "throw new Exception()"
 *
 * AGREGE A ESTE EJERCICIO:
 * -Una excpecion propia que pida una calificacion y que si es menor a 6 y mayor a 10 diga que lña calificacion no es valida
 * 
 * @author 177294
 */
public class S13P01ExcepcionesPropias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);//para leer la entrada del usuario
        MisExcepciones e1 = new MisExcepciones();//se crea un objeto de la clase de las excepciones
        System.out.println("Dime tu edad");
        int edad = entrada.nextInt();//se lee la edad
        try{
            e1.probarEdad(edad);//se llama el metodo de probar edad
        }catch(Exception e){//si se lanza la excepcion
            System.out.println("Error: "+e);
        }
        System.out.println("Dime tu calificacion");
        float calificacion = entrada.nextFloat();//se lee la calificacion
        try{
            e1.probarCalificacion(calificacion);//se llama el metodo de probar la calificacion
        }catch(Exception e){//si se lanza la excepcion
            System.out.println("Error: "+e);
        }
        
    }
    
}
