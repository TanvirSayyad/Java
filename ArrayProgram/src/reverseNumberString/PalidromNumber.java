package reverseNumberString;

public class PalidromNumber {
	public static void main(String[] args) {
		int num = 2112;
		int rev = 0;
		int originalNumber = num;
		while (num != 0) {

			int last = num % 10; // last number 2
			rev = rev * 10 + last;

			num = num / 10;

		}

		if (rev == originalNumber) {
			System.out.println("palidrome");

		} else {
			System.out.println("non palidrome");
		}
	}

}
