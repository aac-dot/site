package intpilha;

class TestVariableStack
{
	public static void main( String args[] )
	{
		VariableStack stk1 = new VariableStack( 10 );
		VariableStack stk2 = new VariableStack( 20 );

		for ( int i = 0; i < 20; i++ )
		{
			stk1.push( i );
		}

		for ( int i = 0; i < 40; i++ )
		{
			stk2.push( i );
		}

		System.out.println( "Valores da pilha1:" );
		for ( int i = 0; i < 20; i++ )
		{
			System.out.println( "Valor " + i + ": " + stk1.pop() );
		}

		System.out.println( "\nValores da pilha2:" );
		for ( int i = 0; i < 40; i++ )
		{
			System.out.println( "Valor " + i + ": " + stk2.pop() );
		}
		
	}
}
