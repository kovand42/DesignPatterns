/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdesignpatterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author andras.kovacs
 */
public class DecoratorLaad {
    private List<Inwoner> inwoners= new ArrayList<>();
    public void laadDieren(){
        try(LineNumberReader reader = new LineNumberReader(
        new BufferedReader(
        new FileReader("/data/dieren.txt")))){
            String line = reader.readLine();
            while(line != null){
                Inwoner inwoner = InwonerFactory.INSTANCE.maak(line) ;
                inwoners.add(inwoner);
                line = reader.readLine();
            }
        }catch(IOException ex){
            ex.printStackTrace(System.err);
        }
    }
    public List<Inwoner> getInwoners(){
        return inwoners;
    }
}
