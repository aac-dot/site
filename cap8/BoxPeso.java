public class BoxPeso extends Box
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

