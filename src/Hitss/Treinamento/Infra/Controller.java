package Hitss.Treinamento.Infra;

public class Controller {
	public static void Play() {
		
		double[] Salario = new double[4];
		Salario[1] = 2000.00;
		Salario[2] = 4000.00;
		Salario[3] = 7000.00;
		
		System.out.println("");
		System.out.println("        Hitss Treinamento");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("");
		for (int i = 1; i < Salario.length; i++) {
			CalculaImposto(i, Salario[i]);
		}
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("");

	}
	
	public static void CalculaImposto(int mat, double sal) {
		
		
		double desconto = sal * 0.925;
		System.out.println("O Salário do Funcionário da Matrícula " + mat + " Com o Desconto de Imposto de Renda Foi de R$ " + desconto);
		
	}
}
