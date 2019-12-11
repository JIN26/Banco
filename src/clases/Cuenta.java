/**
 * 
 */
package clases;

import java.util.Scanner;

/**
 * @author MARIO LUZARDO
 *
 */
public class Cuenta {
	/**
	 * @Atrib
	 */
	protected int numeroCuenta;
	protected double saldo;
	/**
	 * @Constructor
	 * @param numeroCuenta
	 * @param saldo
	 */
	public Cuenta(int numeroCuenta, double saldo) {
		this.numeroCuenta=numeroCuenta;
		this.saldo=saldo;
	}
	/**
	 * @Constructor @Default
	 */
	public Cuenta() {
		numeroCuenta=(int) Math.floor(Math.random()*(100000000-999999999+1)+999999999);
		this.saldo=0;
	}
	/**
	 * 
	 * @return the  this.numeroCuenta to get
	 */
	public int getNumerocuenta() {
		return this.numeroCuenta;
	}
	/**
	 * 
	 * @param numeroCuenta the this.numeroCuenta to set
	 */
	public void setNumerocuenta(int numeroCuenta) {
		this.numeroCuenta=numeroCuenta;
	}
	/**
	 * 
	 * @return the this.saldo to get
	 */
	public double getSaldo() {
		return this.saldo;
	}
	/**
	 * 
	 * @param saldo the this.saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	/**
	 * @Metodos
	 */
	public void saldoDisponible() {
		System.out.println("Su saldo disponible es: "+this.saldo);
	}
	public void mostrar() {
		System.out.println("Numero de cuenta: "+numeroCuenta
				+"\nSaldo: "+saldo);
	}
	/**
	 * 
	 * @param x
	 */
	public void depositar(double x) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el monto a depositar: ");
		x=in.nextInt();
		if(x>0) {
			System.out.println("Saldo Actual: " + (saldo+=x));
		}else {
			System.out.println("El valor no es valido intente de nuevo");
		}
	}
	/**
	 * 
	 * @param x
	 */
	public void retirar(double x) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el monto que desea retirar: ");
		x=in.nextInt();
		if(x>saldo) {
			System.out.println("El Monto excede el saldo en la cuenta");
		}else {
			if(saldo==0) {
				System.out.println("Su saldo actual es $0.00");
			}
			System.out.println("Saldo actual: "+(saldo-=x));
		}
	}
	/**
	 * 
	 * @param x
	 */
	public void pagar(double x) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el monto a pagar: ");
		x=in.nextInt();
		if(x>saldo) {
			System.out.println("El Monto excede el saldo en la cuenta");
		}else {
			if(saldo==0) {
				System.out.println("Su saldo actual es $0.00");
			}
			System.out.println("Saldo actual: "+(saldo-=x));
		}
	}
}
