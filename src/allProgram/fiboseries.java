package allProgram;

public class fiboseries {
	public static void main(String[] args) {
		int n = 10;
		int firstNumber = 0;
		int SecondNumber = 1;
		int NextNumber;

		for (int i = 1; i <= n; i++) {
			System.out.print(firstNumber+ ",");

			NextNumber = firstNumber + SecondNumber;
			firstNumber = SecondNumber;
			SecondNumber = NextNumber;
			
		}
	}

}
