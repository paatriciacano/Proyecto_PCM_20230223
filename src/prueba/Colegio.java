package prueba;

public class Colegio {

	private String nombreColegio;
	private int numeroAlumnos;

	public Colegio(String nombre, int numeroAlumnos) {
		this.nombreColegio = nombre;
		this.numeroAlumnos = numeroAlumnos;
	}

	public String getNombre() {
		return nombreColegio;
	}

	public void setNombre(String nombre) {
		this.nombreColegio = nombre;
	}

	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int numeroAlumnos) {
		this.numeroAlumnos = numeroAlumnos;
	}

}
