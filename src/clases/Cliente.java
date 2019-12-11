/**
 * 
 */
package clases;
import java.util.Scanner;
/**
 * @author MARIO LUZARDO
 *
 */
public class Cliente {
	/**
	 * @Atrib
	 */
	private Cuenta [] lista;
	private int codigo;
	private String nombre;
	private static int cont=0;
	/**
	 * @Constructor
	 * @param codigo
	 * @param nombre
	 * @param lista
	 */
	public Cliente(String codigo, String nombre, Cuenta [] lista) {
		this.codigo=cont++;
		this.nombre=nombre;
		this.lista=lista;
	}
	/**
	 * @Constructor
	 * @param nombre
	 */
	public Cliente(String nombre) {
		this.nombre=nombre;
		this.codigo=cont++;
		abrirCuenta();
	}
	/**
	 * 
	 * @return the this.codigo 
	 */
	public int getCodigo() {
		return this.codigo;
	}
	/**
	 * 
	 * @param codigo the this.codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	/**
	 * 
	 * @return the this.nombre
	 */
	public String getNombre() {
		return this.nombre;
	}
	/**
	 * 
	 * @param nombre the this.nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	/**
	 * 
	 * @param x
	 * @return this.lista[x]
	 */
	public Cuenta getLista(int x) {
		if(x<lista.length) {
			return lista[x];
		}
		return null;
	}
	/**
	 * 
	 * @param lista the this.lista to set
	 */
	public void setLista(Cuenta lista[]) {
		this.lista=lista;
	}
	/**
	 * @Metodos
	 */
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
	public void mostrar() {
		System.out.println("Codigo: "+codigo
				+"\nNombre del titular: "+nombre);
		for(int i=0;i<lista.length;i++) {
			lista[i].mostrar();
		}
	}
	/**
	 * 
	 * @return true or false
	 */
	public boolean mora() {
		int cont=0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i].getSaldo()<0) {
				cont++;
			}
		}
		if(cont>0) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * 
	 * @return this.lista.length
	 */
	public int tamañoCuenta() {
		return lista.length;
	}
}
