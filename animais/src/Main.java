import animais.cachorro;
import animais.gato;
import animais.passaro;

public class Main {

	public static void main(String[] args) {
		
		cachorro cachorro1 = new cachorro("Puppy", "Marrom", 25, 5.5, 5, "nada");
		
		gato gato1 = new gato("Felix", "Laranjado", 3.4);

		passaro passaro1 = new passaro("Frajola", "Verde", 0.9);
		
		cachorro1.soar();
		gato1.soar();
		passaro1.soar();
		
}
}
