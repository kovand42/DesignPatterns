/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdesignpatterns;

import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author andras.kovacs
 */
public abstract class Inwoner implements Observer {
    private String soort;
    private String naam;

    public Inwoner(String soort, String naam) {
        setSoort(soort);
        setNaam(naam);
    }
    
    @Override
    public abstract void update(Observable observable, Object object);
    
    public final void setSoort(String soort){
        this.soort = soort;
    }
    
    public final void setNaam(String naam){
        this.naam = naam;
    }

    public String getSoort() {
        return soort;
    }

    public String getNaam() {
        return naam;
    }
}
