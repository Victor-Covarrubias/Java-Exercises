/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s14p01hilos;

/**
 *
 * @author 177294
 */
public class MiHilo extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(this.getName()+"impresion: "+i);
        }
    }
}
