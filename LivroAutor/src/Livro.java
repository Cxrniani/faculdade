
public class Livro extends Autor {
	String nomeLivro,generoObra;
	float preço;
	int numCopias;
	public Livro(String nome, String email, String pseudonimo, int numVendas, String cpf, String nomeLivro,
			String generoObra, float preço, int numCopias) {
		super(nome, email, pseudonimo, numVendas, cpf);
		this.nomeLivro = nomeLivro;
		this.generoObra = generoObra;
		this.preço = preço;
		this.numCopias = numCopias;
	}
	public float getPreço() {
		return preço;
	}
	public void setPreço(float preço) {
		if(preço < 0) {
			this.preço = 0;
		}
		else {
			this.preço = preço;
		}
	}
	@Override
	public String toString() {
		return "Livro [nomeLivro=" + nomeLivro + ", generoObra=" + generoObra + ", numCopias=" + numCopias
				+ ", getPreço()=" + getPreço() + ", nomeAutor="+ pseudonimo + "]";
	}
	
	

	
	
	
	
}
