/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s12p02excepcionesgraficas;
import java.util.InputMismatchException;
import java.awt.*; //Abstract Window Toolkit - una de las primeras herramientas, ya casi no se usa
//Depende de la plataforma (SO) (en cuanto a controles)
import javax.swing.*;//javax significa extension - Independente de la plataforma
import java.awt.event.*;//accion con el mouse, este se pone porque java.swing tambien tiene un event
import javax.swing.JOptionPane;
/**
 * Con base en el ejercicio S08P05Operaciones 
 * modifique para que se atrapen TODAS las excepciones que pudieran lanzarse, ademas de programas una excepcion general.
 * Si se lanza una excepcion, mande un mensaje de erroR mediante un JOptionPane y limpie el contenido de los textFiekds.
 *
 * @author 177294
 */
public class S12P02ExcepcionesGraficas extends JFrame implements ActionListener{

    JLabel lblN1, lblN2, lblResultado;
    JTextField tfN1, tfN2, tfResultado;
    JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;
    
    public static void main(String[] args) {
        S12P02ExcepcionesGraficas marco = new S12P02ExcepcionesGraficas();//objeto de la clase
        marco.setSize(200, 200);// metodo de JFrame, tamaño de la ventana en px
        marco.setTitle("Excepciones Graficas");// metodo de JFrame
        marco.crearGUI();
        marco.setVisible(true);//mostrar la ventana
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE Es una enumeracion, es para que deje de correr el programa (termina la ejecucion al cerrar la ventana)
        Container ventana = getContentPane();
        
        ventana.setLayout(new FlowLayout());//ADMINISTRADOR DE CONTENIDO, flowlayout los acomoda como van llegando donde caben
        //gridLayout, borderLayout, -- "administra" la distribucion de objetos en ventan
        
        //configurar objetos
        lblN1 = new JLabel("Numero 1: ");
        ventana.add(lblN1);//se añade
        
        tfN1 = new JTextField(7);//cantidad de columnas (anchura)
        ventana.add(tfN1);//se añade
        
        lblN2 = new JLabel("Numero 2: ");
        ventana.add(lblN2);//se añade
        
        tfN2 = new JTextField(7);//cantidad de columnas (anchura)
        ventana.add(tfN2);//se añade
        
        btnSumar = new JButton("Sumar");
        ventana.add(btnSumar);//se añade
        btnSumar.addActionListener(this);
        btnRestar = new JButton("Restar");
        ventana.add(btnRestar);//se añade
        btnRestar.addActionListener(this);
        
        btnMultiplicar = new JButton("Multiplicar");
        ventana.add(btnMultiplicar);//se añade
        btnMultiplicar.addActionListener(this);
        btnDividir = new JButton("Dividir");
        ventana.add(btnDividir);//se añade
        btnDividir.addActionListener(this);
        
        lblResultado = new JLabel("Resultado: ");
        ventana.add(lblResultado);//se añade
        
        tfResultado = new JTextField(7);//cantidad de columnas (anchura)
        ventana.add(tfResultado);//se añade
        
    }
    
    public void actionPerformed(ActionEvent event){
        int n1=0;
        int n2=0;
        float n3=0;
        float n4=0;
        try{
            String t1 = tfN1.getText();//Recupera un string
            n1 = Integer.parseInt(t1);//recibe una cadena y se hace int

            n2 = Integer.parseInt(tfN2.getText());//lo mismo

            n3 = Float.parseFloat(tfN1.getText());
            n4 = Float.parseFloat(tfN2.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: ingresa solo numeros "+e, "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            tfN1.setText("");//SE LIMPIA
            tfN2.setText("");//SE LIMPIA
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: ingresa solo numeros "+e, "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            tfN1.setText("");//SE LIMPIA
            tfN2.setText("");//SE LIMPIA
        }
        
        
        if(btnSumar == event.getSource()){
            tfResultado.setText(Integer.toString(n1+n2));//la suma se hace string y se le da a tfResultado
        }
        
        if(btnRestar == event.getSource()){
            tfResultado.setText(Integer.toString(n1-n2));//la suma se hace string y se le da a tfResultado
        }
        
        if(btnMultiplicar == event.getSource()){
            tfResultado.setText(Integer.toString(n1*n2));//la suma se hace string y se le da a tfResultado
        }
        
        if(btnDividir == event.getSource()){
            tfResultado.setText(Float.toString(n3/n4));//la suma se hace string y se le da a tfResultado
        }
        
        
    }
    
}
