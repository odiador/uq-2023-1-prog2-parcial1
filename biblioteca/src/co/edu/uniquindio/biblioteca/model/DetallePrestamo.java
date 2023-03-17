package co.edu.uniquindio.biblioteca.model;

public class DetallePrestamo {

	private String codigo;
	private double subTotal;
	private int cantidad;
	private Libro libro;

	public DetallePrestamo(String codigo, double subTotal, int cantidad, Libro libro) {
		super();
		this.codigo = codigo;
		this.subTotal = subTotal;
		this.cantidad = cantidad;
		this.libro = libro;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public boolean verificarCantidad() {

		if (cantidad > 20) {
			return true;
		}
		return false;
	}

	public boolean cumpleIsbn(String isbn) {
		return libro.cumpleIsbn(isbn);
	}

	public boolean cumpleLibro(String titulo, int limiteInferior, int limiteSuperior) {
		return verificarRango(limiteInferior, limiteSuperior) && verificarNombre(titulo);
	}

	private boolean verificarNombre(String titulo) {
		return getLibro().cumpleTitulo(titulo);
	}

	private boolean verificarRango(int limiteInferior, int limiteSuperior) {
		return getCantidad() >= limiteInferior && getCantidad() < limiteSuperior;
	}

	/**
	 * 
	 * @param tipo
	 * @return
	 */
	public boolean cumpleTipo(Tipo tipo) {
		return getLibro().getTipo() == tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		DetallePrestamo other = (DetallePrestamo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DetallePrestamo [codigo=" + codigo + ", subTotal=" + subTotal + ", cantidad=" + cantidad + ", libro="
				+ libro + "]";
	}

}
