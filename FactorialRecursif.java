/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_18Mei2024;

import static PBO_18Mei2024.FactorialIterasi.factorial;

/**
 *
 * @author LENOVO
 */
public class FactorialRecursif {
    static int factorial(int n){
        if(n==1){
            /*The base case */            
            return 1;
        }
        /* Recursif definiton; self-invocation */
         return factorial(n-1);
    }
    /**
     * @param args the command line argument
     */
    public static void main(String[] args){
        //TODO code application logic here
        int n=4;
        System.out.println(factorial(n));
    }
}
   