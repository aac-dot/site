package p1;

public class Protection
{
	int n = 1;
	private int n_privado = 2;
	protected int n_protegido = 3;
	public int n_publico = 4;

	public Protection()
	{
		System.out.println( "Construtor base" );
		System.out.println( "n = " + n );
		System.out.println( "n_privado = " + n_privado );
		System.out.println( "n_protegido = " + n_protegido );
		System.out.println( "n_publico = " + n_publico );
	}
}
