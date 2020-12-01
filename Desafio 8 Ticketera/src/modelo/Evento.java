package modelo;

import java.util.ArrayList;

public class Evento {

	private String nameEvent;
	private int edadMin;
	private ArrayList<Entrada> entradas = new ArrayList<>();
	private boolean enCurso;
	
	// constructor

	public Evento(String nameEvent, int edadMin, ArrayList<Entrada> entradas, boolean enCurso) {
			this.nameEvent = nameEvent;
			this.edadMin = edadMin;
			this.entradas = entradas;
			this.enCurso = enCurso;
		}

// luego de escribir atributos crear getters and setters
	public String getName() {
		return nameEvent;
	}

	public void setName(String nameEvent) {
		this.nameEvent = nameEvent;
	}

	public int getEdadMin() {
		return edadMin;
	}

	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}

	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}

	public boolean isEnCurso() {
		return enCurso;
	}

	public void setEnCurso(boolean enCurso) {
		this.enCurso = enCurso;
	}





	// metodos
	
	public void iniciarEvento() {
		enCurso = true;
	}
	
	public void agregarEntrada(Entrada entrada) { // agrega la entrada al arreglo
		this.entradas.add(entrada);
	}
	

	public void usarEntrada(int numAsiento) {
		for(Entrada enUso : this.entradas) {
			if (numAsiento == enUso.getNumAsiento()) 
			enUso.setUtilizada(true);
		}
	
		
		
	}

	
	
	

}
