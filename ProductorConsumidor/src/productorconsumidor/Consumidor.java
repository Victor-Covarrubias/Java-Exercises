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
public class Consumidor extends Thread{//extiende la clase thread para hacer uso de hilos
    //de tipo de la clase mailbox para poder usar sus propias funciones, tambien ayudan a recibir los buzones
    Mailbox puedeConsumir;
    Mailbox puedeProducir;

    public Consumidor(Mailbox pc, Mailbox pp){//constructor del consumidor
        puedeConsumir = pc;
        puedeProducir = pp;
    }

    public void run(){//metodo que contiene la corrida del hilo
        Object cmsg = puedeConsumir.receive();//recibe el mensaje de que puede consumir
        consumir();//consume
        puedeProducir.send(cmsg);//envia mensaje al productor para que sepa que puede producir
    }

    private void consumir(){//metodo que cumple la funcion de consumir
        System.out.println("consumiendo");//se muestra en pantalla que esta consumiendo
        Productor.contprod--;//disminuye el conteo de productos
    }
}
