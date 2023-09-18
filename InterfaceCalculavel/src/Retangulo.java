
public class Retangulo implements Calculavel {

	double base,altura;
	
	public double calculaArea() {
		return this.base*this.altura;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return this.base*2 + this.altura*2;
	}

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

}
