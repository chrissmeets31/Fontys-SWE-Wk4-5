/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _main;

import BeeFreezPas.Normaal;
import Exceptions.*;

/**
 *
 * @author Johan
 */
public class Voorbeeld {
    
    /**
     * Voorbeeld
     */
    public Voorbeeld(){
        Normaal normaal = new Normaal(1, "Voorbeeld", 15);
        try{
            double bedrag = 15;
            boolean result;
            result = normaal.betaal(bedrag);
        }
        catch (SaldoNietNegatiefException ex){
            System.out.println(ex.getMessage());
        }
        catch (KredietlimietBereiktException ex){
            System.out.println(ex.getMessage());
        }
        catch (BedragMaximumBereiktException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
