/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaftanoglu_erol_1321221029;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kaftanoglu_erol_1321221029.Search.LinerSearch;
import kaftanoglu_erol_1321221029.Search.MyBinarySearch;

/**
 *
 * @author erol
 */
public class StringTest {

    public static void main(String[] args) {
        System.out.println("run is working for string");
        File file = new File("dosyaString.txt");
        String str = "abc1 abc2 abc3 abc4 sayfa abc5";
        String[] array = readFile(file);

        String word = "sayfa";

        if (file.exists()) {
            //JOptionPane.showMessageDialog(null, MyBinarySearch.binaryStringSearch(array, word));
            LinerSearch.linsearch(array, word);
        } else {
            dosyaYaz(file, str);
            System.out.println("tekrar run tusuna basin");
        }

    }

    static String[] readFile(File file) {
        String[] array = null;
        try {
            FileReader fileReader = new FileReader(file);
            String line;

            BufferedReader br = new BufferedReader(fileReader);

            while ((line = br.readLine()) != null) {

                System.out.println(line);
                array = line.split(" ");

            }

            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kaftanoglu_erol_1321221029.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Kaftanoglu_erol_1321221029.class.getName()).log(Level.SEVERE, null, ex);
        }
        return array;
    }

    static void dosyaYaz(File file, String str) {

        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter fileWriter = new FileWriter(file, false);
                BufferedWriter bWriter = new BufferedWriter(fileWriter);
                bWriter.write(str);
                bWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Kaftanoglu_erol_1321221029.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
