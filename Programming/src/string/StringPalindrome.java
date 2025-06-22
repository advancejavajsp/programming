package string;

public class StringPalindrome {

public static void main(String[] args) {
		
		String s="hello";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			s1=c+s1;
		}
		

       if(s.equals(s1))
    	   System.out.println("palindrome");
       else
    	   System.out.println("not palindrome");
	}
}
