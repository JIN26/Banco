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
	public String getCodigo() {
		return this.codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Cuenta getLista(int x) {
		if(x<lista.length) {
			return lista[x];
		}
		return null;
	}
	public void abrirCuenta() {
		System.out.println("Cantidad de cuentas:");
		Scanner in = new Scanner(System.in);
		int x;
		String auxNombre;
		x=in.nextInt();
		lista=new Cuenta[x];
		for(int i=0;i<lista.length;i++) {
			
			System.out.println("Que nombre desea para su cuenta Nº "+(i+1));
			auxNombre=in.next();
			lista[i]=new Cuenta(auxNombre,0);
		}
	}
}
