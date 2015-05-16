/*
 Using the Java language, have the function LetterChanges(str) 
take the str parameter being passed and modify it using the following algorithm. 
Replace every letter in the string with the letter following it in the 
alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this 
new string (a, e, i, o, u) and finally return this modified string. 
 */
package desafios;

import java.util.Scanner;

/**
 *
 * @author nattanlucena
 */
public class LetterChange {

    String LetterChanges(String str) {

        StringBuilder str2 = new StringBuilder();
        String vogais[] = {"a", "e", "i", "o", "u"};
        String temp;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            
            if (str.charAt(i) != ' ') {
                
                temp = String.valueOf((char) (str.charAt(i) + 1));
                if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                        || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                    
                    if (str.charAt(i) == (char) 'Z') {
                        str2.append("A");                        
                    }
                    if (str.charAt(i) == (char) 'z') {
                        str2.append("A");                        
                    }
                    
                    for(String s: vogais){
                    
                        if(temp.equals(s)){
                            str2.append(temp.toUpperCase());
                            temp = "";
                        }
                    
                    }
                    
                    str2.append(temp);
                    
                }else{
                    str2.append(str.charAt(i));
                }
                
            }else{
                str2.append(" ");
            }
        }
        return str2.toString();

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        LetterChange c = new LetterChange();
        System.out.print(c.LetterChanges("dh mn"));

    }
}
