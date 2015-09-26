/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeeFreezPas;

import Exceptions.BedragMaximumBereiktException;
import Exceptions.KredietlimietBereiktException;
import Exceptions.SaldoNietNegatiefException;

/**
 *
 * @author Johan
 */
public class Kleingeld
    extends BeeFreezPas
{
    /**
     * 
     * @param nummer
     * @param houder 
     */
    public Kleingeld(long nummer, String houder) {
        super(nummer, houder);
    }
    
    /**
     * 
     * @param nummer
     * @param houder
     * @param bedrag 
     */
    public Kleingeld(long nummer, String houder, double bedrag) {
        super(nummer, houder, bedrag);
    }
    
    /**
     * 
     * @param bedrag
     * @return
     * @throws SaldoNietNegatiefException
     * @throws KredietlimietBereiktException
     * @throws BedragMaximumBereiktException 
     */
    @Override
    public boolean betaal(double bedrag)
            throws SaldoNietNegatiefException, KredietlimietBereiktException, BedragMaximumBereiktException
    {
         if (bedrag > 10 ){
            throw new BedragMaximumBereiktException("Bedrag niet toegestaan");
        }
        return super.betaal(bedrag);
    }

}
