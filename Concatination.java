/*
 * 2) Write a java program that will concatenate 2 strings and return the result.

The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)

i/p:Sachin,Tendulkar

o/p:sachin tendulkar

Example2)

i/p:Mark,kate

o/p:markate
 */

package Day4;

public class Concatination {

	public static void main(String[] args) 
	{
		String s = "Sanskruti@";
		String s1 = "Jalte";
		String s2 = "";
		s = s.toLowerCase();
		s1 = s1.toLowerCase();
		s = s + s1;
		System.out.println(s);
		for(int i = 0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				s2 = s2+s.charAt(i);
			}
			else
			{
				s2 = s2 + " ";
			}
		}
		System.out.println(s2);
				

	}

}
