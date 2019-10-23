public class ClasseAV3
{
	private int i;
	private int j;

	ClasseAV3( int i, int j )
	{
		this.i = i;
		this.j = j;
	}

	public void show()
	{
		System.out.println( "i e j: " + i + ", " + j );
	}
}

class ClasseBV3 extends ClasseAV3
{
	private int k;

	ClasseBV3( int i, int j, int k )
	{
		super( i, j );
		this.k = k;
	}

	public void show()
	{
		super.show();
		System.out.println( "k: " + k );
	}
}

class testeClasseAV3
{
	public static void main( String args[] )
	{
		ClasseBV3 b = new ClasseBV3( 1, 2, 3 );

		b.show();
	}
}
