import java.util.Scanner;
class NamePrint
{
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Name : ");
	String first_name = sc.next();
	System.out.println("Enter second Name : ");
	String second_name = sc.next();
	System.out.println(first_name + " " + second_name);
    }
}