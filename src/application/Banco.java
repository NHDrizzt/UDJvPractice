package application;

public class Banco {
	private int numeroConta;
	private String titularConta;
	private double saldo;
	
	public Banco(int numeroConta, String titularConta,  double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldo = depositoInicial;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	public void adicionaSaldo(double value) {
		this.saldo += value;
	}
	public void removeSaldo(double value) {
		this.saldo -= value + 5;
	}
	
	public String toString() {
		return "Account "+
				getNumeroConta()+
				", "+
				"Holder: "+
				titularConta+
				", "+
				"Balance: $"+
				String.format("%.2f", getSaldo());
	}

}
