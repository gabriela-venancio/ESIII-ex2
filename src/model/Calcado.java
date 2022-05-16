package model;

public class Calcado {

	private TamanhoCalcado tamanho;
	private String cor;
	private TipoCalcado tipo;
	private double valor;
	
	
	
	public TamanhoCalcado getTamanhoCalcado() {
		return tamanho;
	}
	
	public void setTamanhoCalcado(TamanhoCalcado tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public TipoCalcado getTipo() {
		return tipo;
	}

	public void setTipo(TipoCalcado tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "[" + tamanho + ", cor=" + cor + ", tipo=" + tipo + ", valor=" + valor + "]";
	}
	
	
	
}
