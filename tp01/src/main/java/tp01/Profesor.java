package tp01;

import java.util.Comparator;

public class Profesor extends Persona implements Comparable<Profesor> {
	
	private int legajo;

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	private String profesion;

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	public Profesor(int id,String nombre,String apellido, int edad, int dni,int legajo,String profesion) {
		super( id, edad, dni, nombre, apellido);
		setProfesion(profesion);
		setLegajo(legajo);
	}

	@Override
	public int compareTo(Profesor profe) {
		return Integer.compare(profe.legajo,this.legajo);
	}
	
	
	public static Comparator<Profesor> compararEdad(){
		return Comparator.comparingInt(Profesor::getEdad).reversed();
	}
	
	@Override
	public String toString() {
		return "NOMBRE: " + nombre +" / APELLIDO: "+apellido + " / ID:" + id + " / LEGAJO: " + legajo + " / " + profesion + "/ EDAD: "+edad +"\n";  
	}
}
