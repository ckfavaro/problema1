import java.util.Scanner;

public class Persona {  //El nombre de la clase debe hacer referencia al concepto, en este caso "persona"
	private Scanner teclado; //Los atributos los definimos dentro de la clase pero fuera de la main:
	private String nombre; 
	private int edad;
	
	public void inicializar () {
		teclado=new Scanner (System.in);
		System.out.print ("Ingrese nombre:");
		nombre=teclado.next();
		System.out.print("Ingrese edad:");
		edad=teclado.nextInt();
	}
	
	public void imprimir(){
		System.out.println("Nombre:"+nombre);
		System.out.println ("Edad:"+edad);
	}
	public void esMayorEdad() {
		if (edad>=18){
			System.out.print(nombre+" es mayor de edad.");
		}else {
			System.out.print(nombre+" no es mayor de edad");
		}
	}
	public static void main (String[] ar){
		Persona personal; //Declaraci�n del objeto
		personal=new Persona();//Creaci�n del objeto
		personal.inicializar(); //Llamada de un m�todo
		personal.imprimir();
		personal.esMayorEdad();
		}
	
}
