class CommandLine
{
	static void vaTest( String msg, int ... v )
	{
		System.out.print( msg + v.length + 
				" Conteudo: " );
	
		for ( int x : v )
			System.out.print( x + " " );

		System.out.println();
		
	}

	public static void main( String args[] )
	{
		vaTest( "One vararg", 10 );
		vaTest( "Três varargs", 1, 2, 3 );
		vaTest( "Sem vararg" );
	}
}
