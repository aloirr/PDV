package viewTest.interfaces;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import control.rules.ProdutoRules;
import model.Produto;

public interface IlistarProdutosView extends Runnable {
	@Override
	public default void run() {
		Scanner scanner = new Scanner(System.in);
		Produto produto = new Produto();
		try {
			if (ProdutoRules.listarRule(produto) == true) {
				List<Produto> listaProdutos = ProdutoRules.listarDao(produto, "produto");
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
		scanner.nextLine();
		scanner.close();
	}
}
