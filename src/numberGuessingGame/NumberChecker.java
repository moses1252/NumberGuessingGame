package numberGuessingGame;

public class NumberChecker {
	
	private int correctNum;
	private int userNum;
	
	public NumberChecker() {
		
	}

	public NumberChecker(int correctNum, int userNum) {
		this.correctNum = correctNum;
		this.userNum = userNum;
	}

	public int getCorrectNum() {
		return correctNum;
	}

	public void setCorrectNum(int correctNum) {
		this.correctNum = correctNum;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	
	
	public boolean check() {
		if (userNum == correctNum) return true;
		return false;
	}
	
	public void lowHigh() {
		if (userNum > correctNum) {
			System.out.println("You guessed too high!");
		} else {
			System.out.println("You guessed too low!");
		}
	}
	

}
