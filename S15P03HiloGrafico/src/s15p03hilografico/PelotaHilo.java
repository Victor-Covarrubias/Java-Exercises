/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s15p03hilografico;
import java.awt.*; //Abstract Window Toolkit - una de las primeras herramientas, ya casi no se usa
//Depende de la plataforma (SO) (en cuanto a controles)
import javax.swing.*;//javax significa extension - Independente de la plataforma
/**
 *
 * @author 177294
 */
public class PelotaHilo extends Thread{
    private JPanel panel;
    boolean seguirRebotando;
    private int x= 7, cambioX = 2;
    private int y= 2, cambioY = 7;
    private int diametro = 10;
    private final int ancho = 100, alto = 100;
    
    //Constructor
    public PelotaHilo(JPanel elpanel){
        panel = elpanel;
    }
    
    public void run(){
        seguirRebotando = true;
        while(seguirRebotando){
            mover(); // cambia los valores de coordenadas
            rebotar(); //Verificar los rangos (0-100)
            dibujar(); //dibuja el circulo
            retrasar(); //"duerme" el hilo para que se vea
            eliminar(); //eliminar el circulo
        }
    }
    
    private void mover(){
        x = x + cambioX;
        y = y + cambioY;
        
    }
    
    private void rebotar(){
        if(x<=0 || x>=ancho){
            cambioX = -cambioX;
        }
        if(y<=0 || y>=alto){
            cambioY = -cambioY;
        }
    }
    
    private void dibujar(){
        Graphics papel = panel.getGraphics();//devuelve un objeto de tipo grafics que se guarda en el objeto papel
        papel.setColor(Color.RED);
        papel.fillOval(x, y, diametro, diametro);
    }
    
    private void retrasar(){
        try{
            Thread.sleep(50);
        }catch(InterruptedException e){
            
        }
        
    }
    
    private void eliminar(){
        Graphics papel = panel.getGraphics();//devuelve un objeto de tipo grafics que se guarda en el objeto papel
        papel.setColor(Color.WHITE);
        papel.fillOval(x, y, diametro, diametro);
    }
    
    public void detener(){
        seguirRebotando = false;
    }
    
}
