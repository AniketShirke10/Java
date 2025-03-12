import java.util.Scanner;
class PrimeNumber
{
	System.out.println("Enter a number :");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	for(int i=2; i<number/2; i++)
	{
	    if(number%i == 0){
	        System.out.println("Given Number is not a prime number");
	    }
	    else{
		System.out.println("Given number is a prime number");	
	    }
	}
}