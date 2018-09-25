package premkupp.practice.general;

import premkupp.practice.datastructure.BasicStack;

public class ReverseWordsInSentenceTest1 {

	public static void main(String[] args) 
	{
		String origString = "One Two Three Four Five";
		String returnString = "";
		char[] tempString = new char[origString.length()];
		
		//logic
		/*
		 * 1. Reverse sentence - eerhT owT enO
		 * 2. Push to stack the words - pop and append
		 */
		
		for(int i=0, j=origString.length(); i<j; i++)
		{
			tempString[i] = origString.charAt(j-i-1);
		}
		
		System.out.println(String.valueOf(tempString));
		
		BasicStack<String> stack = new BasicStack<String>();
		
		String[] splitted = String.valueOf(tempString).split(" ");
		for(int i=splitted.length-1; i>=0; i--)
		{
			returnString= returnString + splitted[i] + " ";
		}
		
		System.out.println("Reversed string For Loop:");
		System.out.println(returnString);
		
	}

}
