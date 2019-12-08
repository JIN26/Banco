/**
 * 
 */
package clases;
import java.util.Scanner;
/**
 * @author MARIO LUZARDO
 *
 */
public class Cliente{
	private Cuenta [] lista;
	private String codigo;
	private String nombre;
	public Cliente(String codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}
	public Cliente() {}
	public void abrirCuenta() {
		System.out.println("Cantidad de cuentas:");
		Scanner in = new Scanner(System.in);
		int x;
		x=in.nextInt();
		lista=new Cuenta[x];
		for(int i=0;i<lista.length;i++) {
			lista[i]=new Cuenta();
		}
	}
}
