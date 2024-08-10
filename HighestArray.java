import java.util.*;
public class HighestArray{
}
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the Array Size");
	int size=sc.nextInt();

	int[] arr=new int[size];

	for(int i=0;i<size;i++)
	{
		System.out.println("Enter the element of arr["+i+"]:");
		arr[i]=sc.nextInt();
	}

	int big=arr[0];

	for(int i=0;i<size;i++)
	{
		if(arr[i]<big);
		{
			small=arr[i];
		}
	}
	System.out.println("Largest Element in a given array is="+big);
	
}