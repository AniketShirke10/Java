import java.util.Scanner;
class SwitchDemo
{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first Number : ");
	int num = sc.nextInt();

	String letter;
	switch(num)
	{
	    case 1:
		letter="One";
		break;
	    case 2:
		letter="Two";
		break;
	    case 3:
		letter="Three";
		break;
	    case 4:
		letter="Four";
		break;
	    case 5:
		letter="Five";
		break;
	    case 6:
		letter="Sex";
		break;
	    case 7:
		letter="Seven";
		break;
	    case 8:
		letter="Eight";
		break;
	    case 9:
		letter="Nine";
		break;
	    case 10:
		letter="Ten";
		break;
	    default:
		letter="Invalid Input";
		break;
	}
	System.out.println(letter);
    }	
}