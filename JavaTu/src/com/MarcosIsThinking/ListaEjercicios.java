package com.MarcosIsThinking;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaEjercicios {
	// almacenan los datos de manera dinamica y no se declara el tama�o
	ArrayList<Double> lista;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// aca lo que se hace es se crea un objeto de la clase que petence y podemos acceder al array lista
		ListaEjercicios lis= new ListaEjercicios ();
		lis.lista = new ArrayList();
		lis.leerOpcion();
		System.out.print("hola");
	
	}
	// sali del main por ende continuo en la clase asi que aqui puedo escribir el siguiente condigo
	public void leerOpcion() {
		int teclado=0;
		while(teclado !=7) {
			Scanner teclado2 = new Scanner(System.in);
	
		System.out.print("\n welcome to numbers list please choose a value");
		System.out.print("1 add a value");
		System.out.print("2 find a value");
		System.out.print("3 change an  element");
		System.out.print("4 delete an element");
		System.out.print("5 insert an element");
		System.out.print("6 show elements");
		System.out.print("7 Exit");
		teclado = teclado2.nextInt(); 
		switch(teclado) {
		case 1:
			ingresarValor();
			break;
		case 2: 
			buscarValor();
			break;
		case 3 :
			modificarValor();
			break;
		case 4:
			eliminarValor();
			break;
		case 5:
			insertarValor();
			break;
		case 6:
			mostrarValores();
			break;
		case 7:
			teclado = 7;
		
			
		}
		teclado2.close(); 
		}
		
	}
	public void ingresarValor(){

		double valor;
		System.out.print("hola");
		Scanner teclado = new Scanner(System.in);
		 valor= teclado.nextDouble();
		lista.add(valor);
		teclado.close();

			System.out.print("listo");
		
	}
	public void buscarValor(){
		System.out.print("ingrese el valor a buscar");
		Scanner teclado = new Scanner(System.in);
		
		double valor =  teclado.nextDouble();
		// el index.of me devuelve en la posiion en la que se encuentra en la lista
		if(lista.indexOf(valor)== -1) {
			System.out.print("Su valor no se  encuentra en la lista");
		}else {
			System.out.print("Su valor no esta en la lista en la posicion" + lista.indexOf(valor));
		}
		teclado.close();
	}
	public void eliminarValor() {
		System.out.print("ingrese el valor a buscar");
		Scanner teclado = new Scanner(System.in);
		double valor= teclado.nextDouble();
		if(lista.indexOf(valor) == -1) {
			System.out.print("Su valor no esta en la lista");
		}else {
			lista.remove(lista.indexOf(valor));
		}
		teclado.close();
	}
	public void modificarValor() {
		System.out.print("ingrese una posicion a modficar");
		Scanner teclado = new Scanner(System.in);
		double valor, valor2;
		valor= teclado.nextDouble();
		if(lista.indexOf(valor) == -1) {
			System.out.print("Su valor no esta en la lista");
		}else {
		System.out.print("Ingrese el valor deseado");	
		valor2= teclado.nextDouble();
		lista.set(lista.indexOf(valor), valor2);
		}
		teclado.close();

	}
	public void insertarValor() {
		Scanner teclado = new Scanner(System.in);
		double valor2;
		int valor;
		System.out.print("ingrese el valor");
		valor= teclado.nextInt();
		System.out.print("ingrese el valor");
		valor2= teclado.nextDouble();
		lista.add(valor,valor2);
		teclado.close();
	}
	public void mostrarValores(){
		if(lista.isEmpty()) 
		{
			System.out.print("No hay valores");
		}else {
		System.out.print("Estos son los valores");
		for(int i=0;i<lista.size();i++) {
		System.out.print(lista.get(i));			
		}
		}
		
		}

}