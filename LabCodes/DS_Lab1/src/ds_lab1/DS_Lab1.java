/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_lab1;

/**
 *
 * @author erolkaftanoglu
 */
public class DS_Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        boolean p = false;
        boolean q = false;
        System.out.println("P degeri "+p+ " q degeri "+ q);
        System.out.println("or = " + (p || q)); // or 
        System.out.println("and = " + (p && q)); // and
        System.out.println("not p = " + (!p)); // not
        System.out.println("not q = " + (!q)); // not
        System.out.println("xor = " + ((p||q) && (!p || !q))); //xor
        System.out.println("if,then = " +(p?q:true)); //if,then
        System.out.println("iff = " +((p && q) || (!p && !q))); //iff
        
        if ((p || q) == !(!p && !q)) {
            System.out.println((p || q));
            System.out.println(!(!p && !q));
        }
        
        System.out.println("ornek: "+((!p && (p || q)) ?q:true));
    }
    
}
