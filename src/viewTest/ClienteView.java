package viewTest;

import java.sql.SQLException;
import java.util.Scanner;

import control.dao.ClienteDAO;
import control.rules.ClienteRules;
import model.Cliente;
import model.Cliente.ClienteBuilder;

public class ClienteView {

	public void menuProduto() {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 0) {
			System.out.println(
					"Menu de produtos);\n" + "1) Cadastrar;\n" + "2) Consultar;\n" + "3) Alterar;\n" + "4) Excluir:\n"
							+ "5) Listar:\n" + "6) Imprimir relação de produtos cadastrados\n" + "0)Sair do menu");
			opcao = Integer.parseInt(scanner.nextLine());
			switch (opcao) {
			case 1:
				return cadastrarProdutoView();
				break;
			case 2:
				return consultarProdutoView();
				break;
			case 3:
				return alterarProdutoView();
				break;
			case 4:
				return excluirProdutoView();
			case 5:
				return listarProdutoView();
			case 6:
				return ImprimirProdutosView();
			case 0:
				break;
			default:
				System.out.println("Opção inválida! tente novamente!");
				break;
			}
		}
		scanner.close();
	}

	public void cadastrarClienteView() throws SQLException {
		Boolean confirmaCadastro = null;
		Scanner scanner = new Scanner(System.in);
		while (confirmaCadastro != true) {
			ClienteBuilder cliente = new Cliente.ClienteBuilder();
			System.out.println("Por favor digite o cnpj do cliente (deixe em branco para PF)");
			cliente.cnpj(scanner.nextLine());
			System.out.println("Por favor digite o cpf do cliente(deixe em branco para PJ");
			cliente.cpf(scanner.nextLine());
			System.out.println("Por favor digite o Razãoo social do cliente");
			cliente.razaoSocial(scanner.nextLine());
			System.out.println("Por favor digite o Nome fantasia do cliente");
			cliente.nomeFantasia(scanner.nextLine());
			System.out.println("Por favor digite o Endereço do cliente");
			cliente.endereco(scanner.nextLine());
			System.out.println("Por favor digite o Telefone do cliente");
			cliente.telefone(scanner.nextLine());
			System.out.println("Por favor digite o Nome do represetante do cliente");
			cliente.nomeContato(scanner.nextLine());
			System.out.println("Por favor digite o Inscrição estadual do cliente");
			cliente.inscEstadual(scanner.nextLine());
			System.out.println("Por favor digite o Inscrição Municipal do cliente");
			cliente.inscMunic(scanner.nextLine());
			System.out.println("Por favor digite o Inscrição Suframa do cliente");
			cliente.inscSuframa(scanner.nextLine());
			System.out.println("Por favor digite o Prazo do cliente");
			cliente.prazo(scanner.nextLine());
			System.out.println("Por favor digite o email do cliente");
			cliente.email(scanner.nextLine());
			if (ClienteRules.cadastrarRule(cliente.build()) != null) {
				ClienteRules.cadastrarDao(cliente.build());
				confirmaCadastro = true;
			} else {
				System.out.println("Erro no cadastro! verifique as informações digitadas.");
			}
		}
		scanner.close();
	}
}
