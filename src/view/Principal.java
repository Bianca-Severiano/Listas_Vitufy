package view;

import javax.swing.JOptionPane;

import bilbioteca.fila.dinamica.generica.model.Lista;
import controller.PlayerController;
import model.Musica;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista<Musica> listaMusical = new Lista<>();
		PlayerController controller = new PlayerController();
		String musica = "";
		int posicao;
		int r = 0;
		do {
			r = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1 - Adicionar Musica \n 2 - Remover uma música \n 3 - Reproduzir PlayList \n 9 - Sair"));
			switch (r) {
			case 1: 
				musica = JOptionPane.showInputDialog("Nome da Música: ");
				musica = musica + ";" + JOptionPane.showInputDialog("Nome da artistista: ");
				musica = musica + ";" + JOptionPane.showInputDialog("Duração da canção: ");
				controller.adicionaMusica(listaMusical, musica);
				break;
			 case 2:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Numero da música que deseja remover da lista: "));
				controller.removeMusica(listaMusical, posicao);
				break;
			
			 case 3:
				 controller.executaPlaylist(listaMusical);
				 break;
			 case 9:
				 System.out.println("Saindo...");
				 break;
			 default:
				throw new IllegalArgumentException("Unexpected value: " + r);
			}
			
		
		} while (r != 9);

	}

}
