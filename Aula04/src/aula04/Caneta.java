package aula04;

public class Caneta {
	
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta(String modelo, float ponta, boolean tampada, String cor) {
		super(); //construtor
		this.modelo = modelo;
		this.ponta = ponta;
		this.tampada = tampada;
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	


}
