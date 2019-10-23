public class Pilha
{
	private int pilha[];
	private int topoPilha;

	Pilha( int tamanho )
	{
		pilha = new int[ tamanho ];
		topoPilha = -1;
	}

	// adiciona um novo valor na pilha
	public void push( int novoValor )
	{
		// verifica se a pilha tem espaço disponível
		if ( topoPilha == pilha.length - 1 )
		{
			System.out.println( "Pilha cheia!" );
			return;
		}
		
		// primeiro incrementa o topo da pilha, depois atribui.
		pilha[ ++topoPilha ] = novoValor;				
	}

	// retira o valor atual que está no topo e retorna um novo valor do topo da lista
	public int pop()
	{
		// verifica se a pilha tem conteúdo
		if ( topoPilha < 0 )
		{
			System.out.println( "Pilha vazia!" );
			return 0;
		}

		// primeiro retorna, depois decrementa.
		return pilha[ topoPilha-- ];
	}
}

class TestePilha
{
	public static void main( String args[] )
	{
		Pilha p1 = new Pilha( 5 );
		Pilha p2 = new Pilha( 8 );
		int i;

		for ( i = 0; i < 5; i++ )
		{
			p1.push( i );
		}

		for ( i = 0; i < 8; i++ )
		{
			p2.push( i );
		}
	
		System.out.println( "Valor da pilha1:" );
		for ( i = 0; i < 5; i++ )
			System.out.println( p1.pop() );	
		System.out.println();

		System.out.println( "Valor da pilha2:" );
		for ( i = 0; i < 8; i++ )
			System.out.println( p2.pop() );
		

	}
}


