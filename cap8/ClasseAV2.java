public class ClasseAV2
{
	private int i;

	public void setI( int i )
	{
		this.i = i;
	}

	public int getI()
	{
		return i;
	}
}

class ClasseB extends ClasseAV2
{
	int i;

	ClasseB( int a, int b )
	{
		setI( a );
		// super.setI( b );
		super.i = b;
	}

	public void setI( int i )
	{
		this.i = i;
	}

	public void show()
	{
		System.out.println( "i da classeA: " + super.getI() + "\n" + "i da classeB: " + i + "\n" );
	}
}

class testeSuperMetodos
{
	public static void main( String args[] )
	{
		ClasseB b = new ClasseB( 2, 3 );

		b.show();
	}
}
