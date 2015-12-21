/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaftanoglu_erol_1321221029;

import kaftanoglu_erol_1321221029.Search.LinerSearch;
import kaftanoglu_erol_1321221029.Search.MyBinarySearch;
import kaftanoglu_erol_1321221029.Sort.MyInsertionSort;
import kaftanoglu_erol_1321221029.Sort.BubbleSort;
import kaftanoglu_erol_1321221029.Sort.MySelectionSort;
import kaftanoglu_erol_1321221029.Sort.MyQuickSort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author erol
 */
public class Kaftanoglu_erol_1321221029 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("run is working");
        File file = new File("dosya.txt");
        String numbers = "1 4 42 51 12 1 515 59 5 25 66";
        int a = 0;
        if (file.exists()) {
            int[] array = readFile(file);

            Scanner sc = new Scanner(System.in);
            System.out.println("Bir sayi giriniz ");

            System.out.println("Sort Algoritmalari: 1");
            System.out.println("Search Algoritmalari: 2");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    long startTime = System.currentTimeMillis();
                    // ... zaman alan bazı işlemler ...
                    BubbleSort.bubble_srt(array);
                    long endTime = System.currentTimeMillis();
                    System.out.print("bubble time: ");
                    System.out.println(currentTime(startTime, endTime));
                    long startTime2 = System.currentTimeMillis();
                    MySelectionSort.doSelectionSort(array);
                    long endTime2 = System.currentTimeMillis();
                    System.out.print("doSelection time: ");
                    System.out.println(currentTime(startTime2, endTime2));
                    long startTime3 = System.currentTimeMillis();
                    MyInsertionSort.doInsertionSort(array);
                    long endTime3 = System.currentTimeMillis();
                    System.out.print("doInsertionSort time: ");
                    System.out.println(currentTime(startTime3, endTime3));
                    MyQuickSort qs = new MyQuickSort();
                    long startTime4 = System.currentTimeMillis();
                    qs.sort(array);
                    long endTime4 = System.currentTimeMillis();
                    System.out.print("MyQuickSort time: ");
                    System.out.println(currentTime(startTime4, endTime4));
                    System.out.println("Sıralama algoritmalarından en hızlısı MyQuickSort en yavaşı ise bubble sort oldu.");

                    break;
                case 2:
                    MyBinarySearch bs = new MyBinarySearch();
                    
                    int search;
                    int index;
                    while(1<2){
                        System.out.println("Aramak istedigimzi sayiyi giriniz.");
                        search = sc.nextInt();
                        if(bs.binarySearch(array, search) != -1){
                            index = bs.binarySearch(array, search);
                            System.out.println("binarySearch: " +"bulunan index: " + index);
                    
                            
                        }else{
                            System.out.println("binarySearch bulamadi.");
                        }
                        if (LinerSearch.linerSearch(array, search) != -1) {
                           
                          index = LinerSearch.linerSearch(array, search);
                            System.out.println("linerSearch: " +"bulunan index: " + index);
                            break;
                        }else{
                            System.out.println("LinerSearch bulamadi.");
                        }
                        
                        System.out.println("bulamadim tekrar denemek ister misin?");
                    }
                    long time1 = System.currentTimeMillis();
                    index = LinerSearch.linerSearch(array, search);
                    long time2 = System.currentTimeMillis();
                    double nanosec = currentTime(time1, time2);
                    System.out.println("linerSearch: " + nanosec + "seconds");
                    long s2 = System.currentTimeMillis();
                    long e2 = System.currentTimeMillis();
                    nanosec = currentTime(s2, e2);
                    System.out.println("binarySearch: " + nanosec +"seconds");
                    
                    
                    break;
                default:
                    System.out.println("bir secim yapin");
                   
                    break;
            }
        } else {
            dosyaYaz(file, numbers);
             System.out.println("tekrar run tusuna basin");
            
        }
    }

    static double currentTime(long startTime, long endTime) {

        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds = (double) estimatedTime / 1000; // nanosaniyeye çevirmek için 1000000000'e bölüyoruz.
        return seconds;
    }

    static int[] readFile(File file) {
        String[] array = null;
        int[] intarray = null;
        try {
            FileReader fileReader = new FileReader(file);
            String line;

            BufferedReader br = new BufferedReader(fileReader);

            while ((line = br.readLine()) != null) {

                System.out.println(line);
                array = line.split(" ");

            }
            intarray = new int[array.length];
            int i = 0;
            for (String str : array) {
                intarray[i] = Integer.valueOf(str);
                i++;
            }

            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kaftanoglu_erol_1321221029.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Kaftanoglu_erol_1321221029.class.getName()).log(Level.SEVERE, null, ex);
        }
        return intarray;
    }

    static void dosyaYaz(File file, String numbers) {
        String str = numbers;

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
