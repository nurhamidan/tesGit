/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.agung.view;

import java.beans.PropertyChangeEvent;
import javax.swing.JPanel;

/**
 *
 * @author Agung Nurhamidan
 */
public abstract class AbstractViewPanel extends JPanel {
    public abstract void modelPropertyChange(PropertyChangeEvent evt);
}
