package animais;

public class gato extends animal {
	
	static int numeroGatos;
	
	public gato(String nome, String cor, double peso) {
		super(nome, cor, peso);
	}

	@Override
	public String toString() {
		return "gato [nome=" + nome + "]";
	}
	
	@Override
	public void soar() {
		System.out.println("MIAU MIAU");
	}
	
}
