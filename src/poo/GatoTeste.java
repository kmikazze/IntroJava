package poo;

public class GatoTeste {

	public static void main(String[] args) {
		Gato g1 = new Gato("Lua","Siames",6,3.5f);
		
		System.out.println("Nome do Gato: "+g1.getNome());
		g1.setPeso(4.0f);
		System.out.println("Peso do Gato: "+g1.getPeso());
		g1.setIdade(7);
		System.out.println("Idade do gato: "+g1.getIdade());
		g1.miar();
	}

}
