/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productorconsumidor;

/*Equipo 2
Covarrubias Solis Victor 
Guerrero Hurtado Lizbeth
Rodríguez Torres Sebastián

Aplicación de mensajes para implementar una solución al problema de productor - consumidor
*/
public class ProductorConsumidor{
    
    public static final int CAPACIDAD = 20; // capacidad de la memoria, la hice static final porque es constante
    public static void main(String[] args){
        //se crean los buzones
        Mailbox puedeProducir = new Mailbox();
        Mailbox puedeConsumir = new Mailbox();
        
        // Inicializa los buzones
        puedeProducir.send(null);
        puedeConsumir.send(null);

        for(int i = 0; i < CAPACIDAD; i++){//se repite hasta llegar a la capacidad
            //inicio de los hilos
            //secuencia en paralelo
            new Productor(puedeProducir, puedeConsumir).start();
            new Consumidor(puedeConsumir, puedeProducir).start();
        }
    }
}
