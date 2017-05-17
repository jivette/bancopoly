/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author dieez
 */
public class Tablero extends javax.swing.JPanel {
    //agrega la imagen del trablero
        ImageIcon tablero = new ImageIcon(getClass().getResource("/images/bancopoly.jpg"));
        
    
    public Tablero() {
        this.setSize(900, 580); //se selecciona el tamaño del panel
        
    }

//Se crea un método cuyo parámetro debe ser un objeto Graphics
    public void paint(Graphics grafico) {
        Dimension height = getSize();

        

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
        grafico.drawImage(tablero.getImage(), 0, 0, 900,580, null);
       
        
        
        

        setOpaque(false);
        super.paintComponent(grafico);
    }

    
    
    
}