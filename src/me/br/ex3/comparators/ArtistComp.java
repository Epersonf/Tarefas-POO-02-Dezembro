package me.br.ex3.comparators;

import java.util.Comparator;

import me.br.ex3.Song;

public class ArtistComp implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {
		return -o1.getArtist().compareTo(o2.getArtist());
	}
}
