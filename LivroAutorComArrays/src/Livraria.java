
public class Livraria {
	public static void main(String[] args) {
	
	Livro macarraoSalsicha = new Livro(0, null, null, 0, 0);
	Livro comoBeberAgua = new Livro(0, null, null, 0, 0);
	Autor autor = new Autor(
			"Joao Intelectus", 
			"joaointelectus@gmail.com", 
			"Joaozinho", 
			50, 
			"12345678");
	Autor autor2 = new Autor(
			"Fulanus da Silvius", 
			"fulanodasilvius123@gmail.com", 
			"Fulano", 
			25, 
			"13335678");
           
	macarraoSalsicha.adicionaAutor(autor);
	macarraoSalsicha.nomeLivro = "Macarrão com Salsicha";
	macarraoSalsicha.generoObra = "Culinária";
	macarraoSalsicha.preço = 15.99;
	macarraoSalsicha.numCopias = 50;
	
	comoBeberAgua.adicionaAutor(autor2);
	comoBeberAgua.nomeLivro = "Como Beber Água?";
	comoBeberAgua.generoObra = "Informativo";
	comoBeberAgua.preço = 31.50;
	comoBeberAgua.numCopias = 200;
	
	


	System.out.println(macarraoSalsicha.toString());
	macarraoSalsicha.mostrarAutores();
	System.out.println(comoBeberAgua.toString());
	comoBeberAgua.mostrarAutores();
	autor.parsePseudonimosFromString("Joao,Cleber,Faustão");
	autor.mostraPseudonimos();
	
	}

}