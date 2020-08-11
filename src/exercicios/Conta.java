package exercicios;

public class Conta {

	private int numero;

	private String nome;

	private Double saldo;

	public Conta(int numero, String nome, Double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public Conta(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}
	
	public void deposito(Double valor) {
		this.saldo += valor;
	}
	
	public void sacar(Double valor) {
		this.saldo -= valor + 5.0;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " Numero da Conta: " + numero + " Saldo: " + saldo;
	}
}
