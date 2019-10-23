/*
	Arquivo BoxDemo.java
*/

class Box
{
	double altura;
	double largura;
	double profundidade;

	Box()
	{
		/*
			valores padrão
		*/
		altura = 10;
		largura = 10;
		profundidade = 10;
	}

	double calcularVolume()
	{
		return ( altura * largura * profundidade );
	}
}

class BoxDemo
{
	public static void main( String args[] )
	{
		Box minhaCaixa = new Box();
		Box minhaCaixa2 = new Box();

		double vol;

		vol = minhaCaixa.calcularVolume();
		
		System.out.println( "Volume é: " + vol );

		vol = minhaCaixa2.calcularVolume();
		System.out.println( "Volume é: " + vol );
	}
}
