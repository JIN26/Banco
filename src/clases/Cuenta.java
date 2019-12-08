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
	protected void saldoDisponible() {
		System.out.println("null");
	}
	protected void depositar() {
		System.out.println("null");
	}
	protected void retirar() {
		System.out.println("null");
	}
	protected void pagar() {
		System.out.println("null");
	}
}
