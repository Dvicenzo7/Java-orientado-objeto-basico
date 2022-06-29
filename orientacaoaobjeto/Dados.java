package orientacaoaobjeto;

public class Dados {

	String nome = "Daniel";
	String sobrenome = "Vicenzo";
	int idade = 20;
	
	public static void main(String[] args) {
		
		Dados daniel = new Dados ();
		
		System.out.println("O nome é "+daniel.nome + " "+daniel.sobrenome);
		System.out.println("Sua idade é : " +daniel.idade);
	}

}
