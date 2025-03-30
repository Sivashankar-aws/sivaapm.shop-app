
public class ClassA {
	void addition() {
		int a = 10 ;
		int b = 20 ;
				System.out.println("Addition of two no : "+(a+b));
	}

	public static void main(String[] args) {
		System.out.println("Strt");
		ClassA aobj = new ClassA();
		aobj.addition();
		System.out.println("End");

}
