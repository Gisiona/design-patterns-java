package br.com.designpatterns.strategy.calculadora;

public class Subtrair implements Calculador{

	@Override
	public double calcular(double param1, double param2) {
		return param1 - param2;
	}

}
