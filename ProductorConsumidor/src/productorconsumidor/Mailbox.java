/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productorconsumidor;

/*Equipo 2
Covarrubias Solis Victor 
Guerrero Hurtado Lizbeth
Rodríguez Torres Sebastián

Aplicación de mensajes para implementar una solución al problema de productor - consumidor
*/
public class Mailbox{
    Object message;//mensaje
    boolean bandera = false;//boleano para saber si usar los while

    public synchronized void send(Object m){//es synchronized para que solo un proceso pueda acceder a el metodo a la vez
        
        while(bandera){//se checa que el booleano sea verdadero
            try{//el try - catch sirve para atrapar las interrupciones que puede llegar a generar el wait()
                wait();//el hilo espera la señal de un notify para continuar (notify de receive)
            }catch(InterruptedException e){
                System.out.println("error: "+e);//si falla se muestra el error
            }
        }
        message = m;//se guarda el mensaje que llego como parametro
        bandera = true;//se hace verdadera para que se pueda consumir
        notify();//envia señal de notify a receive
    }

    public synchronized Object receive(){
        while(!bandera){//se checa que el booleano sea falso
            try{//el try - catch sirve para atrapar las interrupciones que puede llegar a generar el wait()
                wait();//el hilo espera la señal de un notify para continuar (notify de send)
            }catch(InterruptedException e){
                System.out.println("error: "+e);//si falla se muestra el error
            }
        }
        Object receivedMessage = message;
        bandera = false;//el booleano se hace falso
        notify();//envia señal de notify a send
        return receivedMessage;//se retorna el mensaje
    }
}
