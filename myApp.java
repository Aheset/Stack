import java.util.Scanner;
import java.util.Stack;

public class myApp {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		int x = 0;
		int y = 0;
		int result = 0;
		int number;

		Scanner scan1 = new Scanner(System.in);
		System.out.println("please enter your string");
		String userInput = scan1.next();

		for (int i = 0; i < userInput.length(); i++) {
			Character c = userInput.charAt(i);
			// System.out.println(c);

			if(! (c.isDigit(c))) {
			x = s.pop();
			y = s.pop();
				
				switch (userInput.charAt(i)) {
				case '*':
					result = x * y;
					s.push(result);
					break;

				case '/':
					result = y/x;
					s.push(result);
					break;

				case '+':
					result = x + y;
					s.push(result);
					break;

				case '-':
					result = y -x;
					s.push(result);
					break;
				}
			}else{
				number = Character.getNumericValue(userInput.charAt(i));
				s.push(number);
			//System.out.println(number);
			}
		}
		System.out.println(result);
	}
	
}

