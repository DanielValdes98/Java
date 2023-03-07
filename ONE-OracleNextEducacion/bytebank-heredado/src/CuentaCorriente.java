
public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia) {
		super(agencia);
	}
	
	@Override // Indica que el metodo esta siendo sobreescrito de la clase padre
	public void retirar(double saldo) throws SaldoInsuficienteException {
		double comision =  saldo*0.02;
		super.retirar(saldo + comision);
	}

	@Override
	public void depositar(double saldo) {
		this.saldo = this.saldo + saldo;
	}
}
