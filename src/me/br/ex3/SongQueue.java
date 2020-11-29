package me.br.ex3;

import java.util.LinkedList;

public class SongQueue {	
	private LinkedList<Song> songs;
	
	public SongQueue() {
		songs = new LinkedList<Song>();
	}
	
	public LinkedList<Song> getSongList() {
		return songs;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public Song skip() {
		return songs.poll();
	}
	
	public void remove(Song s) {
		songs.remove(s);
	}
	
}
