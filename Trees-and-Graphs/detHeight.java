import java.util.*;
import java.io.*;
class detHeight
{
	static class Node
	{
		int val;
		Node lchild;
		Node rchild;
		
		Node(int n)
		{
			val=n;
			lchild=null;
			rchild=null;
		}
	}
		
	public static int calDepth(Node root,int l)
	{
		if(root == null)
			return 0;
		else
		{
			
			System.out.println("l="+l);
			hmax=(hmax>l)?hmax:l;
			System.out.println("hmax="+hmax);
			calDepth(root.lchild,l+1);
			calDepth(root.rchild,l+1);
		}
		return hmax;		
	}
	
	public static int hmax=0;
	static Node root;
	public static void main(String a[])
	{	/*            10
			     /	\
			    8	20
			   /   /  \
			  5   15  21
			            \
			            25
	
	
		*/
		root=new Node(10);
		root.lchild=new Node(8);
		root.rchild=new Node(20);
		root.lchild.lchild=new Node(5);
		root.rchild.lchild=new Node(15);
		root.rchild.rchild=new Node(21);
		root.rchild.rchild.rchild=new Node(25);
		int k=calDepth(root,0);
		System.out.println("ht="+k);
	}
}
		
		
		
		
		
		
		
		
		
		
		
