package p2

class Protection2 extends p1.Protection
{
	Protection()
	{
		System.out.println( "Construtor derivado de outro pacote" );
		System.out.println( "n_protegido = " + n_protegido );
		System.out.println( "n_publico = " + n_publico );
	}
}
