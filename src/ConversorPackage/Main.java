package ConversorPackage;

import java.text.DecimalFormat;
/**
 * 
 * @author Andrés
 * El metodo main crea una monto de dinero y divisa actual, 
 * la moneda tiene la capacidad de ser cambiada por lo que recibe en esta instancia un tipo de cambio
 * luego puede ejecutar el cambio y mostrarlo
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		double currentMoney = 1; // set dinero
		Currency dolar = Currency.USD;
		Currency euro = Currency.EUR;
		Currency libras = Currency.GBP;
		Currency yanes = Currency.JPY;
		Currency ars = Currency.ARS;
		
		// DecimalFormat disminuye los decimales usando su funcion format();
		DecimalFormat df = new DecimalFormat("0.00");
												     // set divisa
		Money monedaActual = new Money(50, dolar);
													// set divisa de cambio
		Money monedaCambiada = monedaActual.convertTo(ars);
		
		System.out.println("Cambio: " + monedaActual.getAmount() + " " + monedaActual.getCurrency()
							+ " = " + df.format(monedaCambiada.getAmount()) + " " + monedaCambiada.getCurrency());
		
	}

}
