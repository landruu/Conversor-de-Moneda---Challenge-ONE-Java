package ConversorPackage;

import java.text.DecimalFormat;

public class Main {
	
	public static void main(String[] args) {
		// aqui el código del conversor
		
		double currentMoney = 23;
		Currency dolar = Currency.USD;
		Currency euro = Currency.EUR;
		Currency libras = Currency.GBP;
		Currency yanes = Currency.JPY;
		Currency yen = Currency.KRW;
		
		// DecimalFormat disminuye los decimales usando su funcion format();
		DecimalFormat df = new DecimalFormat("#.00");
		Money monedaActual = new Money(currentMoney, dolar);
		Money monedaCambiada = monedaActual.convertTo(euro);
		
		System.out.println("Cambio: " + monedaActual.getAmount() + " " + monedaActual.getCurrency()
							+ " = " + df.format(monedaCambiada.getAmount()) + " " + monedaCambiada.getCurrency());
		
	}

}
