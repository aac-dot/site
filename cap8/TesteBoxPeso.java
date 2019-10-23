public class TesteBoxPeso
{
	public static void main( String args[] )
	{
		BoxPeso minhaBox1 = new BoxPeso( 10, 20, 15, 34.3 );
		BoxPeso minhaBox2 = new BoxPeso( 2, 3, 4, 0.076 );
		BoxPeso minhaBox3 = new BoxPeso(); // padrão
		Box minhaBox4 = new Box( -10, 5, 15 );
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

		volume = minhaBox4.calcularVolume();
		System.out.println( "Volume de minhaBox4: " + volume );
		// System.out.println( "Peso de minhaBox4: " + minhaBox4.getPeso() );
		System.out.println();
	}
}
