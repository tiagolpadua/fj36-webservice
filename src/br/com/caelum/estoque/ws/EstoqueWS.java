package br.com.caelum.estoque.ws;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@ApplicationScoped
public class EstoqueWS {
	// simulando um repositorio ou banco de dados
	private Map<String, ItemEstoque> repositorio = new HashMap<>();

	public EstoqueWS() {
		System.out.println("EstoqueWS");
		// populando alguns dados, mapeando codigo para quantidade
		repositorio.put("SOA", new ItemEstoque("SOA", 5));
		repositorio.put("TDD", new ItemEstoque("TDD", 1));
		repositorio.put("RES", new ItemEstoque("RES", 2));
		repositorio.put("LOG", new ItemEstoque("LOG", 4));
		repositorio.put("WEB", new ItemEstoque("WEB", 1));
		repositorio.put("ARQ", new ItemEstoque("ARQ", 2));
	}

	@WebMethod
	public ItemEstoque getQuantidade(String codigo) {
		System.out.println(repositorio);
		return repositorio.get(codigo);
	}
	
	@WebMethod
	public void setQuantidade(String codigo, int quantidade) {
		repositorio.put(codigo, new ItemEstoque(codigo, quantidade));
		System.out.println(repositorio);
	}
}
