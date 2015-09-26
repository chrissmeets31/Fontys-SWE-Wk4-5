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
public class Credit
    extends BeeFreezPas
{

    private double kredietLimiet;
    
    public Credit(long nummer, String houder) {
        super(nummer,houder);
        kredietLimiet = 0;
    }
    public Credit(long nummer, String houder, double bedrag) {
        super(nummer, houder, bedrag);
        kredietLimiet = 0;
    }
    public Credit(long nummer, String houder, double bedrag, double kredietLimiet) {
        super(nummer, houder, bedrag);
        this.kredietLimiet = kredietLimiet;
    }
    
    @Override
    public boolean betaal(double bedrag)
            throws SaldoNietNegatiefException, KredietlimietBereiktException, BedragMaximumBereiktException
    {
         if (this.bedrag - bedrag <= kredietLimiet ){
            throw new KredietlimietBereiktException("Kredietlimiet bereikt");
        }
        return super.betaal(bedrag);
    }
}
