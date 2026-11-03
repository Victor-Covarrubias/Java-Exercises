/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s13p02excepcionpropiagrafica;
import java.awt.*; //Abstract Window Toolkit - una de las primeras herramientas, ya casi no se usa
//Depende de la plataforma (SO) (en cuanto a controles)
import javax.swing.*;//javax significa extension - Independente de la plataforma
import java.awt.event.*;//accion con el mouse, este se pone porque java.swing tambien tiene un event
import javax.swing.JOptionPane;
import java.util.Arrays;//para usar el metodo Arrays.sort();
/**
 * RECIBE LA MATRICULA DE UN ALUMNO Y VERIFIQUE QUE EA VALIDA
 * CALIFICACIONES DEBEN ESTAR ENTRE 0 Y 10
 * SI SE LANZA ALGUNA DE LAS EXCEPCIONES LIMPIAR LOS TEXCTFIELDS
 * 
 *
 * @author 177294
 */
public class S13P02ExcepcionPropiaGrafica extends JFrame implements ActionListener{

    JLabel lblN1, lblN2, lblN3, lblN4, lblN5, lblN6;//label para que se vea texto
    JTextField tfN1, tfN2, tfN3, tfN4, tfN5, tfN6;//text area
    JButton iniciar;// boton para iniciar el programa
    
    public static void main(String[] args) {
        S13P02ExcepcionPropiaGrafica marco = new S13P02ExcepcionPropiaGrafica();//objeto de la clase
        marco.setSize(200, 200);// metodo de JFrame, tamaño de la ventana en px
        marco.setTitle("ExcepcionPropiaGrafica");// metodo de JFrame
        marco.crearGUI();//se llama el metodo crearGUI
        marco.setVisible(true);//mostrar la ventana
        
        
        
    }
     private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE Es una enumeracion, es para que deje de correr el programa (termina la ejecucion al cerrar la ventana)
        Container ventana = getContentPane();
        
        ventana.setLayout(new FlowLayout());//ADMINISTRADOR DE CONTENIDO, flowlayout los acomoda como van llegando donde caben
        //gridLayout, borderLayout, -- "administra" la distribucion de objetos en ventan
        
        //configurar objetos
        lblN6 = new JLabel("Matricula: ");
        ventana.add(lblN6);//se añade
        
        tfN6 = new JTextField(7);//anchura
        ventana.add(tfN6);//se añade
        
        lblN1 = new JLabel("Parcial 1: ");
        ventana.add(lblN1);//se añade
        
        tfN1 = new JTextField(7);//anchura
        ventana.add(tfN1);//se añade
        
        lblN2 = new JLabel("Parcial 2: ");
        ventana.add(lblN2);//se añade
        tfN2 = new JTextField(7);//anchura
        ventana.add(tfN2);//se añade
        
        lblN3 = new JLabel("Parcial 3: ");
        ventana.add(lblN3);//se añade
        tfN3 = new JTextField(7);//anchura
        ventana.add(tfN3);//se añade
        
        lblN4 = new JLabel("Final: ");
        ventana.add(lblN4);//se añade
        tfN4 = new JTextField(7);//anchura
        ventana.add(tfN4);//se añade
        
        iniciar = new JButton("iniciar");
        ventana.add(iniciar);//se añade
        iniciar.addActionListener(this);//se suscribe el boton

        lblN5 = new JLabel("Resultado: ");
        ventana.add(lblN5);//se añade
        tfN5 = new JTextField(7);//anchura
        ventana.add(tfN5);//se añade
        
    }
     public void actionPerformed(ActionEvent event){
        excepcionespropiasgraficas e1 = new excepcionespropiasgraficas();
        
        float promedio;
        if(iniciar == event.getSource()){//si se presiona el boton iniciar
            try{
                e1.matricula(tfN6.getText());//comprobadores de la matricula
                e1.matriculatamaño(tfN6.getText());
            }catch(Exception e){
                System.out.println(e);
                tfN6.setText("");//si hay un error en esta se limpia el text field
            }
            //se comprueban las calificaiones una por una ya que asi solo se borra la que este mal
            try{
                float n1 = Float.parseFloat(tfN1.getText());
                e1.calificacion(n1);
            }catch(Exception e){
                System.out.println(e);
                tfN1.setText("");//si hay un error en esta se limpia el text field
            }
            try{
                float n2 = Float.parseFloat(tfN2.getText());
                e1.calificacion(n2);
            }catch(Exception e){
                System.out.println(e);
                tfN2.setText("");//si hay un error en esta se limpia el text field
            }
            try{
                float n3 = Float.parseFloat(tfN3.getText());
                e1.calificacion(n3);
            }catch(Exception e){
                System.out.println(e);
                tfN3.setText("");//si hay un error en esta se limpia el text field
            }
            try{
                float n4 = Float.parseFloat(tfN4.getText());
                e1.calificacion(n4);
            }catch(Exception e){
                System.out.println(e);
                tfN4.setText("");//si hay un error en esta se limpia el text field
            }
            try{
                float n1 = Float.parseFloat(tfN1.getText());
                float n2 = Float.parseFloat(tfN2.getText());
                float n3 = Float.parseFloat(tfN3.getText());
                float n4 = Float.parseFloat(tfN4.getText());
                
                promedio=(((n1+n2+n3)/3)*0.6f)+(n4*0.4f);
                tfN5.setText(Float.toString(promedio));//la suma se hace string y se le da a tfResultado
            }catch(Exception e){
                System.out.println(e);
                tfN1.setText("");
                tfN2.setText("");
                tfN3.setText("");
                tfN4.setText("");
                tfN5.setText("");
            }
            
            
        }

    }
}
