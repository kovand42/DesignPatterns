/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdesignpatterns;

import java.util.Observable;

/**
 *
 * @author andras.kovacs
 */
public class Vulkaan extends Observable {

    private boolean uitbarsting;
    public Vulkaan(boolean uitbarsting){
        this.uitbarsting = uitbarsting;
    }
    
    public void setUitbarsting(boolean uitbarsting) {
        this.uitbarsting = uitbarsting;
        System.out.println("\n" + "vulkaan uitbarsting " + uitbarsting);
        setChanged();        
        notifyObservers();
    }
    public boolean getUitbarsting(){
        return uitbarsting;
    }
}
