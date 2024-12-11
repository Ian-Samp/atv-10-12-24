package lp2;

public class Funcionario {
	private String nome, dataC;
	private int matricula, rg, cpf, sBase, horas;
	private int totalSalario;
	private static int geraMatricula = 0;
	
	public Funcionario(String nome, String dataC, int matricula, int sBase, int horas) {
		this.nome = nome;
		this.sBase = sBase;
		this.horas = horas;
		this.dataC = dataC;
		this.matricula = geraMatricula+1;
	}
	
	public void calculaSalario() {
		Calculo calculo = new Calculo();
		calculo.calculaSalario(sBase, horas);
	    this.totalSalario = calculo.getTotalSalario();
	}
	
	public int getTotalSalario() {
		return totalSalario;
	}
	
	public String imprimirDados() {
		return "Nome: " + nome
				+ " // Data de contratação: " + dataC
				+ " // Matrícula: " + matricula
				+ " // Salário base: " + sBase
				+ " // Horas trabalhadas: " + horas
				+ " // Salário total: " + this.getTotalSalario();
	}
}
