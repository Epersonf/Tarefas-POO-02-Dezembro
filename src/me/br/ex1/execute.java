package me.br.ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class execute {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu texto: ");
		String text = scan.nextLine();
		
		HashMap<String, Integer> words = getRepetition(text);
		
		Iterator<Entry<String, Integer>> it = words.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry) it.next();
	        System.out.println(pair.getKey() + " - " + pair.getValue());
	        it.remove();
	    }
		
		scan.close();
	}
	
	public static HashMap<String, Integer> getRepetition(String text) {
		String[] words = text.split(" ");
		
		HashMap<String, Integer> toReturn = new HashMap<String, Integer>();
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i].replace(",", "").replace(".", "").replace(";", "").toUpperCase();
			
			if (toReturn.containsKey(word)) {
				toReturn.put(word, toReturn.get(word) + 1);
			} else {
				toReturn.put(word, 1);
			}
		}
		
		return toReturn;
	}
}
