package premkupp.practice.general;

import java.io.PrintStream;

public class Polymorphism
{
  public static void main(String[] args)
  {
    Calculator c = new Calculator();
    System.out.println(c.add(1, 2));
    System.out.println(c.add(1, 2, 3));
    
    c = new FunnyCalculator();
    System.out.println(c.add(1, 2));
    System.out.println(c.add(1, 2, 3));
  }
}
