class FixedStack implements IntStack
{
	private int stk[];
	private int topoPilha;

	FixedStack( int tamanhoPilha )
	{
		stk = new int[ tamanhoPilha ];
		topoPilha = -1;
	}

	public void push( int item )
	{
		if ( topoPilha == stk.length - 1 )
		{
			System.out.println( "Stack overflow" );
		}
		else
		{
			stk[ ++topoPilha ] = item;
		}
	}

	public int pop()
	{
		if ( topoPilha < 0 )
		{
			System.out.println( "Stack underflow" );
			return 0;
		}
		else
		{
			return stk[ topoPilha-- ];
		}
	}
}
