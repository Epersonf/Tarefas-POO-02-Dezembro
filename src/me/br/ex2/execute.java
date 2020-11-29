package me.br.ex2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class execute {
	
	/*
	 * 
	 * Ainda que todos os Collections contenham as mesmas strings,
	 * você deve vê-los sendo exibidos em ordens diferentes em alguns deles.
	 * Por quê? 
	 * 
	 * Isso acontece pois a ordem depende da estrutura de dados adotada, além disso, as collections do tipo
	 * SET nao permitem repeticao, pois funcionam como conjuntos matematicos.
	 * 
	 * Estruturas de Hash, por exemplo, podem usar funcoes diferentes para mapear seus dados em um determinado array.
	 * 
	 */
	
	
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("Test");		
		array.add("Test2");
		array.add("Test3");
		array.add("Test!");
		array.add("Test!");
		
		
		// O ArrayList é printado normalmente e na ordem
		System.out.println("ArrayList: " + array.toString());
		
		
		// O HashSet nao permite repeticao, portanto o Test! eh printado uma unica vez
		HashSet<String> hash = arrayListToHashSet(array);
		System.out.println("HashSet: " + hash.toString());
		
		// PriorityQueue eh printado em ordem diferente
		PriorityQueue<String> priority = hashSetToPriorityQueue(hash);
		System.out.println("PriorityQueue: " + priority.toString());
		
		// ArrayDeque
		ArrayDeque<String> arrayDeque = priorityQueueToArrayDeque(priority);
		System.out.println("ArrayDeque: " + priority.toString());
		
		// HashSet
		TreeSet<String> hashSet = arrayDequeToTreeSet(arrayDeque);
		System.out.println("HashSet: " + hashSet.toString());
		
		
	}
	
	public static <T> HashSet<T> arrayListToHashSet(ArrayList<T> list) {
		HashSet<T> toReturn = new HashSet<T>();
		for (int i = 0; i < list.size(); i++) {
			toReturn.add(list.get(i));
		}
		return toReturn;
	}
	
	public static <T> PriorityQueue<T> hashSetToPriorityQueue(HashSet<T> hash) {
		PriorityQueue<T> toReturn = new PriorityQueue<T>();
		for (T elem : hash) {
			toReturn.add(elem);
		}
		return toReturn;		
	}
	
	public static <T> ArrayDeque<T> priorityQueueToArrayDeque(PriorityQueue<T> priorityQueue) {
		ArrayDeque<T> toReturn = new ArrayDeque<T>();
		
		for (T elem : priorityQueue) {
			toReturn.add(elem);
		}
		
		return toReturn;
	}
	
	public static <T> TreeSet<T> arrayDequeToTreeSet(ArrayDeque<T> arrayDeque) {
		TreeSet<T> toReturn = new TreeSet<T>();
		
		for (T elem : arrayDeque) {
			toReturn.add(elem);
		}
		
		return toReturn;		
	}
}
