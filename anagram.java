import java.util.*;
import javax.swing.*;
public class anagram {
   public static void main(String[] args) {
       String str = JOptionPane.showInputDialog("Enter a String: ");
       String str2 = JOptionPane.showInputDialog("Enter 2nd String: ");
       
       List l =new ArrayList();
       for(int i=0; i<str.length(); i++)
       {
           l.add(str.charAt(i));
       }
       List l2 =new ArrayList();
       for(int i=0; i<str2.length(); i++)
       {
           l2.add(str2.charAt(i));
       }
       if(l.containsAll(l2))
       {
           System.out.print("Anagram");
       }
       else
       System.out.print("Not Anagram");
   } 
}
