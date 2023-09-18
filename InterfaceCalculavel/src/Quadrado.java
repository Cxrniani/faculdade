
public class Quadrado implements Calculavel {

	double area;
	
	public double calculaArea() {
		return this.area*this.area;
	}


	public double calculaPerimetro() {
		return this.area*4;
	}


	public Quadrado(double area) {
		super();
		this.area = area;
	}

}
