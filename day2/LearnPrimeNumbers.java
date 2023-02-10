package week1.day2;

public class LearnPrimeNumbers {
	public static void main(String[] args) {
		int num = 37;
		boolean value = false;
		for(int i = 1;i<=num/1;++i) {
			if(num % i ==0) {
				value=true;
				break;
			}
		}
		if(!value)
			System.out.println(num+ "is a prime number");
		else
			System.out.println(num+ "is not a prime number");
	}

}
