package contaBanco;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBanco c1 = new ContaBanco();
		
		c1.abrirConta("cp");
		c1.depositar(100.90f);
		c1.status();
	}

}
