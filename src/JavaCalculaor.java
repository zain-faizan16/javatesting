
import java.util.Scanner;

public class JavaCalculaor {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		
		Long a = scanner.nextLong();
		char operator = scanner.next().charAt(0);
		Long b = scanner.nextLong();
		if(operator == '+') {
			System.out.println(a+b);
		} else if (operator == '-') {
			System.out.println(a-b);
		} else if (operator == '*') {
			System.out.println(a*b);
		} else if (operator == '/') {
			System.out.println(a/b);
		} else if (operator == '%') {
			System.out.println(a % b);
		} else {
			System.out.println("not a right operator");
		}
	}

}