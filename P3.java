
/*
 * 5)Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)

i/p:Suman

o/p:uma
 */
package Day4;

public class P3 
{
	public static void main(String[] args) 
	{
		String s = new String("SANSKRUTI");
		//String s1 = "";
		for(int i=1;i<s.length()-1;i++)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
