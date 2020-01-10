/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.agung;

import mvc.agung.controller.DefaultController;
import mvc.agung.model.TextElementModel;
import mvc.agung.view.DisplayFrame;
import mvc.agung.view.DisplayViewPanel;
import mvc.agung.view.PropertiesDialog;
import mvc.agung.view.PropertiesViewPanel;

/**
 *
 * @author Agung Nurhamidan
 */
public class MVCAgung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultController defaultController = new DefaultController();
        TextElementModel textElementModel = new TextElementModel(defaultController);
        DisplayViewPanel displayViewPanel = new DisplayViewPanel(defaultController);
        PropertiesViewPanel propertiesViewPanel = new PropertiesViewPanel(defaultController);
        DisplayFrame displayFrame = new DisplayFrame(displayViewPanel);
        PropertiesDialog propertiesDialog = new PropertiesDialog(displayFrame, propertiesViewPanel);
        defaultController.addModel(textElementModel);
        displayFrame.start();
        propertiesDialog.start();
        //sdfsdf
    }
    
}
