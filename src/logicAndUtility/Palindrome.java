package logicAndUtility;

public class Palindrome {
	
	public Palindrome() {
		this.numberForPalindrome = 0;
		this.convertedNumber = "";
	}
	
	public Palindrome(int nmb, String plnd) {
		this.numberForPalindrome = nmb;
		this.convertedNumber = plnd;
		this.palindromeID = numberForPalindrome;
		numberForPalindrome++;
	}
	
	public static boolean compareTwoPalindromes(Palindrome plnd1, Palindrome plnd2) {
		if(plnd1.getNumberForPalindrome()>=plnd2.getNumberForPalindrome()) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Palindrome [numberForPalindrome=" + numberForPalindrome + ", convertedNumber=" + convertedNumber
				+ ", palindromeID=" + palindromeID + "]";
	}

	public int numberForPalindrome;
	public String convertedNumber;
	public int palindromeID = 0;
	public int getPalindromeID() {
		return palindromeID;
	}

	public void setPalindromeID(int palindromeID) {
		this.palindromeID = palindromeID;
	}

	public static int counter = 0;

	public int getNumberForPalindrome() {
		return numberForPalindrome;
	}

	public void setNumberForPalindrome(int numberForPalindrome) {
		this.numberForPalindrome = numberForPalindrome;
	}

	public String getConvertedNumber() {
		return convertedNumber;
	}

	public void setConvertedNumber(String convertedNumber) {
		this.convertedNumber = convertedNumber;
	}
}
