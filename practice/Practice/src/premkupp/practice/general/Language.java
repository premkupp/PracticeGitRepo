package premkupp.practice.general;

public class Language {

	public Language() {
		
	}
	
	public void greeting() {
		System.out.println("Hello!, Hola!, Bonjour!");
	}
}

class English extends Language {
	public English() {
		
	}
	
	public void greeting() {
		System.out.println("Hello!");
	}
}

class Spanish extends Language
{
	public Spanish()
	{
		
	}
	
	public void greeting()
	{
		System.out.println("Hola!");
	}
}