/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdesignpatterns;

/**
 *
 * @author andras.kovacs
 */
public enum InwonerFactory {
    INSTANCE;
    public Inwoner maak(String dier){
        int lengte = dier.length();
        String soort = dier.substring(0, 1);
        String naam = dier.substring(1, lengte);
        switch (soort){
            case "V":
                return new Vogel(soort, naam);
            case "Z":
                return new Zoogdier(soort, naam);
            default:
                throw new IllegalArgumentException();
        }
    }
}
