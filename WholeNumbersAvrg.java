import java.util.Scanner;
public class WholeNumbersAvrg {
	public static void main(String [] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Please enter one whole number.");
		int WholeNum1 = Scan.nextInt();
		System.out.println("Please enter another whole number.");
		int WholeNum2 = Scan.nextInt();
		System.out.println("Please enter one more whole number.");
		int WholeNum3 = Scan.nextInt();
		int SumOfNum = WholeNum1 + WholeNum2 + WholeNum3;
		int AverageOfNum = SumOfNum/3;
		System.out.println("The average of these three numbers is " + AverageOfNum + ".");
		
	}
}
# ExtraCredit
