public class ClassA
{
	int i, j;

	void showij()
	{
		System.out.println( "i and j: " + i + j );
	}
}

class ClassB extends ClassA
{
	int k;

	void showk()
	{
		System.out.println( "k: " + k );
	}

	void soma()
	{
		System.out.println( "i+j+k: " + (i+j+k) );
	}
}

public class HerancaSimple
{
	public static void main( String args[] )
	{
		ClassB subClasse = new ClassB();

		subClasse.i = 8;
		subClasse.j = 8;
		subClasse.k = 8;

		subClasse.soma();	
	}
}
