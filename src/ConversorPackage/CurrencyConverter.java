package ConversorPackage;

//Clase para manejar las conversiones de moneda
public class CurrencyConverter {

	// método para convertir una cantidad de dinero de una moneda a otra
	public Money convert(double amount, Currency originalCurrency, Currency targetCurrency) {
		// implementación de la conversión

		// Se puede usar una API en lugar de una matriz que coordine los cambios;
		double exchangeRate;
		switch (originalCurrency) {
			case USD:
				exchangeRate = getExchangeRate(Currency.USD, targetCurrency);
				break;
			case EUR:
				exchangeRate = getExchangeRate(Currency.EUR, targetCurrency);
				break;
			case GBP:
				exchangeRate = getExchangeRate(Currency.GBP, targetCurrency);
				break;
			case JPY:
				exchangeRate = getExchangeRate(Currency.JPY, targetCurrency);
				break;
			case KRW:
				exchangeRate = getExchangeRate(Currency.KRW, targetCurrency);
				break;
			default:
				throw new IllegalArgumentException("Moneda no soportada: " + targetCurrency);
			}

		double convertedAmount = amount * exchangeRate; // convertir la cantidad a la moneda de destino

		// crear y devolver una nueva instancia de Money con la cantidad convertida y la
		// moneda de destino
		return new Money(convertedAmount, targetCurrency);
	}

	// Este método contiene los índices en forma de matriz para coincidir monedas de
	// origen y destino
	public static double getExchangeRate(Currency fromCurrency, Currency toCurrency) {

		// Coordinadas para la selección del tipo de cambio
		double[][] exchangeRates = {
				// USD EUR GBP JPY KRW
				{ 1.0, 0.8, 0.7, 109.0, 1140.0 }, // USD
				{ 1.2, 1.0, 0.9, 132.0, 1396.0 }, // EUR
				{ 1.4, 1.1, 1.0, 156.0, 1649.0 }, // GBP
				{ 0.009, 0.007, 0.006, 1.0, 10.5 }, // JPY
				{ 0.0009, 0.0007, 0.0006, 0.095, 1.0 } // KRW
		};

		int fromIndex = fromCurrency.ordinal();
		int toIndex = toCurrency.ordinal();

		if (fromIndex < 0 || fromIndex >= exchangeRates.length || toIndex < 0 || toIndex >= exchangeRates.length) {
			throw new IllegalArgumentException("Moneda no soportada");
		}

		return exchangeRates[fromIndex][toIndex];
	}
}
