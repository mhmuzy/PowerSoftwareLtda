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
			CalculaInss(i, Salario[i]);
		}
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("");

	}
	
	public static void CalculaImposto(int mat, double sal) {
		double desconto = 0.0;
		
		if(sal <= 1903.98) {
		desconto = sal;
			System.out.println("O Salário do Funcionário da Matrícula " + mat + " Com o Desconto de Imposto de Renda Foi de R$ " + desconto);
		} else if(sal >= 1903.99 && sal <= 2826.65) {
			
			desconto = sal * 0.925;
			System.out.println("O Salário do Funcionário da Matrícula " + mat + " Com o Desconto de Imposto de Renda Foi de R$ " + desconto);
			
		} else if(sal >= 2826.66 && sal <= 3751.05) {
			
			desconto = sal * 0.85;
			System.out.println("O Salário do Funcionário da Matrícula " + mat + " Com o Desconto de Imposto de Renda Foi de R$ " + desconto);
		} else if(sal >= 3751.06 && sal <= 4664.68) {
			
			desconto = sal * 0.775;
			System.out.println("O Salário do Funcionário da Matrícula " + mat + " Com o Desconto de Imposto de Renda Foi de R$ " + desconto);
		} else {
			desconto = sal * 0.725;
			System.out.println("O Salário do Funcionário da Matrícula " + mat + " Com o Desconto de Imposto de Renda Foi de R$ " + desconto);
		}
		}
	
	public static void CalculaInss(int mat, double sal) {
		double desconto = 0.0;
		
		if(sal <= 1693.72) {
		desconto = sal * 0.92;
			System.out.println("O Salário do Funcionário da Matrícula " + mat + " Com o Desconto do INSS Foi de R$ " + desconto);
		} else if(sal >= 1693.73 && sal <= 2822.90) {
			
			desconto = sal * 0.91;
			System.out.println("O Salário do Funcionário da Matrícula " + mat + " Com o Desconto do INSS Foi de R$ " + desconto);
			
		} else {
			desconto = sal * 0.89;
			System.out.println("O Salário do Funcionário da Matrícula " + mat + " Com o Desconto do INSS Foi de R$ " + desconto);
		}
		}
}
