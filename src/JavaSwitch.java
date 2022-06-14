import java.util.Scanner;

public class JavaSwitch {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		int noOfMonth = scanner.nextInt();
		switch(noOfMonth){		
		case 1:
			System.out.print("january");
			break;
		case 2:
			System.out.print("feb");
			break;
		case 3:
			System.out.print("march");
			break;
		case 4:
			System.out.print("april");
			break;
		case 5:
			System.out.print("may");
			break;
		case 6:
			System.out.print("june");
			break;
		case 7:
			System.out.print("july");
			break;
		case 8:
			System.out.print("august");
			break;
		case 9:
			System.out.print("september");
			break;
		case 10:
			System.out.print("oct");
			break;
		case 11:
			System.out.print("nov");
			break;
		case 12:
			System.out.print("dec");
			break;
		default:
			System.out.print("Wrong no of  month");

		}
	}

}
