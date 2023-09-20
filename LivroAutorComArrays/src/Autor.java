
public class Autor {
	String nomeAutor,email,cpf;
	String[] pseudonimos;
	int numVendas;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.getClass().getSimpleName() == "String") {
			this.email = email;
		}
		else {
			this.email = null;;
		}		
	}
	
	public void parsePseudonimosFromString(String pseudonimos) {
		this.pseudonimos = pseudonimos.split(",");
	}
	
	public void mostraPseudonimos() {
		for (String str : this.pseudonimos) {
			if(str == null)
				break;
			System.out.println(str);
		}
	}
	
	@Override
	public String toString() {
		return "Autor [nome=" + nomeAutor + " + " + "numVendas=" + numVendas + ", cpf=" + cpf
				+ ", getEmail()=" + getEmail() + "]";
	}

	public Autor(String nomeAutor, String email, String pseudonimo, int numVendas, String cpf) {
		super();
		this.nomeAutor = nomeAutor;
		this.email = email;
		this.numVendas = numVendas;
		this.cpf = cpf;
	}

	
	
	
	

}
