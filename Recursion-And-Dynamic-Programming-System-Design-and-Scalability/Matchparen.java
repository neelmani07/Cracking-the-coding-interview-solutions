import java.util.*;
class Matchparen
{
	public static void recurse(String str,int n, int a, int b)
	{
		if(a==n && b==n)
			System.out.println(str);
		
		if(a<n)
			recurse(str+"(",n,a+1,b);
		if(b<a)				
			recurse(str+")",n,a,b+1);
			
	
	}
	public static void main(String a[])
	{
		String str="";
		recurse(str,3,0,0);
	}
}
