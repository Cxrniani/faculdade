
public class Circulo implements Calculavel {

	double raio;

	public double calculaArea() {
		
		return (this.raio*this.raio)*3.14;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return 2*3.14*this.raio;
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

}
