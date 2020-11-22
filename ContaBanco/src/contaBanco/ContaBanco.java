package contaBanco;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public void abrirConta() {
		this.status = true;
	}

	public void fecharConta() {
		if (this.status == true) {
			this.status = false;
		} else {
			System.out.println("Sua conta já não se encontra aberta");
		}
	}

	public void depositar(double depositar) {
		this.saldo = saldo + depositar;
	}

	public void sacar(double sacar) {
		if (this.saldo <= 0) {
			System.out.println("Não é possível sacar com saldo menor que zero");
		} else {
			this.saldo = saldo - sacar;
		}
	}

	public void fecharConta(double sacar) {
		if (this.status == true) {
			this.status = false;
			System.out.println("Conta fechada com sucesso");
		} else {
			System.out.println("Sua conta já está fechada");
		}

	}
	public void pagarMensalidade(double mensalidade) {
		if (this.saldo <= 0) {
			System.out.println("Saldo insuficiente para pagar a mensalidade");
		}
		this.saldo = saldo - mensalidade;
	}

	// getters e setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// contrutores
	public ContaBanco(int numConta, String tipo, String dono, double saldo, boolean status) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;
	}

}
