class TestarRecursao
{
	int valores[];

	TestarRecursao( int i )
	{
		valores = new int[ i ];
	}

	// mostrar os elementos do vetor valores recursivamente
	void exibirVetor( int i )
	{
		if ( i == 0 )
			return;
		else
			exibirVetor( i - 1 );
	
		System.out.println( "[ " + (i-1) + " ]" + valores[ i - 1 ] );
	}
}

class TestarRecursaoTeste
{
	public static void main( String args[] )
	{
		TestarRecursao teste = new TestarRecursao( 10 );
		int i;

		for ( i = 0; i < 10; i++ )
			teste.valores[ i ] = i;

		teste.exibirVetor( 10 );
	}
}
