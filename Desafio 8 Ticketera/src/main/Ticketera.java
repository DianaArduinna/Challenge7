package main;

import modelo.Evento;
import modelo.Entrada;
import modelo.EntradaVip;
import modelo.Vendedor;

import java.util.ArrayList;

import modelo.Cliente;

public class Ticketera {

	public static void main(String[] args) {

		System.out.println("*********** Bienvenido ***********");
		System.out.println("Cargando clientes y vendedor...");
		System.out.println("----------------------------------");
		Evento evento = new Evento("The Science Cult", 18, new ArrayList<Entrada>(), false);

		System.out.println(
				"Se ha creado el evento " + evento.getName() + " para mayores de " + evento.getEdadMin() + " anios");
		System.out.println("-----------------------------------");

		// Crear Cliente
		// String name, String fechaDeNacimiento, String rut
		Cliente cliente = new Cliente("Elba Zurita", "22/01/1973", "12.000.001-7");
		Cliente cliente1 = new Cliente("Pedro Prado", "13/04/1986", "16.999.001-2");

		// Crear Vendedor
		// String name, String fechaDeNacimiento, String rut, int entradasVendidas, int
		// entradasVipVendidas
		Vendedor vendedor = new Vendedor("Carlos Mora", "03/10/1998", "18.001.001-2", 0, 0);

		// metodo que compara edad
		boolean ingresa = compararEdad(evento.getEdadMin(), cliente.calcularEdad());

		try {

			if (ingresa) {

				// instanciamos entradas
				Entrada entrada1 = new Entrada(5000, 0, cliente, vendedor, false);
				Entrada entrada2 = new EntradaVip(8500, 1, cliente, vendedor, false, false);

				// evento.setEntradas(evento.getEntradas().add(entrada1));

				evento.agregarEntrada(entrada1);
				vendedor.setEntradasVendidas(vendedor.getEntradasVendidas() + 1);
				System.out.println(
						"Se agrego exitosamente entrada para " + cliente.getName() + " Rut: " + cliente.getRut());
				System.out.println("Vendida por: " + vendedor.getName());
				System.out.println("-----------------------------------");

				evento.agregarEntrada(entrada2);
				vendedor.setEntradasVipVendidas(vendedor.getEntradasVipVendidas()+1);
				System.out.println("Se agrego exitosamente entrada Vip para " +cliente1.getName()+ " Rut: " + cliente1.getRut() );
				System.out.println("-----------------------------------");

			} else {
				System.out.println("La persona no cumple con la edad minima requerida para el evento");
			}

		} catch (Exception e) {
			System.out.println("We are sorry, there was an error");

		}

		evento.setEnCurso(true);

		if (evento.getEntradas().get(0).isUtilizada() == false) {
			if (evento.isEnCurso() == true) {
				evento.usarEntrada(evento.getEntradas().get(0).getNumAsiento());
				System.out.println("Su entrada es valida.\n El evento esta en curso, Bienvenido");

			} else {
				System.out.println("El evento no esta en curso, verifique la fecha del evento. ");
			}
		}

		else {
			System.out.println("Su entrada ya ha sido utilizada.");
		}
		
		System.out.println("-----------------------------------");
		System.out.println("Vendedor "+vendedor.getName());
		System.out.print("La cantidad de entradas vendidas son : "+vendedor.getEntradasVendidas()+"\n");
		System.out.print("La cantidad de entradas Vip vendidas son : "+vendedor.getEntradasVipVendidas());
		System.out.println("\n-----------------------------------");
		
	}

	// ------------metodo----------------

	public static boolean compararEdad(int edadIngreso, int edadCliente) {

		boolean ingresa = false;
		ingresa = (edadCliente >= edadIngreso);

		return ingresa;
	}


}
