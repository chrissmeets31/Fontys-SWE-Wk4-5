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
import java.text.DecimalFormat;
/**
 * 
 * @author Johan
 */
public abstract class BeeFreezPas {

	/**
         * Fields
         */
        private long nummer;
        private String houder;
	protected double bedrag;
	private int aantalKeerGespaard;
        private int aantalKeerBetaald;

        /**
         * Constructor
         * Initialiseert attributen.
         * @param nummer nummer van de pas
         * @param houder houder van de pas
         */
        public BeeFreezPas(long nummer, String houder) {
            this.nummer = nummer;
            this.houder = houder;
                    
            this.bedrag = 0;
            this.aantalKeerGespaard = 0;
            this.aantalKeerBetaald = 0;
        }

        /**
         * Constructor
         * Initialiseer attributen
         * @param nummer nummer van de pas
         * @param houder houder van de pas
         * @param gespaardBedrag bedrag dat op de pas gespaard is
         */
        public BeeFreezPas(long nummer, String houder, double gespaardBedrag) {
            this.nummer = nummer;
            this.houder = houder;
            this.bedrag = gespaardBedrag;
            this.aantalKeerGespaard = 1;
            this.aantalKeerBetaald = 0;
	}

	/**
	 * Methode om saldo a.d.h.v. het aantal getankte liters
         * op te hogen
	 * @param liters getankte liters
         * @throws Exceptions.TankLimietBereiktException
	 */
	public void spaar(double liters)
                throws TankLimietBereiktException
        {
            if (liters > 0) {
                bedrag += liters * 0.05;
                aantalKeerGespaard++;
            }
	}

        /**
         * Methode om saldo aan te passen met het betaalde bedrag
         * @param bedrag dat is betaald
         * @throws Exceptions.SaldoNietNegatiefException
         * @throws Exceptions.KredietlimietBereiktException
         * @throws Exceptions.BedragMaximumBereiktException
         * @return 
         *      true betalen is geslaagd
         *      false saldo ontoereikend
         */
	public boolean betaal(double bedrag)
            throws SaldoNietNegatiefException, KredietlimietBereiktException, BedragMaximumBereiktException
        {
            boolean resultaat = false;
            if (bedrag > 0) {
                if(this.bedrag - bedrag >= 0){
                    this.bedrag -= bedrag;
                    aantalKeerBetaald++;
                    resultaat = true;
                }
            }
            return resultaat;
	}
        
        public long getNummer(){
            return this.nummer;
        }
        
        /**
         * Methode om de naam van de houder van de pas op te vragen
         * @return naam naam van de houder van de pas
         */
        public String getHouder(){
            return this.houder;
        }
        
        /**
         * Methode om het bedrag dat op de pas is gespaard op te vragen
         * @return bedrag bedrag dat op de pas is gespaard
         */
        public double getBedrag() {
            return this.bedrag;
        }
        
        /**
         * Methode om het aantal keren dat de houder van de pas heeft 
         * gespaard op te vragen
         * @return aantal keren dat de houder van de pas heeft gespaard
         */
        public int getAantalKeerGespaard() {
            return this.aantalKeerGespaard;
        }
        
        /**
         * Methode om het aantal keren dat de houder van de pas heeft 
         * betaald op te vragen
         * @return aantal keren dat de houder van de pas heeft betaald
         */
        public int getBetalingen(){
            return this.aantalKeerBetaald;
        }
        
        /**
         * Methode om de pas gegevens op te vragen
         * @return string
         */
        @Override
        public String toString(){
            DecimalFormat df = new DecimalFormat("0.00");
            return "Naam van de houder   : " + houder + "\n" +
                   "Gespaard bedrag      : €" + df.format(bedrag) + "\n" +
                   "Aantal keer gespaard : " + aantalKeerGespaard +  "\n" +
                   "Aantal keer betaald  : " + aantalKeerBetaald;
        }
}