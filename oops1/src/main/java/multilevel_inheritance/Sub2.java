package multilevel_inheritance;

public class Sub2 extends Sub1{
	String e;
	public void detail3(String f)
	{
		e=f;
		System.out.println("Department: "+f);
	}

	public static void main(String[] args) {
		Sub2 o1= new Sub2();
		o1.detail1("SHINY LESLIE");
		o1.detail2("shinyleslie91@gmail.com");
		o1.detail3("QA");
		// TODO Auto-generated method stub

	}

}
