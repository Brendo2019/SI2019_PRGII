package br.edu.unisep;

public class ExemploFor {

	public static void main(String[] args) {
	
		for (var i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("------");
		var x = 0;
		for (; x < 10; x += 2) {
			System.out.println(x);
		}
		
		System.out.println("------");
		x = 10;
		for(; x > 0;) {
			System.out.println(x);
			x --;
		}
	}
}
