/*
* Teste.java
* Autor: Matheus Aguilar de Oliveira
* Versão: 1.0
* Data de modificação: 29 de novembro de 2020
* Descrição: Classe usada para automatizar os testes
* da classe Programa_2A.
*/

package main;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Teste {

	private int N, K;
	private ArrayList<Integer> P;
	private String res;
	
	@BeforeEach
	void init() {
		P = new ArrayList<Integer>();
	}
	
	@Test
	void test1() {
		
		N = 3;
		
		P.add(10);
		P.add(20);
		P.add(30);
		
		res = Programa_2A.teste(N, P);
		
		assertEquals(res, "80 2 3");
	}
	
	@Test
	void test2() {
		
		N = 3;
		
		P.add(10);
		P.add(30);
		P.add(20);
		
		res = Programa_2A.teste(N, P);
		
		assertEquals(res, "60 2");
	}
	
	@Test
	void test3() {
		
		N = 3;
		
		P.add(30);
		P.add(10);
		P.add(20);
		
		res = Programa_2A.teste(N, P);
		
		assertEquals(res, "100 1 2");
	}
	
	@Test
	void test4() {
		
		N = 5;
		
		P.add(80);
		P.add(50);
		P.add(10);
		P.add(5);
		P.add(15);
		
		res = Programa_2A.teste(N, P);
		
		assertEquals(res, "290 1 2");
	}
}
