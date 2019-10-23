public class Outer
{
	private int outer_x = 100;

	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}

	class Inner
	{
		int inner_x;
		void display()
		{
			System.out.println( "Mostrar: outer_x = " + outer_x );
			System.out.println( "Mostrar: outer_x = " + inner_x );
		}
	}
}

class InnerClassDemo
{
	public static void main( String args[] )
	{
		Outer outer = new Outer();
		outer.test();
		outer.test();
	}
}
