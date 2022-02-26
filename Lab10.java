//***********************************************
//Aziah Blanding
//Lab 10
//November 8, 2021
//Using return method and finding # of vowels
//************************************************
import java.util.Scanner;

public class Lab10
{
	public static Scanner console = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a sequence of characters: ");
		String characters = console.nextLine();

		int vowel = 0;

	//count vowels with loop
		for(int i = 0; i < characters.length(); i++)
			{
				vowel += isVowel(characters.charAt(i));
			}

		System.out.println("Number of vowels: "+vowel);
	}

	public static int isVowel(char tfvalue)
	{
		if (tfvalue == 'a' || tfvalue == 'A' || tfvalue == 'e' || tfvalue == 'E' || tfvalue == 'i' || tfvalue == 'I'|| tfvalue == 'o'|| tfvalue == 'O'|| tfvalue == 'u'|| tfvalue == 'U')
			return 1;
		else
			return 0;
	}
}