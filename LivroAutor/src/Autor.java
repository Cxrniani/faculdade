
public class Autor {
	String nome,email,pseudonimo,cpf;
	int numVendas;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.getClass().getSimpleName() == "String") {
			this.email = email;
		}
		else {
			this.email = null;
		}		
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", pseudonimo=" + pseudonimo + ", numVendas=" + numVendas + ", cpf=" + cpf
				+ ", getEmail()=" + getEmail() + "]";
	}

	public Autor(String nome, String email, String pseudonimo, int numVendas, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.pseudonimo = pseudonimo;
		this.numVendas = numVendas;
		this.cpf = cpf;
	}

	
	
	
	

}
