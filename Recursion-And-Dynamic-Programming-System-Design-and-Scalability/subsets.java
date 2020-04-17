import java.util.*;
import java.io.*;
class subsets
{
	public static void generateSubsets(String comp, String part,int i) 
	{
		if (i < comp.length())
		{	
			char ch=comp.charAt(i);
			String part1=part;
			System.out.print(part1);
			System.out.println(ch);
			part1=part1+ch;
			generateSubsets(comp,part1,i+1);
			
			System.out.println(part);
			generateSubsets(comp,part,i+1);
		}
	
	}
	public static void main(String a[])
	{
		generateSubsets("abc"," ",0);
	}
}
	
