/**
 * 
 */
package principal;
import clases.Cliente;
/**
 * @author CYBER-SERVER
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 =new Cliente();
		c1.abrirCuenta();
		c1.getLista(1).depositar(100);
	}

}
