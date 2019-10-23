class TestStack
{
	public static void main( String[] args )
	{
		Stack pilha1 = new Stack();
		Stack pilha2 = new Stack();

		for ( int i = 0; i < 10; i++ )
			pilha1.push( i );
		
		for ( int i = 10; i < 20; i++ )
			pilha2.push( i );

		System.out.println( "Pilha1:" );
		for ( int i = 0; i < 10; i++ )
			System.out.println( pilha1.pop() );
		
		System.out.println( "Pilha2:" );
		for ( int i = 0; i < 10; i++ )
			System.out.println( pilha2.pop() );
		
		
	}
}
