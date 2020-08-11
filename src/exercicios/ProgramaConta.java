package exercicios;

public class ProgramaConta {

	public static void main(String[] args) {
		Conta c= new Conta(123, "Caio", 100.00);
		c.deposito(100.00);
		System.out.println(c);
	}

}
