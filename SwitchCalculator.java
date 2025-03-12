import java.util.Scanner;
class SwitchCalculator{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first Number : ");
	int a = sc.nextInt();
	System.out.println("Enter Second NUmber : ");
	int b = sc.nextInt();
	
	System.out.println("Press 1 for Addition");
	System.out.println("Press 2 for Subtraction");
	System.out.println("Press 3 for Multiplication");
	System.out.println("Press 4 for Division");

	System.out.println("Which Operation You want to Perform : ");
	int n = sc.nextInt();
	
	switch(n)
	{
case 1:
    System.out.println("Addition of given two numbers is : ");
    System.out.println(a+b);
    break;
case 2:
    System.out.println("Subtraction of given two numbers is : ");
    System.out.println(a-b);
    break;
case 3:
    System.out.println("Multiplication of given two numbers is : ");
    System.out.println(a*b);
    break;
case 4:
    System.out.println("Division of given two numbers is : ");
    System.out.println(a/b);
    break;
default:
    System.out.println("Invalid Case");
    break;
	}
    }
}