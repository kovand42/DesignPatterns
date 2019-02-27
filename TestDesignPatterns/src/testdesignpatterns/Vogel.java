/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdesignpatterns;

import java.util.Observer;
import java.util.Observable;
/**
 *
 * @author andras.kovacs
 */
public class Vogel extends Inwoner implements Observer{
    private String soort;
    private String naam;
    public Vogel(String soort, String naam){
        super(soort, naam);
    }
    @Override
    public void update(Observable observable, Object object){
        if(!(observable instanceof Vulkaan)){
            throw new IllegalArgumentException();
        }
        Vulkaan vulkaan = (Vulkaan) observable;
        if(vulkaan.getUitbarsting()){
            System.out.println(this.getNaam() + " vogel vliegt hoger");
        }else{
            System.out.println(this.getNaam() + " vogel vliegt lager");
        }
    }
}
