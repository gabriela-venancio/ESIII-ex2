package model;

public class ProdArmazenamento {

	private TipoProdArmazenamento tipo;
	private int capacidade;
	private String fabricante;
	private double valor;
	
	
	
	public TipoProdArmazenamento getTipo() {
		return tipo;
	}
	public void setTipo(TipoProdArmazenamento tipo) {
		this.tipo = tipo;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "ProdArmazenamento [tipo=" + tipo + ", capacidade=" + capacidade + ", fabricante=" + fabricante
				+ ", valor=" + valor + "]";
	}
	
	
	
	
}
