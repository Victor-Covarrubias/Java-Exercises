/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s11p02jtextarea;
import java.awt.*; //Abstract Window Toolkit - una de las primeras herramientas, ya casi no se usa
//Depende de la plataforma (SO) (en cuanto a controles)
import javax.swing.*;//javax significa extension - Independente de la plataforma
import java.awt.event.*;//accion con el mouse, este se pone porque java.swing tambien tiene un event
import javax.swing.JOptionPane;
import java.util.Arrays;//para usar el metodo Arrays.sort();
/**
 * JTEXTAREA
 * - Un JTextArea es como un JTextField de varios renglones. Solo recibe 2 parametros donde el primero es el ancho y el otro los renglones.
 * 
 * REALICE:
 * - Usando JOptionPane reciba 5 cadenas y almacenelas en un arreglo.
 * - Ordene el arreglo (puede usar metodos de arrays)
 * - Muestre el arreglo ordenado en un TextArea
 *  logrando que cada palabra se escriba en una linea nueva. (Puede usar un bioton para iniciar la ejecucion).
 * 
 *
 * @author 177294
 */
public class S11P02JTextArea extends JFrame implements ActionListener{

    JLabel lblN1;//label para que se vea texto
    JTextArea taN1;//text area
    JButton iniciar;// boton para iniciar el programa
    
    
    public static void main(String[] args) {
        
        S11P02JTextArea marco = new S11P02JTextArea();//objeto de la clase
        marco.setSize(200, 200);// metodo de JFrame, tamaño de la ventana en px
        marco.setTitle("Operaciones");// metodo de JFrame
        marco.crearGUI();//se llama el metodo crearGUI
        marco.setVisible(true);//mostrar la ventana
        
       
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE Es una enumeracion, es para que deje de correr el programa (termina la ejecucion al cerrar la ventana)
        Container ventana = getContentPane();
        
        ventana.setLayout(new FlowLayout());//ADMINISTRADOR DE CONTENIDO, flowlayout los acomoda como van llegando donde caben
        //gridLayout, borderLayout, -- "administra" la distribucion de objetos en ventan
        
        //configurar objetos
        lblN1 = new JLabel("Ordenado: ");
        ventana.add(lblN1);//se añade
        
        taN1 = new JTextArea(7,7);//cantidad de columnas (anchura) y cantidad de renglones (altura)
        ventana.add(taN1);//se añade
        
        iniciar = new JButton("iniciar");
        ventana.add(iniciar);//se añade
        iniciar.addActionListener(this);//se suscribe el boton
        
    }
    public void actionPerformed(ActionEvent event){
        String arreglo[] = new String[5];//arreglo para guardar las cadenas
        if(iniciar == event.getSource()){
            for (int i = 0; i < 5; i++) {
             arreglo[i] = JOptionPane.showInputDialog("Escribe cadena "+i);//se pone el cuadro de dialogo pidiendo que se escriba cada cadena
            }
            Arrays.sort(arreglo);//se ordena
            System.out.println("ordenado");
            for (int i = 0; i < 5; i++) {
                taN1.append(arreglo[i]);//se escribe en el textarea
                //taN1.append("\n");//se pone un salto de linea
            }
             
             
        }

    }
}
