/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeeFreez;

import BeeFreezPas.BeeFreezPas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Johan
 */
public class BeeFreezMenu {
    private List<BeeFreezPas> passen;
    /*
    public BeeFreezMenu(){
         passen = new ArrayList<>();
    */
    }
    
/*
    public void showMenu(){
        boolean stoppen = false;
        while(!stoppen){
            printMenu();
            String input = leesInput("");
            switch (input){
                case "0":
                    stoppen = true;
                    break;
                case "1":
                    invoerPas();
                    break;
                case "2":
                    toonPassen();
                    break;
                case "3":
                    spaarMetPas();
                    break;
                case "4":
                    betaalMetPas();
                    break;
            }
        }
        System.out.println("Programma is gestopt...");
    }
    
    private void printMenu(){
        System.out.println("\n\n0: Stop programma");
        System.out.println("1: BeeFreezPass invoeren");
        System.out.println("2: Toon alle passen");
        System.out.println("3: Spaar met pas");
        System.out.println("4: Betaal met pas");
        System.out.print("\nUw keuze: ");
    }
    
    private void invoerPas(){
        System.out.println("Nieuwe pas");
        boolean inputOk = false;
        String naam = "";
        while (!inputOk){
            inputOk = true;
            naam = leesInput("Naam van de houder");
            if(naam.length() == 0){
                System.out.println("Naam moet worden ingevoerd");
                inputOk = false;
             }
            else{
                BeeFreezPas bfp = zoekPas(naam);
                if (bfp != null){
                    System.out.println("Naam is al eerder ingevoerd!");
                    inputOk = false;
                }
            }
        }
    
        String bedrag = leesInput ("Geef bedrag (of laat leeg)");
        
        if(bedrag.length() == 0){
            passen.add(new BeeFreezPas(naam));
        }
        else {
            passen.add(new BeeFreezPas(naam, convertToDouble(bedrag)));
        }
    }
    
    private void toonPassen(){
        System.out.println("Aanwezige passen");
        for(BeeFreezPas bfp : passen){
            System.out.println(bfp.toString());
            System.out.println("");
        }
    }
 
    private void spaarMetPas(){
        System.out.println("Spaar met pas");
        String naam = leesInput("Naam van de houder");
        BeeFreezPas bfp = zoekPas(naam);
        if(bfp != null){
            double liters = convertToDouble(leesInput("Aantal getankte liters"));
            if(liters>0 && liters<=100){
                bfp.spaar(liters);
                System.out.println("Saldo toegevoegd aan spaarkaart");
            }
            else{
                System.out.println(">>> Ongeldige waarde voor getankte liters!");
            }
        }
    }
    
    private void betaalMetPas(){
        System.out.println("Betaal met pas");
        String naam = leesInput("Naam van de houder");
        BeeFreezPas bfp = zoekPas(naam);
        if(bfp != null){
            double bedrag = convertToDouble(leesInput("Betaalde bedrag"));
            if (bfp.betaal(bedrag)){
                System.out.println("Betaling is verwerkt");
            }
            else {
               System.out.println(">>> Ontoereikend saldo!"); 
            }
        }
    }
     
    private String leesInput(String melding){
        if(melding.length() > 0 ) {
            System.out.print(melding + ":");
        }
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private double convertToDouble(String numberAsString){
        double result;
        numberAsString = numberAsString.replace(",",".");
        try{
            result = Double.valueOf(numberAsString);
        }
        catch (NumberFormatException nfe){
            result = 0;
        }
        return result;
    }
 
    private BeeFreezPas zoekPas(String naam){
        for(BeeFreezPas bfp : passen){
            if(bfp.naam.equals(naam)) {
                return bfp;
            }
        }
        System.out.println(">>> Er is voor " + naam + " geen pas aanwezig!");
        return null;
    }

}
*/   