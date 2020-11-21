package aula02;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caneta c1 = new Caneta();
	
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar();
		
		c1.status();
		c1.rabiscar();
		
		pular();
		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.tampar();
		
		c2.status();
		c2.rabiscar();
	}
	public static void pular() {
		System.out.println();
	}

}
