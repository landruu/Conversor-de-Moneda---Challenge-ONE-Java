package ConversorPackage;

//Clase para representar una cantidad de dinero en una determinada moneda
public class Money {

	private double amount;
	private Currency currency;
	private CurrencyConverter converter = new CurrencyConverter();

	public Money(double amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}

	// método para convertir esta cantidad de dinero a otra moneda
	public Money convertTo(Currency targetCurrency) {

		// implementación de la conversión
		if (targetCurrency == this.currency) {
			System.out.println("No se puede cambiar al mismo tipo de moneda");
			return new Money(this.amount, this.currency);
		} else {
			System.out.println("Successful Change");
			return converter.convert(this.amount, this.currency, targetCurrency);
		}
		
	}

	// getters y setters para amount y currency
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
}
