package premkupp.practice.datastructure;

import java.io.PrintStream;

public class ReverseWordsInSentenceTest
{
  public static void main(String[] args)
  {
    BasicStack<Character> c = new BasicStack();
    BasicStack<String> s = new BasicStack();
    
    String str = "One Two Three";
    for (int i = 0; i < str.length(); i++) {
      c.push(Character.valueOf(str.charAt(i)));
    }
    for (int i = 0; i < str.length(); i++) {
      System.out.print(c.pop());
    }
    char[] strrev = new char['?'];
    for (int i = 0; i < str.length(); i++) {
      strrev[i] = str.charAt(str.length() - 1 - i);
    }
    System.out.println(String.valueOf(strrev));
    
    String[] splitted = String.valueOf(strrev).split(" ");
    for (int i = 0; i < splitted.length; i++) {
      s.push(splitted[i]);
    }
    for (int i = 0; i < splitted.length; i++) {
      System.out.println((String)s.pop());
    }
  }
  
  public void reverse(BasicStack<Character> basic) {}
}
