// Using Buffer

import java.util.*;

public class HelloWorld{
  
  // iterative solution
  static void uniqueChars(String s1){
  	//base case
    if(s1==null || s1.isEmpty()) 
      return;
    HashMap<Character, Integer> mp=new HashMap<>();
    for(int i=0;i<s1.length();++i){
      char ch=s1.charAt(i);  
      if(mp.get(ch)==null)
	      mp.put(ch,1);
      else mp.put(ch,mp.get(ch)+1);
    }
    for(int i=0;i<s1.length();++i){
      char ch=s1.charAt(i);
      if(mp.get(ch)==1)
        System.out.print(ch);
    }
  }
  
    // iterative solution
  static void repeatedChars(String s1){
  	//base case
    if(s1==null || s1.isEmpty()) 
      return;
    HashMap<Character, Integer> mp=new HashMap<>();
    for(int i=0;i<s1.length();++i){
      char ch=s1.charAt(i);  
      if(mp.get(ch)==null)
	      mp.put(ch,1);
      else mp.put(ch,mp.get(ch)+1);
    }
    for(int i=0;i<s1.length();++i){
      char ch=s1.charAt(i);
      if(mp.get(ch)!=1){
        System.out.print(ch);
        mp.put(ch,1);
      }
    }
  }
  
  static void removeDuplicates(String s1){
   int checker=0;
    for(int i=0;i<s1.length();++i){
      char ch=s1.charAt(i);
      int bit=1<<(ch-'a');
      if((checker | bit)!=checker){
      	 System.out.print(ch);
      }
      checker|=bit;
    }
    
  }
  
  
  public static void main(String[] args){
    String s1=args[0];
//    uniqueChars(s1);
//    repeatedChars(s1);
    removeDuplicates(s1);
  }
}
