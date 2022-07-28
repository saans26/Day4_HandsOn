
/*7) Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.

If the input is "xHix", then output is "Hi".

If the input is "America", then the output is "America"*/



package Day4;

public class P5 {

	public static void main(String[] args) 
	{
		String s = new String("XSANSX");
		String s1 = "";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='X')
			{
				if(i==0 || i==(s.length()-1))
				{	
					s1 = s1 + " ";
					//System.out.print("_");
				}
			}
			else
			{
				s1=s1+s.charAt(i);
				//System.out.print(s1 + "\t");
			}
		}
		System.out.println(s1);
		
		
	}

}
