package me.br.ex3;

import java.util.ArrayList;

public class Karaoke {
	
	public static ArrayList<Song> existentSongs;	
	public static Console console;
	public static SongQueue songQueue;
	
	public static void main(String[] args) {
		existentSongs = new ArrayList<Song>();
		console = new Console();
		songQueue = new SongQueue();
		
		while (console.draw()) {
			System.out.println("-------------------------");
		}
	}
	
}
