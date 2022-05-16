package model;

import java.util.ArrayList;
import java.util.List;

public class ProdutosBuilder {

	Produto produto;
	List<Calcado> calcados = new ArrayList<>();
	List<Camiseta> camisetas = new ArrayList<>();
	List<Jogos> jogosEletronicos = new ArrayList<>();
	List<ProdArmazenamento> produtos_Arm = new ArrayList<>();
	
	
	public ProdutosBuilder() {
		this.produto = new Produto();
	}
	
	
	public static ProdutosBuilder builder() {
		return new ProdutosBuilder();
	}
	
	
	public ProdutosBuilder addCalcado(TipoCalcado tipo, TamanhoCalcado tamanho, String cor, double valor) {
		Calcado c = new Calcado();
		c.setCor(cor);
		c.setTamanhoCalcado(tamanho);
		c.setTipo(tipo);
		this.calcados.add(c);
		return this;
	}
	
	public ProdutosBuilder addCamiseta( TamanhoRoupa tamanho, String cor, String marca, double valor) {
		Camiseta cm = new Camiseta();
		cm.setTamanho(tamanho);
		cm.setCor(cor);
		cm.setMarca(marca);
		cm.setValor(valor);
		this.camisetas.add(cm);
		return this;
	}
	
	public ProdutosBuilder addJogos (String nome, VideoGame videogame, double valor) {
		Jogos j = new Jogos();
		j.setNome(nome);
		j.setValor(valor);
		j.setVideogame(videogame);
		this.jogosEletronicos.add(j);
		return this;
	}
	
	public ProdutosBuilder addProdArmazenamento(TipoProdArmazenamento tipo, int capacidade, String fabricante, double valor) {
		ProdArmazenamento p = new ProdArmazenamento();
		p.setTipo(tipo);
		p.setCapacidade(capacidade);
		p.setFabricante(fabricante);
		p.setValor(valor);
		this.produtos_Arm.add(p);
		return this;
	}
	
	public Produto getProdutos() {
			this.produto.setCalcado(this.calcados);
			this.produto.setCamiseta(this.camisetas);
			this.produto.setJogos(this.jogosEletronicos);
			this.produto.setProdArmazenamento(this.produtos_Arm);
		
		return this.produto;
	
	}
	
	
}
