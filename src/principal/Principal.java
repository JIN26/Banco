/**
 * 
 */
package principal;
import java.util.Scanner;

import clases.Cliente;
import clases.Cuenta;
/**
 * @author MARIO LUZARDO
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Cliente c1[] = null;
		int x=0;
		String auxNombre=" ";
		int auxCodigo=0;
 		Cuenta a1[] = null;
 		for(;;) {
		System.out.println("\t Menu\n"
				+"1.- Crear cliete\n"
				+"2.- Crear Cuenta\n"
				+"3.- Agregar cuentas a los Clientes\n"
				+"4.- Buscar cliente por su codigoº\n"
				+"5.- Bucar cuenta por su numero de cuenta");
		int f=in.nextInt();
		switch(f) {
		case 1: 
			System.out.println("Cuantos clientes desea iniciar");
			x=in.nextInt();
			c1= new Cliente[x];
			for(int i=0;i<c1.length;i++) {
				System.out.println("Nombre: ");
				auxNombre=in.next();
				c1[i]=new Cliente(auxNombre);
			}
			break;
		case 2:
			System.out.println("Cuantas cuentas desea crear");
			x=in.nextInt();
			
			a1= new Cuenta[x];
			
			for(int i=0;i<a1.length;i++) {
				System.out.println("numero de cuenta: ");
				auxCodigo=in.nextInt();
				a1[i]=new Cuenta(auxCodigo,0);
			}
			break;
		case 3: 
			
		case 4:
			
			if(c1!=null && a1!=null){
					
				System.out.println("Ingrese su codigo del cliente: ");
				
				auxCodigo=in.nextInt();
				for(int i=0;i<c1.length;i++) {
					if(auxCodigo==c1[i].getCodigo()) {
						if(f==3) {
						System.out.println("Se agregara la ultima cuenta creada");
						c1[i].setLista(a1);
						}
						if(f==4) {
							c1[i].mostrar();
						}
					}
				}
			}else {
				System.out.println("Aun no ha creado su cliente o su cuenta");
			}
			break;
		case 5:
			System.out.println("Ingrese su numero de cuenta: ");
			
			auxCodigo=in.nextInt();
			for(int i=0;i<c1.length;i++) {
				for(int j=0;j<c1[i].tamañoCuenta();j++) {
					
					if(auxCodigo==c1[i].getLista(j).getNumerocuenta()) {
						c1[i].mostrar();
					}
				}
			}
		}
 		}
	}

}
