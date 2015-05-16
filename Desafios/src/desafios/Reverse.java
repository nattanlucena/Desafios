/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafios;

import java.util.Scanner;

/**
 *
 * @author nattanlucena
 */
public class Reverse {
    String FirstReverse(String str) { 
        
    StringBuilder str2 = new StringBuilder();
    int length = str.length();
    
    for (int i=0; i < length; i++){  	 
        str2.append(str.charAt(length-1 - i));
    } 
    return str2.toString();
    //return new StringBuilder(str).reverse().toString();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Reverse c = new Reverse();
    System.out.print(c.FirstReverse("Rogério")); 
  } 
}
