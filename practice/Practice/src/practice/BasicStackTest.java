package practice;

import java.io.PrintStream;

public class BasicStackTest
{
  public static void main(String[] args)
  {
    BasicStack<String> mystack = new BasicStack<String>();
    
    mystack.push("One");
    mystack.push("Two");
    mystack.push("Three");
    
    System.out.println((String)mystack.pop());
    System.out.println((String)mystack.pop());
    System.out.println((String)mystack.pop());
  }
}
