/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s13p02excepcionpropiagrafica;
import javax.swing.JOptionPane;
/**
 *
 * @author 177294
 */
public class excepcionespropiasgraficas {
    
    public void matricula(String e) throws Exception{
        char hola[];
        hola=e.toCharArray();
        for (int i = 0; i < (hola.length)-1; i++) {//se recorre el string caractrer por caracter
            if(hola[i]!='1'&&hola[i]!='2'&&hola[i]!='3'&&hola[i]!='4'&&hola[i]!='5'&&hola[i]!='6'&&hola[i]!='7'&&hola[i]!='8'&&hola[i]!='9'&&hola[i]!='0'){
                JOptionPane.showInternalMessageDialog(null, "ERROR matricula no valida! ","CUIDADO", JOptionPane.INFORMATION_MESSAGE);
                throw new Exception();
                //JOptionPane.showInternalMessageDialog(null, "caracter correcto en la matricula! ","CUIDADO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public void matriculatamaño(String e) throws Exception{
        if(e.length()<=6){
            JOptionPane.showInternalMessageDialog(null, "tamaño correcto! ","CUIDADO", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showInternalMessageDialog(null, "ERROR matricula no valida! ","CUIDADO", JOptionPane.INFORMATION_MESSAGE);
            throw new Exception();
        }
    }
    
    public void calificacion(float e) throws Exception{
        if(e<=10 && e>=0){
            JOptionPane.showInternalMessageDialog(null, "Calificacion valida! ","CUIDADO", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showInternalMessageDialog(null, "ERROR calificacion no valida! ","CUIDADO", JOptionPane.INFORMATION_MESSAGE);
            throw new Exception();
        }
    }
}
