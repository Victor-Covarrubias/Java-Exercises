/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s14p01hilos;

/**
 * 
 * HILOS:
 * Es una propiedad de java con la que se puede "simular" la "multiprogramacion" o "multiproceso"
 * permite "correo" 2 o mas bloques de codigo "simultaneamente".
 *
 * -En un programa java en ejecucion siempre hay al al menos UN hilo (thread).
 * -Se tiene que crear una clase que extiende de Thread y que: 
 * -Sobreescribe el metodo "run". En este metodo se colocan todas las instrucciones que se quieren ejecutar "simultaneamente"
 * - Para correr un hilo se debe mandar llamar al metodo "start". Start prepara el 
 * hilo para ejecutarse y despues manda llamar a "run"
 * -Hay muchos metodos para conrrolar los hilos (play, stop, resume, etc.) que ya no estan permitidos
 * por lo que SE DEBE programar un mecanismo para detener el hilo.
 * @author 177294
 */
public class S14P01Hilos {

    
    public static void main(String[] args) {
        
        MiHilo h1 = new MiHilo();
        MiHilo h2 = new MiHilo();
        Thread h3 = new MiHilo(); //polimorfismo
        Thread h4 = new MiHilo();
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
    
}
