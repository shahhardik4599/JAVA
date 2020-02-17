import java.util.*;
class Array1
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		System.out.println("enter 10 numbers:");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		Display d=new Display();
		d.reverse(a);
	}
}
class Display
{	
	int temp,n=9;	
	void reverse(int a[])
	{
		System.out.println("Reverse array:");
		for(int i=0;i<5;i++)	
		{
			temp=a[i];
			a[i]=a[n];
			a[n]=temp;
			n=n-1;
		}
	
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}
}
