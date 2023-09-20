

public class Livro {

	

	public Livro(int i, String nomeLivro, String generoObra, double preço, int numCopias) {
		this.i = i;
		this.nomeLivro = nomeLivro;
		this.generoObra = generoObra;
		this.preço = preço;
		this.numCopias = numCopias;
	}

	int i = 0;
	Autor a;

	String nomeLivro, generoObra;
	double preço;
	int numCopias;
	Autor[] autores = new Autor[5];

	public double getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		if (preço < 0) {
			this.preço = 0;
		} else {
			this.preço = preço;
		}
	}

	public void adicionaAutor(Autor autor) {
		if (i < this.autores.length) {
			this.autores[i] = autor;
			i++;
		}
	}
	public void mostrarAutores() {
		for(Autor a : autores) {
			if(a==null)
				break;
			else {
				System.out.println(a.toString());
			}
		}
	}


	@Override
	public String toString() {
		return "Livro [nomeLivro=" + nomeLivro + ", generoObra=" + generoObra + ", numCopias=" + numCopias
				+ ", getPreço()=" + getPreço() + ", numAutores=" + i + "]";
	}
}
