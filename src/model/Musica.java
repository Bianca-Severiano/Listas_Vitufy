package model;

public class Musica {
	public String nome;
	public String nomeArtista;
	public int duracao;

	public Musica() {
		super();
	}

	public Musica(String nome, String nomeArtista, int duracao) {
		this.nome = nome;
		this.nomeArtista = nomeArtista;
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "nome=" + nome + " nomeArtista=" + nomeArtista + " duracao=" + duracao + "min";
	}
	
	

}
