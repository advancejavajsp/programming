package string;

public class ReverseString {
	public static void main(String[] args) {
		
		String s="hello";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			s1=c+s1;
		}
		
		System.out.println(s1);
	}

}
