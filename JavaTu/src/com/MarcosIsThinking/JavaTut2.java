package com.MarcosIsThinking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaTut2 {
	private Map<Integer, String> mapa; 
	
	public void print() {
		mapa.forEach((k,v)-> System.out.println("value " + v));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> oneTo10= IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());
		List<Integer> squares = oneTo10.stream().map(x -> x*x).collect(Collectors.toList());
		for(Integer x: squares) System.out.println(x);
		

		JavaTut2 HOLA= new JavaTut2();
		HOLA.fill();
		HOLA.print();
	}
// la funcion en "map" nos permite crear clave valor.
	// se declara como una funcion con clave valor.
	
	public void fill() {
		mapa= new HashMap<>();
		mapa.put(1, "Vamos");
		mapa.put(2, "Marcos");
	
	
	}
	// para recorrer utilizamos la funcion forEach
	
}

