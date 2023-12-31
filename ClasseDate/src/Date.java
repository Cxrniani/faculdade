
public class Date {
	private int dia,mes,ano;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if(dia > 31 || dia <= 0) {
			this.dia = 00;
		}
		else {
			this.dia = dia;	
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes > 12 || mes <= 0) {
			this.mes = 00;
		}
		else {
			this.mes = mes;	
		}
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


	
	Date(int dia, int mes, int ano) {
		super();
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}

	public String nextDay() {
		if(dia == 00 || mes == 00){
			return "Impossível determinar a data de amanhã, dia e/ou mês inexistentes\n";
		}
		else {
		if(dia == 31 && mes < 12) {
			return "Data de amanhã: "+1 + "/" + (getMes()+1) + "/" + getAno() + "\n";
		}
		else if(dia == 31 && mes == 12) {
			return "Data de amanhã: "+1 + "/" + 1 + "/" + (getAno()+1) + " // Feliz ano novo!\n";
		}
		else {
			return "Data de amanhã: "+(getDia()+1) + "/" + getMes() + "/" + getAno() + "\n";
		}
		}
	}

	public String displayDate() {
		if(dia == 00 || mes == 00){
			return "Impossível mostrar a data de hoje, dia e/ou mês inexistentes\n";
		}
		else {
		return "Data de hoje: "+getDia() + "/" + getMes() + "/" + getAno() + "\n";
		}
	}
	

	
	
	
	
	
	
}
