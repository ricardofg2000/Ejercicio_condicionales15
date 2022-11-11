package unico;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*Calcula la nota de un trimestre de la asignatura Programación. 
		  El programa pedirá las dos notas que ha sacado el alumno en los dos 
		  primeros controles. Si la media de los dos controles da un número mayor o 
		  igual a 5, el alumno está aprobado y se mostrará la media. En caso de que 
		  la media sea un número menor que 5, el alumno habrá tenido que hacer el examen 
		  de recuperación que se califica como "apto" o "no apto", por tanto se debe preguntar 
		  al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el 
		  resultado de la recuperación es "apto", la nota será un 5; en caso contrario, se  
		  mantiene la nota media anterior.
		 */
		
		Scanner leer = new Scanner(System.in);
		
		final double APROBAR = 5;
		
		double nota1;
		double nota2;
		double nota_final;
		
		String recup;
		
		
		System.out.println("Programa para el cálculo de la nota del trimestre");
		System.out.print("Nota del primer control:");
		nota1 = Double.parseDouble(leer.nextLine());
		System.out.print("Nota del segundo control: ");
		nota2 = Double.parseDouble(leer.nextLine());
		
		nota_final = (nota1 + nota2)/2;
		
		if (nota_final >= APROBAR) {
		}
		else {
			System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
			recup = leer.nextLine();
			if (recup.equals("apto")) {
				nota_final = APROBAR;
			}
		}
		
		System.out.println("Tu nota de Programación es " + nota_final);
	}

}
