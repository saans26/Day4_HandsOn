/*
 * 1) Write a Program to check whether a given String is Palindrome or not.
 */

package Day4;

public class Palindrome {

	public static void main(String[] args) 
	{
		String s = "poop";
		StringBuffer b = new StringBuffer(s);
		b.reverse();
		String c = b.toString();
		if(s.equals(c))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
	}

}
