import java.util.Scanner;
import java.util.Stack;

public class myApp {


	public static void main(String[] args) {
		
		Stack <Integer> s = new Stack<Integer>();
		
	/*	s.push(5);
		s.push(15);
		s.push(1);
		
		System.out.println(s.pop());
		
		//Dequeue takes elements out
		//Enqueueputs in
		 * 
		 * 
		 * 
		 * int x = s.pop();
		 * int y = s.pop();
		 * 
		 * 52*3+
		 * 63-1+
		 * 
		*/
		int x = 0;
		int y = 0;
		int result = 0;
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("please enter your string");
		String userInput = scan1.next();
	
		for (int i = 0; i < userInput.length(); i++) {
			  Character c = userInput.charAt(i);
			  //System.out.println(c);
			  
			  if (c.isDigit(c)){
				  int transcript = c.getNumericValue(c);
				  s.push(transcript);
			  }
			 
			  else {
				 
				  
//				  System.out.println(x);
//				  System.out.println(y);
//			  
			  
			  switch (c){
			  case '*':
				  x = s.pop();
				  y = s.pop();
				  result = x * y;
				  s.push(result);
				  System.out.println(s.pop());
				  break;
				  
			  case '/':
				  x = s.pop();
				  y = s.pop();
				  result = x / y;
				  s.push(result);
				  System.out.println(s.pop());
				  break;
				  
			  case '+':
				  x = s.pop();
				  y = s.pop();
				  result = x + y;
				  s.push(result);
				  System.out.println(s.pop());
				  break;
				  
			  case '-':
				  x = s.pop();
				  y = s.pop();
				  result = x - y;
				  s.push(result);
				  System.out.println(s.pop());
				  break;
				  
				  default: 
					  break;
			  }
			  
			 
			  }
			  }
		}
	}

			  

/*
String s = "...stuff...";

for (int i = 0; i < s.length(); i++){
    char c = s.charAt(i);        
    //Process char
}

*/