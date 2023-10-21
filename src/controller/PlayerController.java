package controller;

import java.util.Iterator;

import bilbioteca.fila.dinamica.generica.model.Lista;
import model.Musica;

public class PlayerController {

	
	public void adicionaMusica(Lista lista,String musica) throws Exception {
		Musica Musicas = new Musica();
		String array[] = new String[3];
		array = musica.split(";");
		Musicas.nome = array[0];
		Musicas.nomeArtista = array[1];
		Musicas.duracao = Integer.parseInt(array[2]);
		if(lista.isEmpty()) {
			lista.addFirst(Musicas);
			
		}else {
			lista.addLast(Musicas);
			
		}
		
	}
	
	public void removeMusica(Lista lista, int posicao) throws Exception {
	
		if (lista.isEmpty()) {
			throw new Exception("Lista vazia");
		}else {
			lista.remove(posicao);
		}
	}
	
	public void executaPlaylist(Lista lista) throws Exception {
		if (lista.isEmpty()) {
			throw new Exception("Lista vazia");
		}else {
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
				Thread.sleep(1000);
			}
		}
	}
}
