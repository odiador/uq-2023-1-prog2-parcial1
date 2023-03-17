package co.edu.uniquindio.biblioteca.model;

public class Libro {

	private String titulo;
	private String autor;
	private String editorial;
	private String isbn;
	private Tipo tipo;

	public Libro(String titulo, String autor, String editorial, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
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
		Libro other = (Libro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	public boolean cumpleTitulo(String titulo) {
		return getTitulo().equals(titulo);
	}

	public boolean cumpleIsbn(String isbn) {
		return getIsbn().equals(isbn);
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
