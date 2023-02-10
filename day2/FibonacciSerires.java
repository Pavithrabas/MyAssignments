package week1.day2;

public class FibonacciSerires {
	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int nextNum;
		System.out.println(firstNum+"," +secondNum+",");
		for(int i=1;i<12;i++) {
			nextNum=firstNum+secondNum;
			System.out.println(nextNum+",");
			firstNum=secondNum;
			secondNum=nextNum;
		}
	}

}
