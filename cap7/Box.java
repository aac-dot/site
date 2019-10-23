/*
	Classe Box define construtores sobrecarregado
*/

class Box
{
	double largura;
	double altura;
	double profundidade;

	Box( Box ob )
	{
		largura = ob.largura;
		altura = ob.altura;
		profundidade = ob.profundidade;
	}

	// construtor para quando todas as dimensões são especificadas
	Box( double l, double a, double p )
	{
		largura = l;
		altura = a;
		profundidade = p;
	}

	// construtor usado quanto nenhuma dimensão é especificada	
	Box()
	{
		// -1 usado para indicar que a caixa não foi inicializada
		largura = -1;
		altura = -1;
		profundidade = -1;
	}

	// construtor para criar cubo
	Box( double tamanho )
	{
		largura = altura = profundidade = tamanho;
	}

	// calcula o volume da caixa
	double calcularVolume()
	{
		return largura * altura * profundidade;
	}
}

class ConstrutoresSobrecarregados
{
	public static void main( String args[] )
	{
		Box box1 = new Box( 10, 20, 15 );
		Box box2 = new Box();
		Box meuCubo = new Box( 7 );

		Box boxClone = new Box( box1 );
		
		double volume;

		volume = box1.calcularVolume();
		System.out.println( "Volume de box1: " + volume );

		volume = box2.calcularVolume();
		System.out.println( "Volume de box2: " + volume );

		volume = meuCubo.calcularVolume();
		System.out.println( "Volume de meuCubo: " + volume );

		volume = boxClone.calcularVolume();
		System.out.println( "Volume de boxClone: " + volume );
	}
}
