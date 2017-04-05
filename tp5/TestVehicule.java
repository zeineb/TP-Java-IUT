package edu.iut.tp5;

public class TestVehicule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule v = new Vehicule();
		try{
		v.testVitesse(100);
		v.testVitesse(10);
		}
		catch(TropViteException e)
		{
		//System.out.println (e.printStackTrace());
		}

	}

}
