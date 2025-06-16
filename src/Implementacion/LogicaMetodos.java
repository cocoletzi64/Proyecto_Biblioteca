package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Libros;
import Interface.IMetodos;
import Interface.IMetodos2;

public class LogicaMetodos implements IMetodos,IMetodos2{

	List<Libros> lista=new ArrayList<Libros>();
	
	@Override
	public void guarda(Libros libro) {
		
		boolean bandera=false;
		
		for (Libros l : lista) {
		    
		    if (l.getTitulo().equals(libro.getTitulo())) {
		        System.out.println("Ese libro ya existe");
		        bandera = true;
		        break;
		    }
		}

		
		if (!bandera) {
		    lista.add(libro);
		    System.out.println("Libro guardado correctamente");
		}
		
	
	}

	@Override
	public List<Libros> mostrar() {
		return lista;
	}

	@Override
	public Libros buscar(int indice) {
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Libros libro) {
		lista.set(indice, libro);
		
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
		
	}
	
	//IMetodos2

	@Override
	public Libros buscar2(String titulo) {
		for(Libros l:lista) {
			if(l.getTitulo().equalsIgnoreCase(titulo)){
				return l;
			}
		}
		return null;
	}

	@Override
	public Libros buscar3(String autor) {
		for(Libros l:lista) {
			if(l.getAutor().equalsIgnoreCase(autor)){
				return l;
			}
		}
		
		return null;
	}

	@Override
	public Libros editar2(String titulo, Libros libro) {
		for(Libros l:lista) {
			if(l.getTitulo().equalsIgnoreCase(titulo)){
				return l;
			}
		}
		
		return null;
	}

	@Override
	public void eliminar2(String titulo) {
		for(Libros l:lista) {
			if(l.getTitulo().equalsIgnoreCase(titulo)){
			lista.remove(l);
			System.out.println("El libro "+l.getTitulo()+ "se elimino con exito");
			break;
			}
			
			
		}
		
	}
	

}
