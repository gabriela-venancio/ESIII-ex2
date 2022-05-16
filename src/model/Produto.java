package model;

import java.util.ArrayList;
import java.util.List;



public class Produto {
	
	private List<Camiseta> camiseta = new ArrayList<>();
	private List<Calcado> calcado = new ArrayList<>();
	private List<Jogos> jogos = new ArrayList<>();
	private List<ProdArmazenamento> prodArmazenamento = new ArrayList<>();
	
	
	public List<Camiseta> getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(List<Camiseta> camiseta) {
		this.camiseta = camiseta;
	}
	public List<Calcado> getCalcado() {
		return calcado;
	}
	public void setCalcado(List<Calcado> calcado) {
		this.calcado = calcado;
	}
	public List<Jogos> getJogos() {
		return jogos;
	}
	public void setJogos(List<Jogos> jogos) {
		this.jogos = jogos;
	}
	public List<ProdArmazenamento> getProdArmazenamento() {
		return prodArmazenamento;
	}
	public void setProdArmazenamento(List<ProdArmazenamento> prodArmazenamento) {
		this.prodArmazenamento = prodArmazenamento;
	}
	
	@Override
	public String toString() {
		return "Produtos:  \ncamisetas===>" + camiseta + ", \ncalcados====>" + calcado + ", \njogos====>" + jogos + ", \nprodArmazenamento====>"
				+ prodArmazenamento + "]";
	}
	
	
	
}
