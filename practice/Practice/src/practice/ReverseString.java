package practice;

import java.io.PrintStream;

public class ReverseString
{
  public static void main(String[] args)
  {
    String s = "Hello";
    char[] ca = s.toCharArray();
    
    int len = s.length();
    for (int i = 0; i < len / 2; i++)
    {
      char c = ca[i];
      System.out.println(c);
      ca[i] = ca[(len - 1 - i)];
      System.out.println(ca[i]);
      ca[(len - 1 - i)] = c;
    }
    System.out.println(String.valueOf(ca));
  }
}
