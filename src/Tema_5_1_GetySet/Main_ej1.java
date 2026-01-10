package Tema_5_1_GetySet;

import java.util.Scanner;

public class Main_ej1 {
	public static void main(String[] args) {
		Person p = new Person("Paco");

		System.out.println("El nombre actual es: " + p.getName());

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el nuevo nombre: ");
		String nuevoNombre = teclado.nextLine();

		p.setName(nuevoNombre);

		System.out.println("El nuevo nombre asignado es: " + p.getName());

		teclado.close();
	}
}
