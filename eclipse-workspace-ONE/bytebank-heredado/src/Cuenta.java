// entidad Cuenta
public abstract class Cuenta {
	protected double saldo;
	private int agencia;
	private int numero;
	// Cada vez que crea un objeto cuenta, crea un objeto cliente	
	private Cliente titular = new Cliente(); 
	
	private static int total = 0; // Numero de cuentas creadas hasta el momento
	
	// Constructor: Se puede manipular el objeto desde que se crea
	public Cuenta(int agencia) {		
		if(agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}		
		total++;
		System.out.println("Estoy creando cuenta " + agencia);
	}

	public abstract void depositar(double saldo);
	
	public void retirar(double saldo) throws SaldoInsuficienteException{
		if(this.saldo < saldo) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}		
		this.saldo -= saldo;		
	}
	
	public boolean transferir(double saldo, Cuenta cuenta) {
		if (this.saldo >= saldo) {
			//this.saldo -= saldo;
			try {
				this.retirar(saldo);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cuenta.depositar(saldo);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}	
}
