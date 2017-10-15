package viewTest.interfaces;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import control.rules.ProdutoRules;
import model.Produto;

public interface IexcluirProdutoView extends Runnable {
	@Override
	public default void run() {
		Scanner scanner = new Scanner(System.in);
		String opcaoExcluir = "";
		Produto produto = new Produto();
		List<Produto> listaProdutos = new ArrayList<>();
		while (!opcaoExcluir.equalsIgnoreCase("SAIR")) {
			opcaoExcluir = "";
			while (opcaoExcluir.isEmpty()) {
				System.out.println(
						"Por favor, digite o id do produto que deseja excluir, 'LISTAR' para listar todos "
								+ "ou 'SAIR' para sair");
				opcaoExcluir = scanner.nextLine();
			}
			switch (opcaoExcluir.toUpperCase()) {
			case "LISTAR":
				try {
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
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
						| SecurityException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "SAIR":
				break;
			default:
				if (ProdutoRules.deletarRule(opcaoExcluir) == true) {
					Long rows = ProdutoRules.deletarDao(opcaoExcluir);
					if (rows != 0) {
						System.out.println("Excluido(s): " + rows + " registro(s)!");

					} else {
						System.out.println("ID de Produto não localizado!");
					}
					break;
				}

			}
		}
		scanner.close();
	}

}
