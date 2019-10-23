class TestFixedStack
{
	public static void main( String args[] )
	{
		FixedStack stk1 = new FixedStack( 20 );
		FixedStack stk2 = new FixedStack( 10 );

		for ( int i = 0; i < 20; i++ )
			stk1.push( i );
		for ( int i = 0; i < 10; i++ )
			stk2.push( i );
	
		System.out.println( "Elementos da pilha1:" );
		for ( int i = 0; i < 20; i++ )
			System.out.println( "Elemento " + i + ": " + stk1.pop() ); 

		System.out.println( "Elementos da pilha2:" );
		for ( int i = 0; i < 10; i++ )
			System.out.println( "Elemento " + i + ": " + stk2.pop() ); 
		
	}
}
