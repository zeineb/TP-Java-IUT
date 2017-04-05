package edu.iut.tp5;

public class Vehicule
{
	public Vehicule()
	{

	}

	public void testVitesse(int vitesse) throws TropViteException
	{
		if (vitesse > 90)
		{
			throw new TropViteException(vitesse);

		}
		else
		{
			System.out.println("Good !");
		}

	}
}