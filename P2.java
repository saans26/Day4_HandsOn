/*
 * 4) Write a java program that will return the first half of the string, if the length of the string is even.

It should return null for odd length string.

Example1)

i/p:TomCat

o/p:Tom

Example2)

i/p:Apron
 */


package Day4;

public class P2 {

	public static void main(String[] args) 
	{
		String s = "HelloTom";
		String s1 = "";
		if(s.length()%2==0)
		{
			int l = s.length()/2;
			for(int i=0;i<l;i++)
			{
				s1 = s1+s.charAt(i);
			}
			System.out.println(s1);
		}
		else
		{
			System.out.println("null");
		}
		

	}

}
