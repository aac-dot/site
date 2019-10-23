class Stack
{
	int stack[] = new int[ 10 ];
	int tos;

	// inicializa a pilha
	Stack()
	{
		tos = -1;
	}

	// coloca o item na pilha
	void push( int item )
	{
		if ( tos == 9 )
			System.out.println( "Pilha cheia" );
		else
			stack[ ++tos ] = item;
	}

	// retira e retorna um item da pilha
	int pop()
	{
		if ( tos < 0 )
		{
			System.out.println( "Pilha vazia." );
			return 0;
		}
		else
			return stack[ tos-- ];
	}
}
