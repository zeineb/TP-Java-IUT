package edu.iut.tp5;

public class TropViteException extends Exception {
	public TropViteException(int vitesse)
	{
	System.out.println("Vous avez depassé la vitesse autorisée, vous roulez a " + vitesse);
	}

	}