package lp2;

public class Calculo {
	private int totalSalario;
	
	public void calculaSalario(int sBase, int horas) {
		totalSalario = sBase * horas;
	}
	
	public int getTotalSalario() {
		return totalSalario;
	}
}
