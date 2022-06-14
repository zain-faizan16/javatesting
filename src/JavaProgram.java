import java.util.Scanner;

public class JavaProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Long a = scan.nextLong();
		Long b = scan.nextLong();
		a += b;
		System.out.print(a);
		
	}

}
