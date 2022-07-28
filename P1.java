/*
 * 3) Given a string, return a new string made of 'n' copies of the first 2 chars of the original string

where 'n' is the length of the string.

Example1)

i/p:Hello

o/p:HeHeHeHeHe
 */

package Day4;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		
		for(int i=0; i<s.length(); i++)
		{
			System.out.print(s.charAt(0) +""+ s.charAt(1));
		} 

	}

}
