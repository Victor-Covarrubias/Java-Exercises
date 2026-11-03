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
public class Productor extends Thread{//extiende la clase thread para hacer uso de hilos
    //de tipo de la clase mailbox para poder usar sus propias funciones, tambien ayudan a recibir los buzones
    Mailbox puedeProducir;
    Mailbox puedeConsumir;
    
    static int contprod = 0;//conteo de productos creados

    public Productor(Mailbox pp, Mailbox pc){//constructor del productor
        puedeProducir = pp;
        puedeConsumir = pc;
    }

    public void run(){//metodo que contiene la corrida del hilo
        Object pmsg = puedeProducir.receive();//recibe el mensaje de que puede producir
        producir();//produce
        puedeConsumir.send(pmsg);//envia mensaje al consumidor para que sepa que puede consumir
    }
    public void producir(){//metodo que cumple la funcion de producir
        contprod++;//aumenta el conteo de productos
        System.out.println("produciendo, cantidad producida: "+ contprod);//se muestra en pantalla que esta produciendo
    }
}
