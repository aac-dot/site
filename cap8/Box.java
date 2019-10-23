public class Box
{
	private double largura;
	private double altura;
	private double profundidade;

	// as variavéis poderão ter os mesmos valores de outro objeto, ou seja, uma cópia
	Box( Box ob )
	{
		setLargura( largura );
		setAltura( altura );
		setProfundidade( profundidade );
	}

	// inicializa um objeto Box com novos valores
	Box( double altura, double largura, double profundidade )
	{
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}
	
	// valores padrão, caso não seja passado nenhum
	Box()
	{
		// -1 = não inicializado.
		this.altura = -1;
		this.largura = -1;
		this.profundidade = -1;
	}

	// Para criar um cubo
	Box( double medida )
	{
		largura = altura = profundidade = medida;
	}
	
	public void setLargura( double largura )
	{
		if ( largura < 0 )
		{
			this.largura = 0.0;
		}
		else
		{
			this.largura = largura;
		}
	}

	public void setAltura( double altura )
	{
		if ( altura < 0 )
		{
			this.altura = 0.0;
		}
		else
		{
			this.altura = altura;
		}
	}

	public void setProfundidade( double profundidade )
	{
		if ( profundidade < 0 )
		{
			this.profundidade = 0.0;
		}
		else
		{
			this.profundidade = profundidade;
		}
	}

	public double getLargura()
	{
		return largura;
	}
	public double getAltura()
	{
		return altura;
	}
	public double getProfundidade()
	{
		return profundidade;
	}

	// calcula o volume e retorna o valor
	public double calcularVolume()
	{
		return largura * altura * profundidade;
	}
}
/**
class BoxPeso extends Box
{
	private double peso;

	BoxPeso( BoxPeso ob )
	{
		super( ob );
		this.peso = ob.peso;
	}
	BoxPeso( double altura, double largura, double profundidade, double peso )
	{
		super( altura, largura, profundidade );
		this.peso = peso;
	}
	BoxPeso()
	{
		super();
		peso = -1;
	}
	BoxPeso( double medida, double peso )
	{
		super( medida );
		this.peso = peso;
	}

	public double getPeso()
	{
		return peso;
	}
}
*/

/**
class TesteBoxPeso
{
	public static void main( String args[] )
	{
		BoxPeso minhaBox1 = new BoxPeso( 10, 20, 15, 34.3 );
		BoxPeso minhaBox2 = new BoxPeso( 2, 3, 4, 0.076 );
		BoxPeso minhaBox3 = new BoxPeso(); // padrão
		BoxPeso meuCube = new BoxPeso( 3, 2 );
		BoxPeso meuClone = new BoxPeso( minhaBox1 );
		double volume;

		volume = minhaBox1.calcularVolume();
		System.out.println( "Volume de minhaBox1: " + volume );
		System.out.println( "Peso de minhaBox1: " + minhaBox1.getPeso() );
		System.out.println();

		volume = minhaBox2.calcularVolume();
		System.out.println( "Volume de minhaBox2: " + volume );
		System.out.println( "Peso de minhaBox2: " + minhaBox2.getPeso() );
		System.out.println();

		volume = minhaBox3.calcularVolume();
		System.out.println( "Volume de minhaBox3: " + volume );
		System.out.println( "Peso de minhaBox3: " + minhaBox3.getPeso() );
		System.out.println();

		volume = meuClone.calcularVolume();
		System.out.println( "Volume de meuClone: " + volume );
		System.out.println( "Peso de meuClone: " + meuClone.getPeso() );
		System.out.println();

		volume = meuCube.calcularVolume();
		System.out.println( "Volume de meuCube: " + volume );
		System.out.println( "Peso de meuCube: " + meuCube.getPeso() );
		System.out.println();
	}
}*/
