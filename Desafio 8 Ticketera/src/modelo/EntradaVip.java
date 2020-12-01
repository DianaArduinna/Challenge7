package modelo;

public class EntradaVip extends Entrada {

	protected boolean regalo;

	public EntradaVip(int precio, int numAsiento, Cliente cliente, Vendedor vendedor, boolean utilizada,
			boolean regalo) {
		super(precio, numAsiento, cliente, vendedor, utilizada);
		this.regalo = regalo;
	}

	public boolean isRegalo() {
		return regalo;
	}

	public void setRegalo(boolean regalo) {
		this.regalo = regalo;
	}

	@Override
	public String toString() {
		return "Entrada [precio=" + precio + ", numAsiento=" + numAsiento + ", cliente=" + cliente + ", vendedor="
				+ vendedor + ", utilizada=" + utilizada + "+[regalo=" + regalo + "]";
	}

	
}
