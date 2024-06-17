package tp01;

public abstract class Persona {

	protected int id;
	protected int edad;
	protected long dni;
	protected String nombre;
	protected String apellido;
	
	public Persona(int id,int edad,int dni,String nombre,String apellido) {
		this.id=id;
		this.edad=edad;
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
}
