package tp01;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		//creo un objeto de tipo generador de lista.
		GeneradorLista unaLista= new GeneradorLista();
		//creo dos lista de tipo alumno y profesor para poder manipular los datos.
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		List<Profesor> listaProfesores = new ArrayList<Profesor>();
		
		//almaceno los valores a las listas creadas.
		listaAlumnos = unaLista.getListaAlumnos();
		listaProfesores = unaLista.getListaProfesores();
		
		
		System.out.println("LISTA DE ALUMNOS DESORDENADA.");			
		System.out.println(listaAlumnos);		
		Collections.sort(listaAlumnos);
		System.out.println("---------------------------------------------------------");
		System.out.println("PUNTO A.");
		System.out.println("LISTA DE ALUMNOS ORDENADAS POR APELLIDO Y NOMBRE.");
		System.out.println(listaAlumnos);		
		System.out.println("---------------------------------------------------------");
		System.out.println("PUNTO B.");
		System.out.println("LISTA DE PROFESORES DESORDENADA.");
		System.out.println(listaProfesores);	
		System.out.println("---------------------------------------------------------");
		System.out.println("LISTA DE PROFESORES ORDENADO POR LEGAJO.");
		Collections.sort(listaProfesores); 
		System.out.println(listaProfesores);	
		
		System.out.println("---------------------------------------------------------");
		System.out.println("PUNTO C.");
		System.out.println("ALUMNO CON MAYOR PROMEDIO.");
		System.out.println(unaLista.GetMayorPromedio(listaAlumnos));
		
		System.out.println("---------------------------------------------------------");
		System.out.println("PUNTO D.");
		System.out.println("ALUMNO CON MENOR PROMEDIO.");
		System.out.println(unaLista.GetMenorPromedio(listaAlumnos));
		
		System.out.println("---------------------------------------------------------");
		System.out.println("PUNTO E.");
		System.out.println("LISTA ALUMNOS CON PROMEDIO MAYOR A 7");
		System.out.println(unaLista.GetMayoresPromedio(listaAlumnos));

		
		System.out.println("---------------------------------------------------------");
		System.out.println("PUNTO F.");
		System.out.println("LISTA DE INGENIEROS EN SISTEMA");
		System.out.println(unaLista.GetIngenieros(listaProfesores));
		
		System.out.println("---------------------------------------------------------");
		System.out.println("PUNTO G.");
		System.out.println("PROFESORES POR EDAD");
	    Collections.sort(listaProfesores,Profesor.compararEdad());
	    System.out.println(listaProfesores);


		System.out.println("---------------------------------------------------------");
		System.out.println("PUNTO H.");
		System.out.println("SUMA DE LA EDAD DE TODOS LOS PROFESORES");
		System.out.println(unaLista.GetEdadesSumadas(listaProfesores) + " anos" );
		
		
		
	
	}
}
