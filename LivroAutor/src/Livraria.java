
public class Livraria {
	public static void main(String[] args) {
	
	Autor joaozinho = new Autor("joao intelectus", "joaozinho123@gmail.com",
			"joaozinho", 50, "12354678");
	Livro macarraoSalsicha = new Livro(joaozinho.nome, joaozinho.email,
			joaozinho.pseudonimo, joaozinho.numVendas,
			joaozinho.cpf, "Macarrão com salsicha", "Culinario",
			(float) 10.99, 50);
	
	Autor fulano = new Autor("fulanus da silvius", "fulanodasilvius123@gmail.com",
			"fulano", 25, "87654321");
	Livro comoBeberAgua = new Livro(fulano.nome, fulano.email,
			fulano.pseudonimo, fulano.numVendas,
			fulano.cpf, "Como Beber Água", "Informativo",
			(float) 25.50, 25);

	System.out.println(macarraoSalsicha.toString());
	System.out.println(comoBeberAgua.toString());
	}
}