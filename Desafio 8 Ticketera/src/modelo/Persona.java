package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {

	protected String name;
	protected String fechaDeNacimiento;
	protected String rut;

	public Persona(String name, String fechaDeNacimiento, String rut) {
		super();
		this.name = name;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.rut = rut;

	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
	//end of getters and Setters

	// metodo edad

	public int calcularEdad() {

		LocalDate obj = LocalDate.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // esto sirve para formatear

		String fechaActual = obj.format(myFormatObj);

		String anioActual = fechaActual.substring(6, 10);
		String yOb = this.fechaDeNacimiento.substring(6, 10);
		String mActual = fechaActual.substring(3, 5);
		String mNacimiento = this.fechaDeNacimiento.substring(3, 5);

		int anios = Integer.parseInt(anioActual) - Integer.parseInt(yOb);
		int meses = Integer.parseInt(mActual) - Integer.parseInt(mNacimiento);

		int edad;
		if (meses > 0) {
			edad = anios;
		} else {
			edad = anios - 1;
		}
		return edad;
	}
}
