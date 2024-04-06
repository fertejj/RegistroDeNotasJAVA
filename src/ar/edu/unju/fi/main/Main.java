package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNotas;

public class Main {

	public static void main(String[] args) {
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 2);
	}
	
	
	
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno ();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		return alumno;
	}
	
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner scanner = new Scanner(System.in);
		
		while(numMaterias <= 2) {

			System.out.println("Ingrese codigo de materia: ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese nombre de materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia (codigoMateria, nombreMateria);
			
			System.out.println("Ingrese codigo de registro notarial: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese nota final: ");
			Float nota = scanner.nextFloat();
			
			RegistroNotas registroNota = new RegistroNotas(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			
			numMaterias++;
		}
	}
}
