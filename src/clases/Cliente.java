/**
 * 
 */
package clases;

/**
 * @author MARIO LUZARDO
 *
 */
public class Cliente extends Cuenta{
	private String codigo;
	private String nombre;
	private String [] lista;
	public Cliente(String numeroCuenta, double saldo, String codigo, String nombre) {
		super(numeroCuenta,saldo);
		this.codigo=codigo;
		this.nombre=nombre;
		this.lista=lista;
	}
	public Cliente() {
		super();
	}
}
