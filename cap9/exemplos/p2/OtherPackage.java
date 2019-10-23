package p2;

class OtherPackage
{
	OtherPackage()
	{
		p1.Protection p = new p1.Proctection();
		System.out.println( "Construtor OtherPackage" );

		System.out.println( "n_publico = " + p.n_publico );
	}
}
