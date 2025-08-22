package ds;

import java.util.Stack;

public class ReverseLinkedListUsingRecurssion {
	
	
	public static void insertBottom(Stack<Integer> s,int n) {
		if(s.empty()) {
			s.push(n);
			return;
		}
			
		
		int top=s.pop();
		insertBottom(s, n);
		s.push(top);
		
	}
	
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		
		int top=s.pop();
		reverse(s);
		insertBottom(s, top);
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		
		System.out.println(s);
		reverse(s);
		System.out.println(s);
	}

}
