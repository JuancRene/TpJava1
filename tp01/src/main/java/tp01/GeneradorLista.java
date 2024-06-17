package tp01;
import java.util.*;
import com.github.javafaker.*;
public class GeneradorLista {
	Persona persona;
	Faker faker =new Faker();
	private static int limtAlumnos=50;
	private static int limtProfesor=20;
	private static String[] profesiones = {"Ing. en sistemas","Licenciado en sistemas","Desarrollador"};
	Random miAleatorio = new Random();
	
	public List<Alumno> getListaAlumnos(){
		
		List<Alumno> listaAlumnos =new ArrayList<>();
		
		for(int i=0;i<limtAlumnos;i++) {
			int edad = faker.number().numberBetween(12, 17);
			int dni = faker.number().numberBetween(55000000, 70000000);
			String nombre =faker.name().firstName();
			String apellido= faker.name().lastName();
			int nroLe = faker.number().numberBetween(1000, 5000);
			int materiasAp = faker.number().numberBetween(1,20);
			double promedio = faker.number().randomDouble(2, 1, 10);
			listaAlumnos.add(new Alumno(i+1,nombre,apellido,edad,dni,nroLe,materiasAp,promedio));
		}
		return listaAlumnos;	
	}
	
	public List<Profesor> getListaProfesores(){
		
		List<Profesor> listaProfesores = new ArrayList<>();
	
		for(int i=0;i<limtProfesor;i++) {
			int edad = faker.number().numberBetween(30, 60);
			int dni = faker.number().numberBetween(40000000, 50000000);
			String nombre =faker.name().firstName();
			String apellido= faker.name().lastName();
			int legajo = faker.number().numberBetween(1, 1000);
			int aleatorio = miAleatorio.nextInt(3);
			String profesion = profesiones[aleatorio];
			listaProfesores.add(new Profesor(i++,nombre,apellido,edad,dni,legajo,profesion));
		}
		return listaProfesores;
	}
	
	public  Alumno GetMayorPromedio(List<Alumno> listaAlumnos) {
		Alumno mayorPromedio = new Alumno(0,"","",0,0,0,0,0.0);
		for (Alumno alumno : listaAlumnos) {
			if(alumno.getPromedio()>mayorPromedio.getPromedio()) {
				mayorPromedio = alumno;
			}
		}
		return mayorPromedio;
	}
	
	public   Alumno GetMenorPromedio(List<Alumno> listaAlumnos) {
		double aux = Double.MAX_VALUE;
		Alumno menorPromedio = null;
		for (Alumno a : listaAlumnos) {
			if(a.getPromedio() < aux) {
				menorPromedio = a;
			}
		}
		return menorPromedio;
	}
	
	public  List<Alumno> GetMayoresPromedio(List<Alumno> listAlumnos) {
		List<Alumno> mayoresAlPromedio = new ArrayList<>();
		for(Alumno alumno : listAlumnos)
		{
			if (alumno.getPromedio() > 7)
			{
				mayoresAlPromedio.add(alumno); 
			}
		}
		Collections.sort(mayoresAlPromedio,Alumno.compararPromedio());
		return mayoresAlPromedio;
	}
	
	public List<Profesor> GetIngenieros(List <Profesor> listaProfesores){
		List<Profesor> listaIngenieros = new ArrayList<>();
		for(Profesor profe : listaProfesores) {
			if(profe.getProfesion().equals("Ing. en sistemas"))
			{
			listaIngenieros.add(profe);
			}
		}
		return listaIngenieros;
	}
	
	public int GetEdadesSumadas(List<Profesor> listaProfesores) {
		int aux = 0;
		for(Profesor profe :listaProfesores) {
			aux += profe.edad;
		}
		return aux;
	}
	
}
	

