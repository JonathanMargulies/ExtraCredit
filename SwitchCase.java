import java.util.Scanner;
public class SwitchCase {
	public static void main(String [] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Please enter which role you are: Administrator, Faculty, Staff, Student, Guest.");
		String UserRole = Scan.next();
			switch(UserRole.toLowerCase()) {
				case "administrator":
					System.out.println("Welcome Administrator!");
					break;
				case "faculty":
					System.out.println("Weclome Faculty!");
					break;
				case "staff":
					System.out.println("Welcome Staff!");
					break;
				case "student":
					System.out.println("Welcome Student!");
					break;
				case "guest":
					System.out.println("Welcome Guest!");
					break;
				default:
					System.out.println("Invalid Role!");
					break;
		}
	}
}
