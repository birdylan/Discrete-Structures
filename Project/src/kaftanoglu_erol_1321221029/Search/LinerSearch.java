/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaftanoglu_erol_1321221029.Search;



/**
 *
 * @author erol
 */
public class LinerSearch {
   
    public static void linsearch(String string[], String search)
    {
        int i = 0;
        int flag = 0;
        for (String str : string) {
            
            if (search.equals(str))
            {
                flag = 1;
                break;
            }
            i++;
        }
        if (flag ==1)
        {
            System.out.println("Word found at position " +(i+1));
        }
        else
        {
            System.out.println("Word not found.");
        }
    }

    
    
    
    
    public static int linerSearch(int[] arr, int key){
         
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
     
    
}
