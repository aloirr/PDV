package viewTest.interfaces;

import java.sql.SQLException;
import java.util.Scanner;

import control.rules.ProdutoRules;
import model.Produto;
import model.Produto.ProdutoBuilder;

public interface IcadastrarProdutoView extends Runnable {
	// nome, unidadeMedida, tipoEmbalagem, qtdPorEmbalagem, fornecedor,
	// armazem;
	@Override
	default void run() {
		Scanner scanner = new Scanner(System.in);
		Boolean confirmaCadastro = false;
		while (confirmaCadastro != true) {
			ProdutoBuilder produto = new Produto.ProdutoBuilder();
			System.out.println("Por favor digite o nome do produto");
			produto.nome(scanner.nextLine());
			System.out.println(
					"Por favor digite a unidade de medida unitaria (ML, L, GR, KG, UN) do produto");
			produto.unidadeMedida(scanner.nextLine());
			System.out.println(
					"Por favor digite tipo de embalagem do produto (CX, PCT, BB ou FD). Deixe em branco se "
							+ "o produto não for vendido por embalagem fechada.");
			produto.tipoEmbalagem(scanner.nextLine());
			System.out.println("Por favor digite a qtd por embalagem do produto");
			produto.qtdPorEmbalagem(Integer.parseInt(scanner.nextLine()));
			System.out.println("Por favor digite o fornecedor do produto. "
					+ "(Deixe em branco para produto de fabricação própria)");
			produto.fornecedor(scanner.nextLine());
			System.out.println(
					"Por favor digite em qual armazem será alocado o produto. (Deixe em branco caso deseje"
							+ " preencher depois)");
			produto.armazem(scanner.nextLine());
			if (ProdutoRules.cadastrarRule(produto.build()) != null) {
				confirmaCadastro = true;
				return ProdutoRules.cadastrarDao(produto.build());

			} else {
				System.out.println("Erro no cadastro! verifique as informações digitadas.");
			}
			scanner.close();
		}
		return null;
	}
}
