package me.br.ex3;

import java.util.PriorityQueue;

public class SongQueue {	
	private PriorityQueue<Song> songs;
	
	public SongQueue() {
		songs = new PriorityQueue<Song>();
	}
	
	public PriorityQueue<Song> getSongList() {
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
