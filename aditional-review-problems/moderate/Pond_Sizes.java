
import java.util.*;

class Pond_Sizes
{
	public static int findAllDirection(int mat[][],int row, int col)
	{
		if(row<0||col<0||row>=mat.length||col>=mat[0].length||mat[row][col] != 1)
		{
			return 0;
		}
		
		int size=1;
		mat[row][col]=0;
		for(int i=-1;i<=1;i++)
		{	//System.out.println("pond areas are outer:");
			for(int j=-1;j<=1;j++)
			{
				       
						
				size +=findAllDirection(mat,row+i,col+j);
					
			}
		}
		return size;			
	}


	public static void main(String a[])
	{
	
		int currentAr=0;int finalSum=0;
		int [][]mat=  { {1,0,0,1}, 
				{1,0,1,0},
		                {0,0,1,0},
		        	{1,0,1,0}};
		System.out.println("pond areas are :");
		for( int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(mat[i][j] == 1)
				{	//System.out.println(i+"\t"+j);
					currentAr=findAllDirection(mat,i,j);
					System.out.println(currentAr);
					if(finalSum < currentAr)
					{
						finalSum=currentAr;
					}
				}
			}
		}			
		System.out.println("Largest pond area ="+finalSum);			
		
	
	}
}
