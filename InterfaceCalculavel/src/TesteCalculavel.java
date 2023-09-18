
public class TesteCalculavel {

	public static void main(String[] args) {
	Calculavel[] calc = new Calculavel[5];
	Quadrado q1 = new Quadrado(10);
	Retangulo r1 = new Retangulo(15,20);
	Circulo c1 = new Circulo(5);
	Quadrado q2 = new Quadrado(5);
	Circulo c2 = new Circulo(10);
	
	
	calc[0] = q1;
	calc[1] = r1;
	calc[2] = c1;
	calc[3] = q2;
	calc[4] = c2;
	
	System.out.println(calc[0].calculaArea());
	System.out.println(calc[1].calculaArea());
	System.out.println(calc[2].calculaArea());
	System.out.println(calc[3].calculaArea());
	System.out.println(calc[4].calculaArea());
	System.out.println("\n");
	System.out.println(calc[0].calculaPerimetro());
	System.out.println(calc[1].calculaPerimetro());
	System.out.println(calc[2].calculaPerimetro());
	System.out.println(calc[3].calculaPerimetro());
	System.out.println(calc[4].calculaPerimetro());
	}

}
