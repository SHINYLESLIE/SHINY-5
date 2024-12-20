package Single_level_inheritance;

public class Base {
	int a;
	int b;
	public void add(int c, int d)
	{
		a=c;
		b=d;
		int e= c+d;
		System.out.println("Let the numbers be "+ a+ " and "+ b);
		System.out.println("Sum of the numbers= "+e);
	}

}
