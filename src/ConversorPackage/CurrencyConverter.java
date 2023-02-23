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
			case ARS:
				exchangeRate = getExchangeRate(Currency.ARS, targetCurrency);
				break;
			default:
				throw new IllegalArgumentException("Moneda no soportada: " + targetCurrency);
			}

		double convertedAmount = amount * exchangeRate; // Operación de cambio: Moneda Original * Moneda Objetivo

		// crear y devolver una nueva instancia de Money con la cantidad convertida y la moneda Objetivo
		return new Money(convertedAmount, targetCurrency);
	}

	// Este método contiene los índices en forma de matriz para coincidir monedas de origen y destino
	public static double getExchangeRate(Currency fromCurrency, Currency toCurrency) {

		// Cada fila represneta una (1) unidad de divisa y cada columna cuanto vale esa unidad en otra divisa
		double[][] exchangeRates = {
				// USD EUR GBP JPY ARS
				{ 1.0, 0.94, 0.83, 134.74, 195.55 }, // USD
				{ 1.06, 1.0, 0.88, 142.84, 207.32}, // EUR
				{ 1.2, 1.14, 1.0, 162.34, 235.53}, // GBP
				{ 0.0074, 0.007, 0.0062, 1.0, 1.45 }, // JPY
				{ 0.0051, 0.0048, 235.64, 1.45, 1.0 } // ARS
		};

		int fromIndex = fromCurrency.ordinal();
		int toIndex = toCurrency.ordinal();

		if (fromIndex < 0 || fromIndex >= exchangeRates.length || toIndex < 0 || toIndex >= exchangeRates.length) {
			throw new IllegalArgumentException("Moneda no soportada");
		}

		return exchangeRates[fromIndex][toIndex];
	}
}
