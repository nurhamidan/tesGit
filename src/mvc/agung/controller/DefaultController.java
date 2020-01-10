/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.agung.controller;

/**
 *
 * @author Agung Nurhamidan
 */
public class DefaultController extends AbstractController {
    public static final String ELEMENT_TEXT_PROPERTY = "Text";
    
    public void changeElementText(String newText) {
        setModelProperty(ELEMENT_TEXT_PROPERTY, newText);
    }
}
