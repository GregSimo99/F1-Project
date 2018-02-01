package Model;

import java.io.Serializable;

public class Città implements Serializable{
	private String nome;

	public Città(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
}
