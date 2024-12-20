package Single_level_inheritance;

public class Sub extends Base{
	public void subtract()
	{
		int h= a-b;
		System.out.println("Difference between the numbers= "+h);
	}

	public static void main(String[] args) {
		Sub o1= new Sub();
		o1.add(14,6);
		o1.subtract();
		
		// TODO Auto-generated method stub

	}

}
