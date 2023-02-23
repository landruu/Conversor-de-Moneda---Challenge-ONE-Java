package ConversorPackage;

public class Main {
	
	public static void main(String[] args) {
		// aqui el código del conversor
		
		double currentMoney = 10;
		Currency dolar = Currency.USD;
		Currency euro = Currency.EUR;
		Currency libras = Currency.GBP;
		Currency yanes = Currency.JPY;
		Currency yen = Currency.KRW;
		
		
		Money monedaActual = new Money(currentMoney, dolar);
		Money monedaCambiada = monedaActual.convertTo(euro);
		
		System.out.println("Cambio: " + monedaActual.getAmount() + " " + monedaActual.getCurrency()
							+ " = " + monedaCambiada.getAmount() + " " + monedaCambiada.getCurrency());
		
	}

}
