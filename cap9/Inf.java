interface Alpha
{
	default void teste1()
	{
		System.out.println( "Alpha default method" );
	}
}

interface Beta extends Alpha
{
	default void teste1()
	{
		System.out.println( "Beta default method" );
	}
}

public class Inf implements Alpha,Beta
{
	void exibir()
	{
		System.out.println( "Metodo class Inf" );
	}
}
class TesteInf
{
	public static void main( String args[] )
	{
		Inf inf = new Inf();

		inf.exibir();
	}
}
