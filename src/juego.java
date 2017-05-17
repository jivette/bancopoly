package juego;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class juego extends JFrame implements ActionListener {
 JButton btnGenerar;
 JLabel lblResultado, lblColor, lblNumero, lblResultadoColor, lblPunteo, lblTitle;
 JTextField numeroIngresado, colorIngresado;

 int punteo = 100;
 int numeroMaximo = 10, numeroMinimo = 1;

 public juego(){
 this.setLayout(null);
 this.setSize(700, 400);
 this.setLocationRelativeTo(null);
 this.setTitle("Numero aleatorio");
 this.setResizable(false);


 this.lblTitle = new JLabel("INICIAR JUEGO");
 this.lblTitle.setBounds(50, 20, 150, 30);
 this.add(this.lblTitle);

 this.lblNumero = new JLabel("Ingresa número de jugadores:");
 this.lblNumero.setBounds(50, 60, 200, 30);
 this.add(this.lblNumero);

 this.numeroIngresado = new JTextField(20);
 this.numeroIngresado.setBounds(50, 100 , 200, 30);
 this.add(this.numeroIngresado);

 this.btnGenerar = new JButton("Generar");
 this.btnGenerar.setBounds(50, 240, 100, 30);
 this.add(this.btnGenerar);
 
 this.btnGenerar.addActionListener(this);

 }

 public void actionPerformed(ActionEvent evento) {

 String numeroI = numeroIngresado.getText();


 }
}