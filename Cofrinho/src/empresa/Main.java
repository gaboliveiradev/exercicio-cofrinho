package empresa;

public class Main {

	public static void main(String[] args) {
		Cofrinho c = new Cofrinho();
		
		c.add(new Moeda("Euro", 0.5));
		c.add(new Moeda("Euro", 1));
		c.add(new Moeda("Euro", 0.25));
		c.add(new Moeda("Euro", 0.1));
		c.add(new Moeda("Euro", 0.05));
		c.add(new Moeda("Euro", 0.01));
		c.add(new Moeda("Euro", 0.01));
		c.add(new Moeda("Euro", 1));
		
		System.out.printf("Total do Cofrinho: R$ %.2f", c.calcularTotal());
	}

}
