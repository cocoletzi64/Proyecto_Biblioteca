package Dominio;

public class Libros {
	private String titulo;
	private int anioPub;
	private String autor;
	private int numPg;
	private float precio;
	
	
	
	public Libros() {
	}

	public Libros(String titulo, int anioPub, String autor, int numPg, float precio) {
		this.titulo = titulo;
		this.anioPub = anioPub;
		this.autor = autor;
		this.numPg = numPg;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioPub() {
		return anioPub;
	}

	public void setAnioPub(int anioPub) {
		this.anioPub = anioPub;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPg() {
		return numPg;
	}

	public void setNumPg(int numPg) {
		this.numPg = numPg;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libros [titulo=" + titulo + ", anioPub=" + anioPub + ", autor=" + autor + ", numPg=" + numPg
				+ ", precio=" + precio + "]\n";
	}
	
	
	


}
