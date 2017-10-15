package viewTest.interfaces;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import control.rules.ProdutoRules;
import model.Produto;

public interface IalterarProdutoVIew extends Runnable {
	
@Override
	default void run() {
		Scanner scanner = new Scanner(System.in);
		String opcaoAlterar = "";
		String opcaoCampo = "";
		String novoValorCampo = "";
		Produto produto = new Produto();
		List<Produto> listaProdutos = new ArrayList<>();
		while (!opcaoAlterar.equalsIgnoreCase("SAIR")) {
			opcaoAlterar = "";
			while (opcaoAlterar.isEmpty()) {
				System.out.println(
						"Por favor, digite o id do produto que deseja alterar, 'LISTAR' para listar todos "
								+ "ou 'SAIR' para sair");
				opcaoAlterar = scanner.nextLine();
			}
			switch (opcaoAlterar.toUpperCase()) {
			case "LISTAR":
				if (ProdutoRules.listarRule(produto) == true) {
					listaProdutos = ProdutoRules.listarDao(produto, "produto");
					System.out.println("Lista de produtos cadastrados");
					for (Produto produtolist : listaProdutos) {
						Field[] fields = produtolist.getClass().getDeclaredFields();
						System.out.println("Produto: " + produtolist.getNome());
						for (Field field : fields) {
							field.setAccessible(true);
							System.out.println(field.getName() + ": " + field.get(produtolist));
							field.setAccessible(false);
						}
						System.out.println("##################################");
					}
				} else { // ...

				}
				break;
			case "SAIR":
				break;
			default:
				if (ProdutoRules.pesquisarRule(produto, "id", opcaoAlterar) == true) {
					listaProdutos = ProdutoRules.pesquisarDao(produto, "id", opcaoAlterar);
					if (listaProdutos.size() != 0) {
						while (opcaoCampo.isEmpty()) {
							System.out.println("Digite o campo que deseja alterar");
							opcaoCampo = scanner.nextLine();
						}
						while (novoValorCampo.isEmpty()) {
							System.out.println("Digite o novo valor para o campo");
							novoValorCampo = scanner.nextLine();
						}
						for (Produto produtoFor : listaProdutos) {
							Field field = produtoFor.getClass().getDeclaredField(opcaoCampo);
							field.setAccessible(true);
							field.set(produtoFor, novoValorCampo);
							field.setAccessible(false);
							if (ProdutoRules.alterarRule(produtoFor) != null) {
								Long rows = ProdutoRules.alterarDao(produtoFor);
								System.out.println(rows + "Registros alterados com sucesso!");
							}
						}
					}
				} else {
					System.out.println("ID de Produto não localizado!");
				}
				scanner.close();
				break;
			}
		}
	}
}