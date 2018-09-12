/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome3;
import javax.swing.JOptionPane;
 //@author conas1290
public class Palindrome3 {
public static void main(String[] args) {
     String orginalWord = JOptionPane.showInputDialog
 ("Words that are arranged the same way forwards as they are backwards are called palindromes"+"\n\nEnter a Word");   
    String word = orginalWord.replaceAll("\\s","");
    String backwardsWord = "";
for (int pos = word.length() - 1; pos >= 0; pos--) {
backwardsWord += word.charAt(pos); }
if (word.equalsIgnoreCase(backwardsWord)){
  System.out.println("That sentence  is a palindrome");
   }else{
  System.out.println("That sentence is not a palindrome");}      
 }
}