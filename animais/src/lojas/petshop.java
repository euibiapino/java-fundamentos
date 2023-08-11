package lojas;
import animais.animal;

public class petshop {
	
	public void darBanho(animal animal) {
		animal.setEstadoEspirito("Limpo");;
	}

	public void tosar(animais.cachorro cachorro) {
		cachorro.setEstadoEspirito("Tosado");
	}
	
	public void deixaEmCasa(animal animal) {
		animal.setEstadoEspirito("Com saudade");
	}
}
