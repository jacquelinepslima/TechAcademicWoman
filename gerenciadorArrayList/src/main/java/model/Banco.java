package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Colaborador> listaColaboradores = new ArrayList();
	private static Integer chaveSequencial = 1;
	
	static {
		
		Colaborador colaborador = new Colaborador();
		colaborador.setIdColaborador(chaveSequencial++);
		colaborador.setNomeColaborador("Valquiria");
		
		Colaborador colaborador1 = new Colaborador();
		colaborador1.setIdColaborador(chaveSequencial++);
		colaborador1.setNomeColaborador("Caleb");
		
		listaColaboradores.add(colaborador1);
		listaColaboradores.add(colaborador);
		
	}
	
	public void add(Colaborador colaborador) {
		colaborador.setIdColaborador(Banco.chaveSequencial++);
		Banco.listaColaboradores.add(colaborador);	
	}
	
	public List<Colaborador> getColaboradores(){
		return Banco.listaColaboradores;
	}

	public void remove(Integer id) {
		
		Iterator<Colaborador> it = listaColaboradores.iterator();
		
		while(it.hasNext()) {
			Colaborador colaborador = it.next();
			
			if(colaborador.getIdColaborador() == id) {
				it.remove();
			}
		}
		
	}

	public Colaborador findById(Integer id) {
		for (Colaborador colaborador : listaColaboradores) {
			if(colaborador.getIdColaborador() == id) {
				return colaborador;
			}		
		}
		return null;
	}	
	

}
