package premkupp.practice.apps;

import premkupp.practice.datastructure.*;

import java.io.PrintStream;

public class BasicStackTest
{
	 BasicStack<String> testStack;
	 
	 public BasicStackTest() 
	 {
		this.testStack = new BasicStack<>();
	 }
	 
  public static void main(String[] args)
  {
   
    BasicStackTest b = new BasicStackTest();
    b.fill();
    System.out.println(b.testStack.size());
    System.out.println(b.testStack.contains("Four"));
    System.out.println(b.testStack.contains("Six"));
    b.emptyAndPrint();
    b.fill();
    b.testStack.access("Three");
    b.emptyAndPrint();
  }
  
  public void fill()
  {
	  
	  this.testStack.push("One");
	  this.testStack.push("Two");
	  this.testStack.push("Three");
	  this.testStack.push("Four");
	  this.testStack.push("Five");
  }
  
  public void emptyAndPrint()
  {
	  
	  for(int i=0, j=this.testStack.size(); i<j; i++)
	  {
		  System.out.println(this.testStack.pop());
	  }
  }
 
}

