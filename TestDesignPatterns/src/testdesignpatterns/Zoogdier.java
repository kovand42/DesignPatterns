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
public class Zoogdier extends Inwoner implements Observer{
    private String soort;
    private String naam;
    public Zoogdier(String soort, String naam) {
        super(soort, naam);
    }
    @Override
    public void update(Observable observable, Object object) {
        if (!(observable instanceof Vulkaan)) {
            throw new IllegalArgumentException();
        }
        Vulkaan vulkaan = (Vulkaan) observable;
        if (vulkaan.getUitbarsting()) {
            System.out.println(this.getNaam() + " zoogdier schuilt in hun hol");
        } else {
            System.out.println(this.getNaam() + " zoogdier komt uit hun hol");
        }
    }
}
