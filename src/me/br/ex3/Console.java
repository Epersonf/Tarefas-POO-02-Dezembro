package me.br.ex3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import me.br.ex3.comparators.ArtistComp;
import me.br.ex3.comparators.NameComp;

public class Console {
	
	private int stage = 0;
	private int substage = 1;
	
	Scanner scan;
	
	public Console() {
		scan = new Scanner(System.in);
	}
	
	public boolean draw() {
		int i;
		
		switch (stage) {
			case 0:
				System.out.println("1 - Procurar musica\n2 - Mostrar fila\n3 - Passar tempo\n4 - Escolher musica\n5 - Criar musica");
				stage = scan.nextInt();
				break;
			case 1:
				System.out.println("1 - Listar por nome da musica\n2 - Listar por artista");
				substage = scan.nextInt();
				stage = 4;
				break;
			case 2:
				if (Karaoke.songQueue.getSongList().size() > 0) {
					System.out.println("Mostrando fila: ");
					i = 1;
					for (Song s : Karaoke.songQueue.getSongList()) {
						System.out.println(i + " - '" + s.getName() + "' de '" + s.getArtist() + "'");
						i++;
					}
				} else System.out.println("Sem musicas na fila :(");
				stage = 0;
				break;
			case 3:
				if (Karaoke.songQueue.getSongList().size() > 0) {
					System.out.println("Musica " + Karaoke.songQueue.getSongList().element().getName() + " terminou.");
					Karaoke.songQueue.skip();
					if (Karaoke.songQueue.getSongList().size() > 0)
						System.out.println("Tocando agora: " + Karaoke.songQueue.getSongList().element().getName());
				} else System.out.println("Nao ha musicas na fila...");
				stage = 0;
				break;
			case 4:
				if (Karaoke.existentSongs.size() <= 0) {System.out.println("Adicione uma musica antes...");stage = 0; break;}
				TreeSet<Song> songs = new TreeSet<Song>((substage == 1) ? new ArtistComp() : new NameComp());
				for (Song s : Karaoke.existentSongs) {
					songs.add(s);
				}
				ArrayList<Song> songs_ = new ArrayList<Song>();
				i = 1;
				for (Song s : songs) {
					System.out.println(i + " - '" + s.getName() + "' de '" + s.getArtist() + "'");
					i++;
					songs_.add(s);
				}
				
				System.out.println("Digite um id para a musica: (-1 = nenhuma)");
				int id = scan.nextInt();
				if (id != -1) {
					Song toAdd = songs_.get(id - 1);
					Karaoke.songQueue.addSong(toAdd);
					System.out.println("Musica " + toAdd.getName() + " adicionada a fila.");
				}
				stage = 0;
				break;
			case 5:
				System.out.println("Digite o nome da musica:");
				String name = scan.next();
				System.out.println("Digite o nome do artista:");
				String artist = scan.next();
				Karaoke.existentSongs.add(new Song(name, artist));
				stage = 0;
				break;
			default:
				scan.close();
				return false;
		}
		
		return true;
	}
	
}
