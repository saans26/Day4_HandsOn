/*
 * 8) Write a Java program that accepts a string (with * in it). The program should return a 
 * new string in which the following characters are removed-*,the characters that are to the left 
 * and right of *
Example1)
i/p:ab*cd
o/p:ad
 */

package Day4;

public class P6 {

	public static void main(String[] args) 
	{
		String s ="ab*cd";
		String s1 = "";
		int l = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
			{
				l=i;
			}
		}
		System.out.println(s.charAt(l-1) + "" + s.charAt(l+1));

	}

}
