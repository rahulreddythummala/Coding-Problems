// Using Buffer

import java.util.*;

public class HelloWorld{
  
  // iterative solution
  static void sortString(String s1){
  	int[] freq=new int[26];
    for(int i=0;i<s1.length();++i){
      int index=s1.charAt(i)-'a';
      ++freq[index];
    }
    for(int i=0;i<26;++i){
      int f=freq[i];
      while(f-- > 0){
        System.out.print(""+(char)('a'+i));
      }
    }
  }
  
  
  public static void main(String[] args){
    String s1=args[0];
    sortString(s1);
  }
}
