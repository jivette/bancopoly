/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana2;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Ivette
 */
public class ventana2 extends JFrame implements ActionListener {
 
 public ventana2(){
    this.setLayout(null);
    this.setSize(700, 400);
    this.setLocationRelativeTo(null);
    this.setTitle("Numero aleatorio");
    this.setResizable(false);


  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
