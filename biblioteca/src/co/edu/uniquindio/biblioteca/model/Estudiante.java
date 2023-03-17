package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;

public class Estudiante {

	// Atributos
	private String nombres;
	private String apellidos;
	private Integer edadEstudiante;
	private String programa;
	private String estado;
	private String identificacion;
	private ArrayList<Prestamo> listaPrestamos;

	public Estudiante() {
	}

	/**
	 * 
	 * @param nombres
	 * @param apellidos
	 * @param edad
	 * @param programa
	 * @param estado
	 * @param identificacion
	 */
	public Estudiante(String nombres, String apellidos, Integer edad, String programa, String estado,
			String identificacion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edadEstudiante = edad;
		this.programa = programa;
		this.estado = estado;
		this.identificacion = identificacion;
		this.listaPrestamos = new ArrayList<Prestamo>();
	}

	/**
	 * 
	 * @return
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Prestamo> getListaPrestamos() {
		return listaPrestamos;
	}

	/**
	 * 
	 * @param listaPrestamos
	 */
	public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}

	/**
	 * 
	 * @param nombres
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * 
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getEdadEstudiante() {
		return edadEstudiante;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdadEstudiante(Integer edad) {
		this.edadEstudiante = edad;
	}

	/**
	 * 
	 * @return
	 */
	public String getPrograma() {
		return programa;
	}

	/**
	 * 
	 * @param programa
	 */
	public void setPrograma(String programa) {
		this.programa = programa;
	}

	/**
	 * 
	 * @return
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * 
	 * @return
	 */
	public String getIdentificacion() {
		return identificacion;
	}

	/**
	 * 
	 * @param identificacion
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	@Override
	public String toString() {
		return "Estudiante [nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edadEstudiante
				+ ", programa="
				+ programa + ", estado=" + estado + ", identificacion=" + identificacion + "]";
	}

	/**
	 * 
	 * @param edad
	 * @return
	 */
	public boolean verificarEdad(int edad) {
		return getEdadEstudiante() > edad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		return true;
	}

	public boolean cumpleId(String id) {
        return getIdentificacion().equals(id);
    }

	public boolean cumplePrograma(String programa) {
		return getPrograma().equals(programa);
	}

	public boolean cumpleIdPrograma(String id, String programa) {
		return cumpleId(id) && cumplePrograma(programa);
	}

}
