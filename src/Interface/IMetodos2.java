package Interface;

import Dominio.Libros;

public interface IMetodos2 {
	public Libros buscar2(String titulo);
	
	public Libros buscar3(String autor);
	
	public Libros editar2(String nombre,Libros libro);
	
	public void eliminar2(String titulo);
	
	
	
}
