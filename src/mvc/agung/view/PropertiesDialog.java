/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.agung.view;

import java.awt.BorderLayout;
import javax.swing.JDialog;

/**
 *
 * @author Agung Nurhamidan
 */
public class PropertiesDialog extends JDialog {
    public PropertiesDialog(DisplayFrame displayFrame, PropertiesViewPanel propertiesViewPanel) {
        super(displayFrame, "Properties (View 2)");
        setModal(false);
        getContentPane().add(propertiesViewPanel, BorderLayout.CENTER);
        pack();
    }

    public void start() {
        setVisible(true);
    }

    public void stop() {
    }
}
