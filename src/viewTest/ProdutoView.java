package viewTest;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import control.dao.util.IpegaAtributosObjetos;
import control.rules.ProdutoRules;
import model.Produto;
import model.Produto.ProdutoBuilder;
import viewTest.interfaces.IalterarProdutoVIew;
import viewTest.interfaces.IcadastrarProdutoView;
import viewTest.interfaces.IconsultarProdutoVIew;
import viewTest.interfaces.IexcluirProdutoView;
import viewTest.interfaces.IlistarProdutosView;

public class ProdutoView implements IcadastrarProdutoView,IconsultarProdutoVIew,IalterarProdutoVIew,IexcluirProdutoView,IlistarProdutosView {
	static Scanner scanner = new Scanner(System.in);

	public void menuProduto() throws SQLException, IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException {
		String opcao = "";
		while (opcao != "0") {
			System.out.println("Menu de produtos);\n" + "1) Cadastrar;\n" + "2) Consultar;\n"
					+ "3) Alterar;\n" + "4) Excluir:\n" + "5) Listar:\n"
					+ "6) Imprimir relação de produtos cadastrados\n" + "0) Sair do menu");
			opcao = scanner.nextLine();
			switch (opcao) {
			case "1":
				IcadastrarProdutoView.cadastrarProdutoView();
				break;
			case "2":
				IconsultarProdutoView.consultarProdutoView();
				break;
			case "3":
				alterarProdutoView();
				break;
			case "4":
				excluirProdutoView();
				break;
			case "5":
				listarProdutoView();
				break;
			case "6":
				// ImprimirProdutosView();
				break;
			case "0":
				opcao = "0";
				break;
			default:
				System.out.println("Opção inválida! tente novamente!");
				break;
			}
		}

	}

	

	

	