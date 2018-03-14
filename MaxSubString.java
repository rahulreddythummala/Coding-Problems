// Using Buffer

import java.util.*;

public class HelloWorld{
  
  // iterative solution
  static String maxSubString(String s1){
    if(s1==null || s1.length()<=1)
      return s1;
    StringBuilder rst=new StringBuilder("");
    String result="";
    HashSet<Character> st=new HashSet<>();
    for(int i=0;i<s1.length();++i){
      if(!st.contains(s1.charAt(i))){
	  	st.add(s1.charAt(i));
        rst.append(s1.charAt(i));
      }else{
      	st.clear();
        st.add(s1.charAt(i));
        rst.setLength(0);
        rst.append(s1.charAt(i));
      }
      if(rst.length()>=result.length())
        result=rst.toString();
//      System.out.printf("Result: %s, Rst: %s%n", result, rst);
    }
    return result;
  }
  
  
  public static void main(String[] args){
    String s1=args[0];
    String rst=maxSubString(s1);
    System.out.println(rst+" "+rst.length());    
  }
}
