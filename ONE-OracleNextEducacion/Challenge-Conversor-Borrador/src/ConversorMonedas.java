

public class ConversorMonedas extends Conversor implements Convertir{
	
	private double resultado;

	public ConversorMonedas(String opciones, double valor) {
		super(opciones, valor);
		this.resultado = Convertidor(valor, opciones);
	}
		
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	@Override
	public double Convertidor(double valor, String opcion) {
		
		switch (opcion) {
		case "COP a USD": {
			resultado =  valor / 4732.01;
			System.out.println(resultado);	
			return resultado;
		}
		case "COP a Euros": {
			resultado =  valor / 5030.11;
			System.out.println(resultado);	
			return resultado;
		}
		case "COP a Libras Esterlinas": {
			resultado =  valor / 5640.69;
			System.out.println(resultado);	
			return resultado;
		}
		case "COP a Yen Japonés": {
			resultado =  valor / 34.80;
			System.out.println(resultado);	
			return resultado;
		}
		case "COP a Won sul-coreano": {
			resultado =  valor / 3.62;
			System.out.println(resultado);	
			return resultado;
		}
		case "USD a COP": {
			resultado =  valor * 4732.01;
			System.out.println(resultado);	
			return resultado;
		}
		case "Euros a COP": {
			resultado =  valor * 5030.11;
			System.out.println(resultado);	
			return resultado;
		}
		case "Libras Esterlinas a COP": {
			resultado =  valor * 5640.69;
			System.out.println(resultado);	
			return resultado;
		}
		case "Yen Japonés a COP": {
			resultado =  valor * 34.80;
			System.out.println(resultado);	
			return resultado;
		}
		case "Won sul-coreano a COP": {
			resultado =  valor * 3.62;
			System.out.println(resultado);	
			return resultado;
		}
		default:
			System.out.println("Opción por defecto, no es válida");
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		// return 0;
	}
}
