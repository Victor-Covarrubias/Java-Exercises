/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s15p01ejerciciohilos;

/**
 *
 * @author 177294
 */
public class Hilos extends Thread{
    int num;
    public Hilos(){
        
    }
    public Hilos(int n){
        num=n;
    }
    public void run(){
        if(num==1){
            for (int i = 1; i < 200; i=i+2){
                System.out.println(this.getName()+"impresion: "+(i+1));
            }
        }
        if(num==2){
            for (int i = 2; i < 200; i=i+2){
                System.out.println(this.getName()+"impresion: "+(i+1));
            }
        }
    }
}
