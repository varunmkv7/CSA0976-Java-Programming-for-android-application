import java.io.*;
import java.util.*;
class Strch
{
	public static void main(String arg[])
	{
		String s;
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string :");
		s=sc.nextLine();
		System.out.print("Enter the character to be searched :");
		c=sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				System.out.print("The Index of "+c+" is "+i);
				break;
			}
		}
	}
}