/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s15p02prioridadhilos;

/**
 *  PRIORIDAD HILOS:
 * - Se puede establecer la "prioridad" de ejecucion de un hilo con la instruccion "setPriority" que 
 * recibe parametros del 1 al 10 donde:
 * - 1 es equivalente a "MIN_Priority"
 * - 2,3,4
 * - 5 es equivalente a "NORM_Priority"
 * - 6,7,8,9
 * - 10 es equivalente a "MAX_Priority"
 * 
 * - Obviamente se deben establecer las prioridades antes de ejecutar el hilo.
 *
 * @author 177294
 */
public class S15P02PrioridadHilos {

    
    public static void main(String[] args) {
        MiHilo h1 = new MiHilo();
        MiHilo h2 = new MiHilo();
        Thread h3 = new MiHilo(); //polimorfismo
        Thread h4 = new MiHilo();
        
        h1.setPriority(1);//MIN_PRIORITY
        h2.setPriority(5);//NORM_PRIORITY
        h3.setPriority(Thread.MAX_PRIORITY);
        h4.setPriority(Thread.NORM_PRIORITY);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
    
}
