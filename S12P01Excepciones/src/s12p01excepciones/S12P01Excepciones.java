/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s12p01excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * permiten programar alternativas a situaciones que el sistema no espera que sucedan. (controladas y no controladas)
 * 
 * -controladas: es obligatoria su programacion (BD)
 * - no controladas: uno desice si quiere "gestionarlas" (suele ser en tiempo de ejecucion - runtime)
 * 
 * Hay tambien exceopciones de sistema y propias.
 * 
 * En una excepcion propia se debe programar un metodo que "throws" Exception y dentro de su codigo debe existir una instruccion que "throw" Exception.
 * 
 * Para atrapar una excepcion:
 * -colocar el codigo que puede lanzar la excepcion dentro de un "try{}"
 * -se debe colocar una instruccion catch que atrape la excepcion. (Puede no colocarse ninguna pero en ese caso es obligatorio un "finally")
 * -Finally es una instruccion que se ejecutara "si o si" despues de un try.
 *
 * @author 177294
 */
public class S12P01Excepciones {

    /**
     * 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//para leer las entradas del usuario
        int c[]= new int[5];//array de enteros
        System.out.println("Dame 2 numeros");
        
        try{
            int a= entrada.nextInt();//se leen los numeros
            int b= entrada.nextInt();
            c[3]=4;
            System.out.println("La suma es: "+(a+b));
            System.out.println("La division es: "+(a/b));
            System.out.println("El elemento del arreglo es: "+c[5]);
        }catch(InputMismatchException e){//excepcion, si se lanzo una excepcion se imprime loq ue sta dentro del catch
            System.out.println("Error: ingresa solo numeros "+e);
        }catch(ArithmeticException e){
            System.out.println("ERROR: ingresa solo numeros "+ e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR EN EL ARREGLO: "+ e);
        }catch(Exception e){
            System.out.println("ERROR: Excepcion general "+e);
        }
        finally{//esto siempre ocurre
            System.out.println("Esto corre si o si!");
        }
    }
    
}
