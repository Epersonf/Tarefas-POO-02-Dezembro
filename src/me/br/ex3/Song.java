package me.br.ex3;

public class Song {
	private String name;
	private String artist;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public Song(String name, String artist) {
		this.name = name;
		this.artist = artist;
	}
}
