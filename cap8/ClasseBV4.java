public abstract class ClasseBV4
{
	abstract void callme();
	public final void callMeToo()
	{
		System.out.println( "Sou o callMeToo!" );
	}
}

class ClasseAV4 extends ClasseBV4
{
	void callme()
	{
		System.out.println( "Implementação de callme em b." );
	}
}

class AbstractDemo
{
	public static void main( String args[] )
	{
		ClasseAV4 b = new ClasseAV4();
		b.callme();

		ClasseBV4 a = b;

		a.callMeToo();
	}
}
