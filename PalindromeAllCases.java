// Using Buffer

import java.util.*;

public class HelloWorld{
  
  // iterative solution
  static boolean palindrome(String s1){
    if(s1==null || s1.length()<=1)
      return true;
    for(int i=0, j=s1.length()-1;i<j;++i,--j){
      if(s1.charAt(i)!=s1.charAt(j))
        return false;
    }
    return true;
  }
  
  //Recursive
  static boolean palindromeRec(String s1){
    System.out.println("S1: "+s1);
    if(s1==null || s1.length()<=1)
      return true;
    if(s1.charAt(0) != s1.charAt(s1.length()-1))
      return false;
    return palindromeRec(s1.substring(1,s1.length()-1));
  }
  
  //Iterative sol(reverse and check)
  static boolean palindromeReverse(String s1){
    if(s1==null || s1.length()<=1)
      return true;
    String rev="";
    for(int i=s1.length()-1;i>=0;--i){
      rev+=(s1.charAt(i));
    }
    return rev.equals(s1);
  }
  
  
  
  public static void main(String[] args){
    String s1=args[0];
    if(palindromeReverse(s1))
    	System.out.println("YES");
    else
      System.out.println("NO");
  }
}
