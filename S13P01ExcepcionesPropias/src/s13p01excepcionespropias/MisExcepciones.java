package s13p01excepcionespropias;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 177294
 */
public class MisExcepciones {
    
    public void probarEdad(int e) throws Exception{//metodo que lanza excepcion
        
        if(e>=18){//si es menor de edad
            System.out.println("Edad valida!");
        }else{
            System.out.println("ERROR edad no valida");
            throw new Exception();//se lanza la excepcion
        }
    }
    
    public void probarCalificacion(float e) throws Exception{//metodo que lanza excepcion
        
        if(e<10 && e>6){//si la calificaion es aprobatoria
            System.out.println("Calificacion valida!");
        }else{
            System.out.println("ERROR calificacion no valida");
            throw new Exception();//se lanza la excepcion
        }
        }
    }
    
}
