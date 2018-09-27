package premkupp.practice.general;


public class LanguageTest 
{
	public static void main(String[] args)
	{
		Language a= new Language();
		a.greeting();
		
		Language b = new English();
		b.greeting();
		
		Language c = new Spanish();
		c.greeting();
		
		int min = 1;
		int max = 10;
		int r = (int) (0 * (max - min))+1;
		System.out.println(r);
		
		int i=100;
		String str= Integer.toString(i);
		System.out.println(str);
		int j=Integer.parseInt(str);
		System.out.println(j);
	}
	
}
