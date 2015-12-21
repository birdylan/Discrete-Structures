/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaftanoglu_erol_1321221029.Search;

import java.util.Arrays;

/**
 *
 * @author erol
 */
public class MyBinarySearch {

    public static String binaryStringSearch(String[] array, String word) {
        int index = Arrays.binarySearch(array, word);
        index = index >= 0 ? index : -1;
        return word + " index: " + index;
    }

    public int binarySearch(int[] inputArr, int key) {

        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

   
}
