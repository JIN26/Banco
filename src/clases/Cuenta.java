/**
 * 
 */
package clases;

/**
 * @author ALICIA FIERRO
 *
 */
public class Cuenta {
	protected String numeroCuenta;
	protected double saldo;
	public Cuenta(String numeroCuenta, double saldo) {
		this.numeroCuenta=numeroCuenta;
		this.saldo=saldo;
	}
	public Cuenta() {}
	public String getNumerocuenta() {
		return this.numeroCuenta;
	}
	public void setNumerocuenta(String numeroCuenta) {
		this.numeroCuenta=numeroCuenta;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public void saldoDisponible() {
		System.out.println(this.saldo);
	}
	public void depositar(int x) {
		this.saldo+=x;
		System.out.println(this.saldo);
	}
	public void retirar(int x) {
		this.saldo-=x;
		System.out.println(this.saldo);
	}
	public void pagar(int x) {
		this.saldo-=x;
		System.out.println(this.saldo);
	}
}
