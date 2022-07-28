
/*
 * 6) Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi"

 */

package Day4;

public class P4 {

	public static void main(String[] args) 
	{
		String s ="Encyclopidia";
		String s1 = "Hello";
		
		if(s.length()<s1.length())
		{
			System.out.println(s + s1 + s);
		}
		else if(s.length()>s1.length())
		{
			System.out.println(s1 + s + s1);
		}

	}

}
