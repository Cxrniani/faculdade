
public class TesteCalculavel {

	public static void main(String[] args) {
	int i = 0;	
		
	Calculavel[] calc = new Calculavel[5];
	Calculavel q1 = new Quadrado(10);
	Calculavel r1 = new Retangulo(15,20);
	Calculavel c1 = new Circulo(5);
	Calculavel q2 = new Quadrado(5);
	Calculavel c2 = new Circulo(10);
	
	
	calc[0] = q1;
	calc[1] = r1;
	calc[2] = c1;
	calc[3] = q2;
	calc[4] = c2;
	
	while(i<calc.length) {
	System.out.println(calc[i].calculaArea());
	i++;
	}
	System.out.println("\n");
	i = 0;
	while(i<calc.length) {
	System.out.println(calc[i].calculaPerimetro());
	i++;
	}
	}

}
