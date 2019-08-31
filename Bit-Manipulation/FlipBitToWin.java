
public class FlipBitToWin 
{
	public static void main(String arg[])
	{
		int a =1775;int i=0;int k=0;
		int consecutiveOneCount=0;
		int ar[]=new int[10];int max=0;
		int noOfBits=(int)(Math.log(a) /  
                Math.log(2) + 1);
		while(i<noOfBits)
		{
			if(((a>>i)&1)==1)
			{ 
				consecutiveOneCount++;
			}
			else
			{
				
				ar[k++]=consecutiveOneCount;
				consecutiveOneCount=0;
			}
			i++;
		}
		for(int j=0;j<ar.length-1;j++)
		{
			max=(max>ar[j]+ar[j+1])?max:(ar[j]+ar[j+1]);
		}
		System.out.println("max="+(max+1));
		
		
	}
}
