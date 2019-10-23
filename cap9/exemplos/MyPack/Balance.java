package MyPack;

class Balance
{
	String name;
	double bal;

	public Balance( String n, double b )
	{
		name = n;
		bal = b;
	}

	public void show()
	{
		if ( bal < 0 )
			System.out.println( "0" );
		else
		{
			System.out.println( "Nome: " + name + "\nBalance: " + bal );
		}
	}
}
