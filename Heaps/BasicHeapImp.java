import java.util.*;

class BasicHeapImp
{
	static int[] heap;
	static int heapSize;
	BasicHeapImp(int sz)
	{
		heap=new int[sz+1];
	}
	static int parent(int i)
	{
		return (i/2);

	}
	static int left(int i)
	{	
		return (2*i);
	}
	static int right(int i)
	{	
		return  (2*i+1);
	}
	static void swap(int a[], int i, int k)
	{
		int temp=a[i];
		a[i]=a[k];
		a[k]=temp;
	}
	static void maxHeapify(int a[],int i)
	{
		int l=left(i);
		int r=right(i);
		int largest=0;
		
		if (l<heapSize && a[i] < a[l])
			largest=l;
		else
			largest=i;
		if (r<heapSize && a[largest] < a[r])
			largest=r;
		if(largest != i)
		{
			swap(a,i,largest);
			maxHeapify(a,largest);
		}
	}
	static void buildMaxHeap(int a[])
	{	
		heapSize=a.length;
		int i=((a.length-1)/2);
		while( i>=1 )
		{	
			maxHeapify(a,i);
			i--;
		}
			
	}
	
	static void printHeap(int heap[])
	{
		for(int i=1;i<=heap.length-1;i++)
		{
			System.out.println(heap[i]);	
		}
	
	}
	public static void heapSort()
	{
		buildMaxHeap(heap);
		for(int i=heap.length-1;i>=2;i--)
		{
			swap(heap,i,1);
			heapSize-=1;
			maxHeapify(heap,1);
		}
		
	}
	public static void main(String args[])
	{       
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n =sc.nextInt();
		new BasicHeapImp(n);
		
		System.out.println("enter the values");
		heap[0]=0;
		//int arrr[]={4,1,3,2,16,9,10,14,8,7,0,0};
		//System.out.println(arrr.length);
		for(int k=1;k<=n;k++)
		{
			heap[k]=sc.nextInt();	
		}
		System.out.println("arrays values");
		printHeap(heap);
		buildMaxHeap(heap);
		System.out.println("heaped arrays values");
		printHeap(heap);
		heapSort();
		System.out.println("heapsorted arrays values");
		printHeap(heap);
		
		
	}
}

