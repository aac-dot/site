/*
	Arquivo BoxDemo.java
*/

class Box
{
	double altura;
	double largura;
	double profundidade;
}

class BoxDemo
{
	public static void main( String args[] )
	{
		Box minhaCaixa = new Box();
		double volume;

		minhaCaixa.altura = 20;
		minhaCaixa.largura = 10;
		minhaCaixa.profundidade = 15;

		volume = minhaCaixa.altura * minhaCaixa.largura * minhaCaixa.profundidade;

		System.out.println( "O volume é: " + volume );
	}
}
