/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s15p03hilografico;
import java.awt.*; //Abstract Window Toolkit - una de las primeras herramientas, ya casi no se usa
//Depende de la plataforma (SO) (en cuanto a controles)
import javax.swing.*;//javax significa extension - Independente de la plataforma
import java.awt.event.*;//accion con el mouse, este se pone porque java.swing tambien tiene un event
/**
 * 
 * PROGRAMA una interfaz grafica con:
 *  - 1 pnale de 100 x 100 pixeles
 *  - 1 boton "Iniciar 1"
 *  - 1 boton "Detener 1"
 *  - Otro panel de 100 x 100
 *  - 1 boton "iniciar 2"
 *  - 1 boton "Detener 2"
 * 
 * @author 177294
 */
public class S15P03HiloGrafico extends JFrame implements ActionListener{

    JPanel panel1, panel2; // J - indica que es de Swing
    JButton iniciar1, detener1, iniciar2, detener2;//botones
    PelotaHilo pelota1, pelota2;
    boolean control1=false, control2=false;
    public static void main(String[] args) {
        S15P03HiloGrafico marco = new S15P03HiloGrafico();//objeto de la clase
        marco.setSize(300, 300);// metodo de JFrame, tamaño de la ventana en px
        marco.setTitle("HilosGraficos");// metodo de JFrame
        marco.crearGUI();
        marco.setVisible(true);//mostrar la ventana
    }
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE Es una enumeracion, es para que deje de correr el programa (termina la ejecucion al cerrar la ventana)
        Container ventana = getContentPane();
        
        ventana.setLayout(new FlowLayout());//ADMINISTRADOR DE CONTENIDO, flowlayout los acomoda como van llegando donde caben
        //gridLayout, borderLayout, -- "administra" la distribucion de objetos en ventana
        
        //Colocar los objtos en la ventana.
        //PANEL
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(100,100));
        panel1.setBackground(Color.WHITE);//puede ser mayuscula o minuscula pero al ser una enumeracion es mejor en mayuscula
        ventana.add(panel1);
        
        //BOTON izquierdo
        iniciar1 = new JButton("iniciar 1");
        iniciar1.addActionListener(this);//suscribir el boton al listener
        ventana.add(iniciar1);//se agrega el boton
        //BOTON derecho
        detener1 = new JButton("detener 1");
        detener1.addActionListener(this);//suscribir el boton al listener
        ventana.add(detener1);//se agrega el boton
        
        //Colocar los objtos en la ventana.
        //PANEL
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(100,100));
        panel2.setBackground(Color.WHITE);//puede ser mayuscula o minuscula pero al ser una enumeracion es mejor en mayuscula
        ventana.add(panel2);
        
        //BOTON izquierdo
        iniciar2 = new JButton("iniciar 2");
        iniciar2.addActionListener(this);//suscribir el boton al listener
        ventana.add(iniciar2);//se agrega el boton
        //BOTON derecho
        detener2 = new JButton("detener 2");
        detener2.addActionListener(this);//suscribir el boton al listener
        ventana.add(detener2);//se agrega el boton
        
    }
    public void actionPerformed(ActionEvent event){//event objeto de la clase Actionevent
        
        //dibujar circulo
        if(iniciar1 == event.getSource()){
            pelota1 = new PelotaHilo(panel1);
            if(control1==false){
                pelota1.start();
                control1=true;
            }
            
        }
        if(detener1 == event.getSource()){// btnDer == origen
            pelota1.detener();
            
        }
        if(iniciar2 == event.getSource()){// btnDer == origen
            pelota2 = new PelotaHilo(panel2);
            if(control2==false){
                pelota2.start();
                control2=true;
            }
        }
        if(detener2 == event.getSource()){// btnDer == origen
            pelota2.detener();
        }
    }
    
}
