package p1

class Derivada extends Protection
{
	Derivada()
	{
		System.out.println( "Construtor derivada" );
		System.out.println( "n = " + n );

		System.out.println( "n_protegida = " + n_protegido );
		System.out.println( "n_publico = " + n_publico );
	}
}
