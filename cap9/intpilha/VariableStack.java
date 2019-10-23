package intpilha;

class VariableStack implements IntStack
{
	private int stk[];
	private int topo;

	VariableStack( int tamanho )
	{
		stk = new int[ tamanho ];
		topo = -1;
	}

	public void push( int novoValor )
	{
		// se a pilha estiver cheia.
		if ( topo == stk.length - 1 )
		{
			int temp[] = new int[ topo * 2 ];
			
			for ( int i = 0; i < topo; i++ )
			{
				temp[ i ] = stk[ i ];
			}

			stk = temp;

			stk[ ++topo ] = novoValor;
		}
		else
			stk[ ++topo ] = novoValor;
	}

	public int pop()
	{
		if ( topo < 0 )
		{
			System.out.println( "Stack underflow" );
			return 0;
		}
	
		return stk[ topo-- ];
	}
}
