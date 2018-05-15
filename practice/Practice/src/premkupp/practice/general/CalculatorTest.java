package premkupp.practice.general;

public class CalculatorTest {

	public static void main(String[] args)
	{
		Calculator c1 = new Calculator();
		System.out.println(c1.add(2, 4));
		
		Calculator c2 = new FunnyCalculator();
		System.out.println(c2.add(1, 2));

	}

}
