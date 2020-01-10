/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.agung.model;

import mvc.agung.controller.DefaultController;

/**
 *
 * @author Agung Nurhamidan
 */
public class TextElementModel extends AbstractModel {
    private String text;

    public TextElementModel(DefaultController controller) {
        controller.addModel(this);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        String oldText = this.text;
        this.text = text;
        firePropertyChange(DefaultController.ELEMENT_TEXT_PROPERTY, oldText, text);
    }
    
    public void start() {
        setText("Sample Text");
    }
}
