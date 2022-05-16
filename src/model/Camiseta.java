package model;

public class Camiseta {
	
	private TamanhoRoupa tamanho;
	private String cor;
	private String marca;
	private double valor;
	public TamanhoRoupa getTamanho() {
		return tamanho;
	}
	public void setTamanho(TamanhoRoupa tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Camiseta [tamanho=" + tamanho + ", cor=" + cor + ", marca=" + marca + ", valor=" + valor + "]";
	}
	
	
	
}
