package animais;

public class passaro extends animal {
	
	static int numeroPassaros;
	
	
	public passaro(String nome, String cor, double peso) {
		super(nome, cor, peso);
	
		numeroPassaros++;
	}


	@Override
	public String toString() {
		return "passaro [nome=" + nome + "]";
	}

	@Override
	public void soar() {
		System.out.println("PIU PIU");
	}
	
}
