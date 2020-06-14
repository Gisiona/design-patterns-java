package br.com.designpatterns.strategy.calculadora;

public class StartMain {

	public static void main(String[] args) {
		double PARAM1 = 20;
		double PARAM2 = 10;
		
		Calculador calculador = new Somar();		
		double operacao = calculador.calcular(PARAM1, PARAM2);
		System.out.println("******************* Operação de Soma **********************");
		System.out.println(PARAM1 + " + " +  PARAM2 +  " = " + operacao);			
		
		calculador = new Subtrair();		
		operacao = calculador.calcular(PARAM1, PARAM2);
		System.out.println("******************* Operação de Subtração **********************");
		System.out.println(PARAM1 + " - " +  PARAM2 +  " = " + operacao);
		
		calculador = new Dividir();		
		operacao = calculador.calcular(PARAM1, PARAM2);
		System.out.println("******************* Operação de Divisão **********************");
		System.out.println(PARAM1 + " / " +  PARAM2 +  " = " + operacao);
		
		calculador = new Multiplicar();		
		operacao = calculador.calcular(PARAM1, PARAM2);
		System.out.println("******************* Operação de Multiplicação **********************");
		System.out.println(PARAM1 + " * " +  PARAM2 +  " = " + operacao);	
	}
}
