package viewTest.produtoView;

import control.rules.ProdutoRules;
import model.Produto;
import model.Produto.ProdutoBuilder;
import util.Iscanner;

public interface IcadastrarProdutoView extends Iscanner {
	// nome, unidadeMedida, tipoEmbalagem, qtdPorEmbalagem, fornecedor,
	// armazem;

	public static void run() {
		while (true) {
			ProdutoBuilder produto = new Produto.ProdutoBuilder();
			System.out.println("Por favor digite o nome do produto");
			produto.nome(Iscanner.nextLine());
			System.out.println(
					"Por favor digite a unidade de medida unitaria (ML, L, GR, KG, UN) do produto");
			produto.unidadeMedida(Iscanner.nextLine());
			System.out.println(
					"Por favor digite tipo de embalagem do produto (CX, PCT, BB ou FD). Deixe em branco se "
							+ "o produto não for vendido por embalagem fechada.");
			produto.tipoEmbalagem(Iscanner.nextLine());
			System.out.println("Por favor digite a qtd por embalagem do produto");
			produto.qtdPorEmbalagem(Integer.parseInt(Iscanner.nextLine()));
			System.out.println("Por favor digite o fornecedor do produto. "
					+ "(Deixe em branco para produto de fabricação própria)");
			produto.fornecedor(Iscanner.nextLine());
			System.out.println(
					"Por favor digite em qual armazem será alocado o produto. (Deixe em branco caso deseje"
							+ " preencher depois)");
			produto.armazem(Iscanner.nextLine());
			System.out.println(ProdutoRules.cadastrarRule(produto.build()));
			Iscanner.nextLine();
			break;
		}

	}
}