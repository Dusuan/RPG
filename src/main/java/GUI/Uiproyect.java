/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package GUI;

import javax.swing.JFrame;

/**
 *
 * @author Rhamses
 */
public class Uiproyect {

    public static void main(String[] args) {
        
        menubien ventana = new menubien();
        JFrame frame = new JFrame("My Game");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
