package viewTest.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import control.dao.util.IpegaAtributosObjetos;
import control.rules.ProdutoRules;
import model.Produto;

public interface IconsultarProdutoVIew {

static	public List<Produto> consultarProdutoView() throws SQLException {
	Scanner scanner = new Scanner(System.in);
		List<Produto> produtoResult = new ArrayList<>();
		String atributoWhere = "0", stringPequisa = "";
		Produto produto = new Produto();
		List<String> listaAtrib = IpegaAtributosObjetos.Lista(produto);
		int count = 1;
		while (produtoResult.isEmpty()) {
			while (Integer.parseInt(atributoWhere) > count || Integer.parseInt(atributoWhere) == 0
					|| atributoWhere.isEmpty()) {
				System.out.println(
						"Por favor, digite o número do campo do produto que deseja usar como critéiro de pesquisa");
				for (String atrib : listaAtrib) {
					System.out.println(count + ")" + atrib);
					count++;
				}
				atributoWhere = scanner.nextLine();
			}
			atributoWhere = listaAtrib.get(Integer.parseInt(atributoWhere) - 1);
			while (stringPequisa.isEmpty()) {
				System.out.println(
						"Por favor, digite o parametro de pesquisa do produto que deseja encontrar");
				stringPequisa = scanner.nextLine();
			}
			if (ProdutoRules.pesquisarRule(produto, atributoWhere, stringPequisa) == true) {
				produtoResult = ProdutoRules.pesquisarDao(produto, atributoWhere, stringPequisa);
				produtoResult.stream().map(p -> p.getNome()).forEach(System.out::println);
				scanner.nextLine();
				return produtoResult;
			} else {
				System.out.println(
						"Produto não encontrado! verifique novamente as informações digitadas.");
			}
			scanner.close();
		}
		
		return produtoResult;
	}

}
