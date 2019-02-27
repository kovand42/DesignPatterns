/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdesignpatterns;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author andras.kovacs
 */
public class StartDieren {

    public void dierenOpslaan() {
        if (!(Files.exists(Paths.get("/data/dieren.txt")))) {
            try (BufferedWriter writer
                    = Files.newBufferedWriter(Paths.get("/data/dieren.txt"))) {
                writer.write("VVincent\r\n");
                writer.write("VVega\r\n");
                writer.write("ZZack\r\n");
                writer.write("ZZoe\r\n");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
