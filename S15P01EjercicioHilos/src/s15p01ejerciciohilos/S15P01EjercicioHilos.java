/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s15p01ejerciciohilos;

import java.util.Scanner;
/**
 * REALIZA:
 * - Una clase que extienda de Thread y que si recibe un 1 imprima los numeros "nons" del 1 al 200
 * 
 * y si recibe un 2 imprima los numeros pares del 1 al 200
 * 
 * - Genere 4 hilos de clase
 *
 * @author 177294
 */
public class S15P01EjercicioHilos {
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("escribe 1 o 2: ");
        num = entrada.nextInt();
        Hilos h1 = new Hilos(num);
        System.out.println("escribe 1 o 2: ");
        num = entrada.nextInt();
        Hilos h2 = new Hilos(num);
        System.out.println("escribe 1 o 2: ");
        num = entrada.nextInt();
        Hilos h3 = new Hilos(num);
        System.out.println("escribe 1 o 2: ");
        num = entrada.nextInt();
        Hilos h4 = new Hilos(num);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
    
}
