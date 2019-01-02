package logicAndUtility;

public class PalindromeFinder {

	public static boolean checkIfTheSame(String middleOfPalindrome) {
		for (int i = 1; i < middleOfPalindrome.length(); i++) {
			if (middleOfPalindrome.charAt(i) != middleOfPalindrome.charAt(0)) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkIfPalindrome(String number) {
		if (number.charAt(0) == number.charAt(number.length() - 1)) {
			if(checkIfTheSame(number.substring(1, number.length() - 1))==true) {
				System.out.println(number);
				return true;
			}
		}
		return false;
	}

	static public void findPalidrome() {

		Palindrome currentBiggest = new Palindrome();
		int result = 0;

		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				result = i * j;
				if (checkIfPalindrome(Integer.toString(result))==true) {
					Palindrome newplnd = new Palindrome(result, Integer.toString(result));
					if(Palindrome.compareTwoPalindromes(newplnd, currentBiggest)) {
						currentBiggest.setConvertedNumber(Integer.toString(result));
						currentBiggest.setNumberForPalindrome(result);
						currentBiggest.setPalindromeID(newplnd.getPalindromeID());
					}
				}
			}
		}
		
		System.out.println("Final biggest palindrome found: "+currentBiggest.getConvertedNumber());
	}
}
