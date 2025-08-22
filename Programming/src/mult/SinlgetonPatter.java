package mult;

public class SinlgetonPatter {
	public static void main(String[] args) {
      X x1=X.createObject();
      System.out.println(x1);
      X x2=X.createObject();
      System.out.println(x2);
	}
}

class X {
	static X x;
  private X() {}

public static X createObject() {
	if(x==null) {
		x=new X();
		return x;
	}
	return x;
}
}