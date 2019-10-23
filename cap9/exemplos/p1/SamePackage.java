package p1;

class SamePackage
{
	SamePackage()
	{
		Protection p = new Protection();
		System.out.println( "SamePackage construtor" );
		System.out.println( "n = " + p.n );

		System.out.println( "n_protegido = " + p.n_protegido );
		System.out.println( "n_publico = " + p.n_publico );
	}
}
