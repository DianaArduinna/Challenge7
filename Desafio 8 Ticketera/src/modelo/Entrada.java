package modelo;

public class Entrada {

	@Override
	public String toString() {
		return "Entrada [precio=" + precio + ", numAsiento=" + numAsiento + ", cliente=" + cliente + ", vendedor="
				+ vendedor + ", utilizada=" + utilizada + "]";
	}

	protected int precio;
	protected int numAsiento;
	protected Cliente cliente;
	protected Vendedor vendedor;
	protected boolean utilizada;
	
	public Entrada(int precio, int numAsiento, Cliente cliente, Vendedor vendedor, boolean utilizada) {
		this.precio = precio;
		this.numAsiento = numAsiento;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.utilizada = utilizada;
	}

	public boolean isUtilizada() {
		return utilizada;
	}

	public void setUtilizada(boolean utilizada) {
		this.utilizada = utilizada;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


}
