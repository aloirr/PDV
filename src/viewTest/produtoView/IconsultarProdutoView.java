package viewTest.produtoView;

import java.lang.reflect.Field;
import java.util.List;

import control.dao.util.IpegaAtributosObjetos;
import control.rules.ProdutoRules;
import model.Produto;
import util.Iscanner;

public interface IconsultarProdutoView extends Iscanner {

	static public void run() {
		try {
			String atributoWhere = "0", stringPequisa = "";
			Produto produto = new Produto();
			List<String> listaAtrib = IpegaAtributosObjetos.Lista(produto);
			int count = 1;
			while (true) {
				atributoWhere = "";
				while (!listaAtrib.contains(atributoWhere)) {

					count = 1;
					System.out.println("Por favor, digite o nome do campo do produto "
							+ "que deseja usar como critério de pesquisa "
							+ "ou digite SAIR para retornar ao menu principal");
					for (String atrib : listaAtrib) {
						System.out.println(count + ")" + atrib);
						count++;
					}
					atributoWhere = Iscanner.nextLine();
					if (atributoWhere.equalsIgnoreCase("sair")) {
						break;
					}
					System.out.println(atributoWhere);
					System.out.println(listaAtrib.contains(atributoWhere));
					System.out.println(atributoWhere.equalsIgnoreCase("sair"));
				}
				if (atributoWhere.equalsIgnoreCase("sair")) {
					break;
				}
				while (stringPequisa.isEmpty()) {
					System.out.println(
							"Por favor, digite o parametro de pesquisa do produto que deseja encontrar");
					stringPequisa = Iscanner.nextLine();
				}
				for (Produto produtoFor : ProdutoRules.pesquisarRule(produto, atributoWhere,
						stringPequisa)) {
					for (Field field : produtoFor.getClass().getDeclaredFields()) {
						field.setAccessible(true);
						System.out.println(field.getName() + ": " + field.get(produtoFor));
						field.setAccessible(false);

					}
					System.out.println("#######################");

				}
				Iscanner.nextLine();

			}

		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();

		}
	}
}
