package viewTest;

import java.sql.SQLException;
import java.util.List;

import control.dao.GenericCRUD;
import control.dao.util.IpegaAtributosObjetos;
import control.estoque.Estoque;
import model.Cliente;
import util.IimprimeListaConsole;
import util.IordenarClientes;

public class Main implements IpegaAtributosObjetos, IordenarClientes {
	public static void main(String[] args) throws SQLException, IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException, InterruptedException {
		// Cliente cliente = new
		Cliente cliente2 = new Cliente.ClienteBuilder().razaoSocial("planeta")
				.nomeFantasia("planeta").email("a@b.c").inscEstadual("55555").inscMunic("333333")
				.inscSuframa("12345").nomeContato("ppk").endereco("ggggg").telefone("99999999")
				.prazo("3060").build();
		Cliente cliente3 = new Cliente.ClienteBuilder().razaoSocial("satelite")
				.nomeFantasia("satelite").email("a@b.c").inscEstadual("55555").inscMunic("333333")
				.inscSuframa("12345").nomeContato("ppk").endereco("hhhhh").telefone("99999999")
				.prazo("3060").build();
		Cliente cliente4 = new Cliente.ClienteBuilder().razaoSocial("nuvem").nomeFantasia("nuvem")
				.email("a@b.c").inscEstadual("55555").inscMunic("333333").inscSuframa("12345")
				.nomeContato("ppk").endereco("iiiiii").telefone("99999999").prazo("3060").build();
		Cliente cliente5 = new Cliente.ClienteBuilder().razaoSocial("galaxia")
				.nomeFantasia("galaxia").email("a@b.c").inscEstadual("55555").inscMunic("333333")
				.inscSuframa("12345").nomeContato("ppk").endereco("zzzzz").telefone("99999999")
				.prazo("3060").build();
		Cliente cliente6 = new Cliente.ClienteBuilder().razaoSocial("universo")
				.nomeFantasia("universo").email("a@b.c").inscEstadual("55555").inscMunic("333333")
				.inscSuframa("12345").nomeContato("ppk").endereco("aaaaaa").telefone("99999999")
				.prazo("3060").build();
		// // INSERINDO COM O ClienteDAO
		// GenericCRUD.insert(cliente, "clientes");
		GenericCRUD.insert(cliente2, "clientes");
		GenericCRUD.insert(cliente3, "clientes");
		GenericCRUD.insert(cliente4, "clientes");
		GenericCRUD.insert(cliente5, "clientes");
		GenericCRUD.insert(cliente6, "clientes");
		// //
		// //
		// // USANDO O SELECT do ClienteDAO
		Cliente clienteselect = new Cliente();
		// List<Cliente> clientes = GenericCRUD.read(clienteselect, "clientes",
		// "razaoSocial", "%a%");
		List<Cliente> clientes = GenericCRUD.readAll(clienteselect, "clientes");
		// "aloha").toString());
		// // // USANDO O UPDATE DO ClienteDAO
		// cliente2.setCnpj("24242424");
		// cliente2.setId("20");
		// GenericCRUD.update(cliente2, "clientes");
		//
		// // // USANDO O DELETE DO ClienteDAO
		// cliente6.setId("21");
		// GenericCRUD.delete("clientes", "razaoSocial='galaxia'");
		// ProdutoView produtoview = new ProdutoView();
		// produtoview.menuProduto();
		// ClienteView clienteview = new ClienteView();
		// clienteview.menuCliente();
//		System.out.println(clientes.size());
//		IordenarClientes.ordenarClientesPorAtributo(clientes, "razaoSocial");
		Estoque estoque = new Estoque();
		IimprimeListaConsole.imprimeListaConsole(estoque.mapaEstoquePorArmazem("a"));

		// IordenarClientes.ordenarClientesPorAtributo(clientes, "endereco");
//		for (Cliente cliente : clientes) {
//			System.out.println(
//					cliente.getId() + " " + cliente.getRazaoSocial() + " " + cliente.getEndereco());
//		}
	}
}