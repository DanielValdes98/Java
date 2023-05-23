
public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia) {
		super(agencia);
	}
	
	@Override
	public void depositar(double saldo) {
		this.saldo = this.saldo + saldo;
	}

}
