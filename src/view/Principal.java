package view;

import model.Produto;
import model.ProdutosBuilder;
import model.TamanhoCalcado;
import model.TamanhoRoupa;
import model.TipoCalcado;
import model.TipoProdArmazenamento;
import model.VideoGame;

public class Principal {

	
	
	
	public static void main(String[] args) {

		//List<Produto> produtos = new ArrayList<Produto>();
		Produto produto = ProdutosBuilder.builder()
		.addCalcado(TipoCalcado.SOCIAL, TamanhoCalcado.TAMANHO35, "Marrom", 200.00)
		.addCalcado(TipoCalcado.TENIS, TamanhoCalcado.TAMANHO37, "Preto", 500.00)
		.addCalcado(TipoCalcado.SOCIAL, TamanhoCalcado.TAMANHO39, "preto", 220.00)
		.addCamiseta(TamanhoRoupa.P, "Branca", "Adidas", 70.00)
		.addCamiseta(TamanhoRoupa.M, "Azul", "Nike", 60.00)
		.addCamiseta(TamanhoRoupa.G, "Verde", "Oakley", 80.00)
		.addJogos("GTA 5", VideoGame.PLAYSTATION, 90.00)
		.addJogos("The Witcher III", VideoGame.PLAYSTATION, 60.00)
		.addJogos("Horizon Zero Down", VideoGame.XBOX, 90.00)
		.addProdArmazenamento(TipoProdArmazenamento.HDD, 1024, "Samsung", 300.00)
		.addProdArmazenamento(TipoProdArmazenamento.SSD, 256, "Kingston", 300.00)
		.addProdArmazenamento(TipoProdArmazenamento.HDD, 1024, "Western Digital", 280.00)
		.getProdutos();
		
		System.out.println(produto.toString());
	}

}
