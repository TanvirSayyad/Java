package reverseNumberString;

public class ReverseString {
	public static void main(String[] args) {
		String rev = " ";
		String str = "Tanvir";
		char a[] = str.toCharArray();
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("reverse String= " + rev);

	}
//reverse String=  rivnaT
}
