package desafio_banco_java;

import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;

	public List<Conta> getContas() {
		return contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
