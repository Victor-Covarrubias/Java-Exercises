/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenp2proyecto1;
import java.awt.*; //Abstract Window Toolkit - una de las primeras herramientas, ya casi no se usa
//Depende de la plataforma (SO) (en cuanto a controles)
import javax.swing.*;//javax significa extension - Independente de la plataforma
import java.awt.event.*;//accion con el mouse, este se pone porque java.swing tambien tiene un event
import javax.swing.JOptionPane;
/**
 * 1. Crea un proyecto con interfaz gráfica en el que se muestren los siguientes elementos en este orden:

1 label que diga "Materia 1:", seguido de 1 boton que diga "calcular 1", 1 Label que diga "Promedio 1" y 1 TextField.
1 label que diga "Materia 2:", seguido de 1 boton que diga "calcular 2", 1 Label que diga "Promedio 2" y 1 TextField.
1 botón "graficar"
1 panel.
Al presionar el botón calcular 1, debe solicitar usuario mediante un JOptionPane 3 calificaciones, calcular su promedio y mostrarlo en el TextField que se encuentra después del label "Promedio 1". Realizar el mismo procedimiento pero para la materia 2 al presionar el botón calcular 2.

En el panel usar los valores de los promedios para graficarlos mediante un par de fillRect, para la materia 1 de color azul y para la materia 2  de color rojo. (Cada que se presione el boton graficar se deben "refrescar" las gráficas si los valores cambiaron). (60%)
 *
 * @author 177294
 */
public class Examenp2proyecto1 extends JFrame implements ActionListener{
    JPanel panel; // J - indica que es de Swing
    JLabel mat1, mat2, prom1, prom2;
    JTextField tfN1, tfN2;
    JButton calcular, calcular2, graficar;
    static String arreglo[] = new String[3];//arreglo para guardar las cadenas
    static String arreglo2[] = new String[3];//arreglo para guardar las cadenas
    public static void main(String[] args) {
        Examenp2proyecto1 marco = new Examenp2proyecto1();//objeto de la clase
        marco.setSize(800, 800);// metodo de JFrame, tamaño de la ventana en px
        marco.setTitle("Examenp2proyecto1");// metodo de JFrame
        marco.crearGUI();
        marco.setVisible(true);//mostrar la ventana
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE Es una enumeracion, es para que deje de correr el programa (termina la ejecucion al cerrar la ventana)
        Container ventana = getContentPane();
        
        ventana.setLayout(new FlowLayout());//ADMINISTRADOR DE CONTENIDO, flowlayout los acomoda como van llegando donde caben
        //gridLayout, borderLayout, -- "administra" la distribucion de objetos en ventan
        
        
         //PANEL
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(800,500));
        panel.setBackground(Color.WHITE);//puede ser mayuscula o minuscula pero al ser una enumeracion es mejor en mayuscula
        ventana.add(panel);
        
        //configurar objetos
        mat1 = new JLabel("Materia 1: ");
        ventana.add(mat1);//se añade
        
        calcular = new JButton("calcular 1");
        ventana.add(calcular);//se añade
        calcular.addActionListener(this);
        
        prom1 = new JLabel("Promedio 1: ");
        ventana.add(prom1);//se añade
        
        tfN1 = new JTextField(7);//cantidad de columnas (anchura)
        ventana.add(tfN1);//se añade
        
        mat2 = new JLabel("Materia 2: ");
        ventana.add(mat2);//se añade
        
        calcular2 = new JButton("calcular 2");
        ventana.add(calcular2);//se añade
        calcular2.addActionListener(this);
        
        prom2 = new JLabel("Promedio 2: ");
        ventana.add(prom2);//se añade
        
        tfN2 = new JTextField(7);//cantidad de columnas (anchura)
        ventana.add(tfN2);//se añade
        
        
        graficar = new JButton("graficar");
        ventana.add(graficar);//se añade
        graficar.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent event){
        float n1=0;
        float n2=0;
        float n3=0;
        float n4=0;
        float n5=0;
        float n6=0;
        
        if(calcular == event.getSource()){
            
            for(int i = 0; i < 3; i++) {
             arreglo[i] = JOptionPane.showInputDialog("Escribe el numero "+(i+1));//se pone el cuadro de dialogo pidiendo que se escriba cada cadena
            }
            n1 = Float.parseFloat(arreglo[0]);//recibe una cadena y se hace int
            n2 = Float.parseFloat(arreglo[1]);//recibe una cadena y se hace int
            n3 = Float.parseFloat(arreglo[2]);//recibe una cadena y se hace int
            tfN1.setText(Float.toString((n1+n2+n3)/3));//la suma se hace string y se le da a tfResultado
        }
        
        if(calcular2 == event.getSource()){
            
            for(int i = 0; i < 3; i++) {
             arreglo2[i] = JOptionPane.showInputDialog("Escribe el numero "+(i+1));//se pone el cuadro de dialogo pidiendo que se escriba cada cadena
            }
            n4 = Float.parseFloat(arreglo2[0]);//recibe una cadena y se hace int
            n5 = Float.parseFloat(arreglo2[1]);//recibe una cadena y se hace int
            n6 = Float.parseFloat(arreglo2[2]);//recibe una cadena y se hace int
            tfN2.setText(Float.toString((n4+n5+n6)/3));//la suma se hace string y se le da a tfResultado
        }
        
        if(graficar == event.getSource()){
            Graphics papel = panel.getGraphics();//devuelve un objeto de tipo grafics que se guarda en el objeto papel
            int x=10;
            int y=70;
            int calificaciones1[]= new int[3];
            int calificaciones2[]= new int[3];
            papel.setColor(Color.WHITE);
            papel.fillRect(0, 0, 800, 500);
            
            calificaciones1[0]=Integer.parseInt(arreglo[0]);//recibe una cadena y se hace int
            calificaciones1[1]=Integer.parseInt(arreglo[1]);//recibe una cadena y se hace int
            calificaciones1[2]=Integer.parseInt(arreglo[2]);//recibe una cadena y se hace int
            
            calificaciones2[0]=Integer.parseInt(arreglo2[0]);//recibe una cadena y se hace int
            calificaciones2[1]=Integer.parseInt(arreglo2[1]);//recibe una cadena y se hace int
            calificaciones2[2]=Integer.parseInt(arreglo2[2]);//recibe una cadena y se hace int
            papel.setColor(Color.BLUE);
            for (int i = 0; i < 3; i++) {
                papel.fillRect(x, y, 50, calificaciones1[i]*30);
                x+=60;
            }
            x+=240;
            papel.setColor(Color.RED);
            for (int i = 0; i < 3; i++) {
                papel.fillRect(x, y, 50, calificaciones2[i]*30);
                x+=60;
            }
            
            
            
        }
        
        
        
    }
    
}
