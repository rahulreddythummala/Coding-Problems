// Using Buffer

import java.util.*;

public class HelloWorld{
  
  
  static String commonChars(String s1, String s2){
  	//base case
    if(s1==null || s2==null || 
       s2.isEmpty() || s1.isEmpty()) 
      return s1;
    String s3="";
    HashMap<Character, Integer> mp=new HashMap<>();
    for(int i=0;i<s2.length();++i){
      char ch=s2.charAt(i);
      if(mp.get(ch)!=null)
        mp.put(ch,mp.get(ch)+1);
      else mp.put(ch,1);
    }
    for(int j=0;j<s1.length();++j){
      char ch=s1.charAt(j);
      if(mp.get(ch)!=null && mp.get(ch)>0){
        s3+=""+ch;
      	mp.put(ch,mp.get(ch)-1);
      }
    }
    return s3;    
  }
  
  static String stringDiff(String s1, String s2){
  	//base case
    if(s1==null || s2==null || 
       s2.isEmpty() || s1.isEmpty()) 
      return s1;
    String s3="";
    HashMap<Character, Integer> mp=new HashMap<>();
    for(int i=0;i<s2.length();++i){
      char ch=s2.charAt(i);
      if(mp.get(ch)!=null)
        mp.put(ch,mp.get(ch)+1);
      else mp.put(ch,1);
    }
    for(int j=0;j<s1.length();++j){
      char ch=s1.charAt(j);
      if(mp.get(ch)==null){
        s3+=ch;
      }else{
       	mp.put(ch, mp.get(ch)-1); 
	    if(mp.get(ch)<0)
        	s3+=ch;
      }
    }
    return s3;
  }
  
  static String completeStringDiff(String s1, String s2){
  //base case
    if(s1==null || s2==null || 
       s2.isEmpty() || s1.isEmpty()) 
      return s1;
    String s3="";
    HashMap<Character, Integer> mp=new HashMap<>();
    for(int i=0;i<s2.length();++i){
      char ch=s2.charAt(i);
      if(mp.get(ch)!=null)
        mp.put(ch,mp.get(ch)+1);
      else mp.put(ch,1);
    }
    for(int j=0;j<s1.length();++j){
      char ch=s1.charAt(j);
      if(mp.get(ch)==null){
        s3+=ch;
      }
    }
    return s3;
  }
  public static void main(String[] args){
    String s1=args[0];
    String s2=args[1];
    System.out.println(commonChars(s1,s2));
	System.out.println(stringDiff(s1,s2));
    System.out.println(completeStringDiff(s1,s2));
  }
}
