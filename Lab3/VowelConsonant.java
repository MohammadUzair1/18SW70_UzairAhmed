import java.util.*;
class VowelConsonant
{
	public static void main(String[] args) {
		char a;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		a=scnr.next().charAt(0);
		switch(a){
			case 'a': System.out.println("Its a vowel"); 
					  break;
			case 'e': System.out.println("Its a vowel"); 
					  break;
		    case 'i': System.out.println("Its a vowel"); 
					  break;
			case 'o': System.out.println("Its a vowel"); 
					  break;
			case 'u': System.out.println("Its a vowel"); 
					  break;
			case 'A': System.out.println("Its a vowel"); 
					  break;
			case 'E': System.out.println("Its a vowel"); 
					  break;
			case 'I': System.out.println("Its a vowel"); 
					  break;
			case 'O': System.out.println("Its a vowel"); 
					  break;
			case 'U': System.out.println("Its a vowel"); 
					  break;
		default:
		System.out.println("Its a consonant");

		}

	}
}