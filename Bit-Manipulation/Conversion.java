
public class Conversion
{
	static int max(int a,int b)
	{
		return (a>b)?a:b;
	}
	static void bitsRequired(int a,int b)
	{   
		int count=0;
		int noOfBitsA=(int)(Math.log(a) /  
                Math.log(2) + 1);
		int noOfBitsB=(int)(Math.log(a) /  
                Math.log(2) + 1);
		for(int i=0;i<max(noOfBitsA,noOfBitsB);i++)
		{
			
			if(((a>>i & 1) & (b>>i & 1))!=1)
			{
				count++;
			}
		}
		System.out.println("count="+count);
	}
	
	public static void main(String arg[])
	{
		bitsRequired(29,15);
	}
}
