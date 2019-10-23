class Cliente implements Callback
{
	public void callback( int p )
	{
		System.out.println( "callback de cliente chamado com " + p );
	}

	void nonIfaceMeth()
	{
		System.out.println( "Classes que implemeta interfaces " + "podem definir outros membros, também." );
	}
}

class Cliente2 implements Callback
{
	public void callback( int p )
	{
		System.out.println( "callback de Cliente2 chamado com " + p );
	}
}

class TesteCliente
{
	public static void main( String args[] )
	{
		Callback c = new Cliente();
		Cliente2 c2 = new Cliente2();

		c.callback( 5 );

		c = c2;

		c.callback( 8 );
	}
}

interface Callback
{
	void callback( int param );
}

