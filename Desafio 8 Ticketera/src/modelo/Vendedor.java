package modelo;

public class Vendedor extends Persona {
	
	private int entradasVendidas;
	private int entradasVipVendidas;
	
	public Vendedor(String name, String fechaDeNacimiento, String rut, int entradasVendidas, int entradasVipVendidas) {
		super(name, fechaDeNacimiento, rut);
		this.entradasVendidas = entradasVendidas;
		this.setEntradasVipVendidas(entradasVipVendidas);
		
	}

	public int getEntradasVendidas() {
		return entradasVendidas;
	}

	public void setEntradasVendidas(int entradasVendidas) {
		this.entradasVendidas = entradasVendidas;
	}

	public int getEntradasVipVendidas() {
		return entradasVipVendidas;
	}

	public void setEntradasVipVendidas(int entradasVipVendidas) {
		this.entradasVipVendidas = entradasVipVendidas;
	}

	
	

}
