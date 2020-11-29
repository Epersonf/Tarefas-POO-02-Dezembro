package me.br.ex3.comparators;

import java.util.Comparator;

import me.br.ex3.Song;

public class NameComp implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {
		return -o1.getName().compareTo(o2.getName());
	}
	
}
