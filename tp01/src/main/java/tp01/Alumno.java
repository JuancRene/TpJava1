package tp01;

import java.util.*;

public class Alumno extends Persona implements Comparable<Alumno>{
	
	private int numLe;

	public int getNumLe() {
		return numLe;
	}

	public void setNumLe(int numLe) {
		this.numLe = numLe;
	}
	
	private int materiasAp;

	public int getMateriasAp() {
		return materiasAp;
	}

	public void setMateriasAp(int materiasAp) {
		this.materiasAp = materiasAp;
	}
	
	private double promedio;

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	
	
	public Alumno(int id,String nombre,String apellido,int edad, int dni,int legajo, int aprobadas,double promedio) {
		super( id, edad, dni, nombre, apellido);
		setPromedio(promedio);
		setMateriasAp(aprobadas);
		setNumLe(legajo);
	}


	
	public int compareTo(Alumno alumno) { 	
		int comparacion = this.apellido.compareTo(alumno.getApellido());
		
		if (comparacion!=0) {
			return comparacion;
		}
		if (comparacion==0) {
			return this.nombre.compareTo(alumno.getNombre());
		}
		return Integer.compare(this.edad,alumno.getEdad());
	}
	
	public static Comparator<Alumno> compararPromedio(){
		return Comparator.comparingDouble(Alumno::getPromedio).reversed();
	}

	@Override
	public String toString() {
		return "NOMBRE: " + nombre +" / APELLIDO: "+apellido + " / ID:" + id + " / LEGAJO: " + numLe +"\n" + " / PROMEDIO: " +promedio + "\n";
	}
	
	
}
