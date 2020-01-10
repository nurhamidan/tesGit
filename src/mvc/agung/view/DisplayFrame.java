/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.agung.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Agung Nurhamidan
 */
public class DisplayFrame extends JFrame {

    public DisplayFrame(DisplayViewPanel displayViewPanel) {
        setTitle("Display (View 1)");
        getContentPane().add(displayViewPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    public void start() {
        setVisible(true);
    }

    public void stop() {
    }
}
