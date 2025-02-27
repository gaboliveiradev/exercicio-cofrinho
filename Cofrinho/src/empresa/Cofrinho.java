package empresa;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	
	public void add(Moeda m)
	{
		moedas.add(m);
	}
	
	double calcularTotal()
	{
		double total = 0;
		
		for(Moeda m : moedas) 
		{
			total += m.getValor();
		}
		
		return total;
	}
}
