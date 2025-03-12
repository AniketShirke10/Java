import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
	System.out.println("Enter a number : ");
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	if(n1%2 == 0)
	{
	    System.out.println("n1 is even");
	}
	else
	{
	    System.out.println("n1 is odd");
	}
    }
}