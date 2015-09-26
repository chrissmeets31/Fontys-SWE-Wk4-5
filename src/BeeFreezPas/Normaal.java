/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeeFreezPas;

import Exceptions.BedragMaximumBereiktException;
import Exceptions.KredietlimietBereiktException;
import Exceptions.SaldoNietNegatiefException;
import Exceptions.TankLimietBereiktException;

/**
 *
 * @author Johan
 */
public class Normaal 
    extends BeeFreezPas {

    
    /**
     * Normale pas geen restricties aan betalen en tanken
     * @param nummer Nummer van de pas
     * @param houder Houder van de pas
     */
    public Normaal(long nummer, String houder) {
        super(nummer, houder);
    }

    /**
     * Normale pas geen restricties aan betalen en tanken
     * @param nummer Nummer van de pas
     * @param houder Houder van de pas
     * @param bedrag Saldo van de pas
     */
    public Normaal(long nummer, String houder, double bedrag) {
        super(nummer, houder, bedrag);
    }
    
    @Override
    public void spaar(double liters) 
        throws TankLimietBereiktException
    {
        if (liters > 150){
            throw new TankLimietBereiktException("Tanken kan tot maximaal 150 liter");
        }
        super.spaar(liters);
    }
    
    /**
     * 
     * @param bedrag
     * <p>
     * <b>Preconditie:</b> Saldo moet positief of null blijven
     * <br>
     * <b>Postconditie:</b> Saldo verlaagt met bedrag
     * @return True indien methode succesvol uitgevoerd
     * @throws SaldoNietNegatiefException Indien saldo met betaling
     * negatief wordt.
     * @throws KredietlimietBereiktException Indien kredietlimiet bereikt
     * @throws BedragMaximumBereiktException Indien betaald wordt met maximum bedrag
     */
    @Override
    public boolean betaal(double bedrag)
            throws SaldoNietNegatiefException, KredietlimietBereiktException, BedragMaximumBereiktException
    {
        if (this.bedrag - bedrag <= 0){
            throw new SaldoNietNegatiefException("Saldo mag niet negatief worden");
        }
        return super.betaal(bedrag);
    }
    
}
