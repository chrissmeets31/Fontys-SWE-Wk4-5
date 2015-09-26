/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Johan
 */
public class BedragMaximumBereiktException 
    extends Exception {
        
    /**
     * Constructor zonder parameters
     */
    public BedragMaximumBereiktException(){
        
    }
    
    /**
     * Constructor met bericht voor weergave
     * @param message Bericht voor weergave
     */
    public BedragMaximumBereiktException(String message){
        super(message);
    }

}
