public abstract class Figura
{
	protected double dim1;
	protected double dim2;

	Figura( double dim1, double dim2 )
	{
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public abstract double calcularArea();
}

class Retangulo extends Figura
{
	Retangulo( double largura, double altura )
	{
		super( largura, altura );
	}

	public double calcularArea()
	{
		System.out.println( "Dentro da classe Retangulo" );
		return dim1 * dim2;
	}
}

class Triangulo extends Figura
{
	Triangulo( double base, double altura )
	{
		super( base, altura );
	}

	public double calcularArea()
	{
		System.out.println( "Dentro da classe Triangulo" );
		return ( dim1 * dim2 ) / 2;
	}
}

class EncontrarArea
{
	public static void main( String args[] )
	{
		// Figura f = new Figura( 10, 10 );
		Retangulo r = new Retangulo( 9, 5 );
		Triangulo t = new Triangulo( 10, 8 );

		Figura refFig;

		refFig = r;
		System.out.println( "Área de " + refFig.calcularArea() );

		refFig = t;
		System.out.println( "Área de " + refFig.calcularArea() );
	
		/*refFig = f;
		System.out.println( "Área de " + refFig.calcularArea() );*/
	}
}
