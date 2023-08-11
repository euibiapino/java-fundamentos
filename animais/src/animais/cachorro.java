package animais;

public class cachorro extends animal {
	
	static int numeroCachorros;
	private int tamanhoRabo;
	
	
	
	//construtor por demanda
	public cachorro(String nome, String cor, int altura, double peso, int tamanhoRabo, String estadoEspirito) {
		super(nome,cor,peso);
		this.nome = nome;
		this.cor = cor;
		this.altura = altura;
		this.peso = peso;
		this.tamanhoRabo = tamanhoRabo;
		this.estadoEspirito = estadoEspirito;
		
		numeroCachorros++;
	}
	
	
	
	//metodos
	public String getNome() {
		return this.nome;
	}
	
	public static int getNumeroCachorros() {
		return numeroCachorros;
	}

	public static void setNumeroCachorros(int numeroCachorros) {
		cachorro.numeroCachorros = numeroCachorros;
	}

	public String getEstadoEspirito() {
		return estadoEspirito;
	}

	public void setEstadoEspirito(String estadoEspirito) {
		this.estadoEspirito = estadoEspirito;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTamanhoRabo() {
		return tamanhoRabo;
	}

	public void setTamanhoRabo(int tamanhoRabo) {
		this.tamanhoRabo = tamanhoRabo;
	}

	

	
	public String pegar() {
		return "Bolinha";
	}
	
	public String interagir(String acao) {
		
		switch (acao) {
		case "carinho": this.estadoEspirito = "feliz"; break;
		case "vai dormir": this.estadoEspirito = "bravo"; break;
		case "pisar na patinha": this.estadoEspirito = "triste"; break;
		default: this.estadoEspirito = "neutro"; break;
		
		}
		return this.estadoEspirito;
	}

	@Override
	public String toString() {
		return "cachorro [nome=" + nome + "]";
	}
	
	@Override
	public void soar() {
		System.out.println("AU AU");
	}
	
}


