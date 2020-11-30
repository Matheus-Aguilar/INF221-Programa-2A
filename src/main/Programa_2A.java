/*
* Programa_2A.java
* Autor: Matheus Aguilar de Oliveira
* Versão: 1.0
* Data de modificação: 29 de novembro de 2020
* Descrição: Classe usada para encontrar o melhor posicionameto
* da máquina de café na empresa.
*/

package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

/*
* A classe Programa_2A lê a quantidade de funcionários
* em cada andar da empresa e calcula o melhor andar
* para colocar a máquina de café.
* 
* Autor: Matheus Aguilar de Oliveira
*/
public class Programa_2A {
	
	static int N, M;
	static ArrayList<Integer> P, MA, A;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		N = s.nextInt();
		P = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			P.add(s.nextInt());
		}
		
		calcula();
		
	}
	
	/*
	* Função usada para testar o cálculo
	* sem ter que fazer entrada e saída de
	* dados.
	*/
	public static String teste(int _N, ArrayList<Integer> _P) {
		
		N = _N;
		P = _P;
		
		for(int i = 0; i < N; i++)
			P.add(_P.get(i).intValue());
		
		calcula();
		
		String res = "";
		
		res += Integer.toString(M);
		
		for(int i = 0; i < A.size(); i++)
			res += " " + Integer.toString(A.get(i));
		
		return res;
	}
	
	public static void calcula() {
		
		String andares = "";
		
		MA = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			MA.add(0);
			for(int j = 0; j < N; j++) {
				MA.set(i, MA.get(i) + 2 * Math.abs(i - j) * P.get(j).intValue());
			}
		}
		
		M = MA.get(0);
		
		for(int i = 1; i < N; i++) {
			if(M > MA.get(i)) {
				M = MA.get(i);
			}
		}
		
		A = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			if(M == MA.get(i).intValue()) {
				A.add(i + 1);
			}
		}
		
		System.out.println(M);
		
		andares += Integer.toString(A.get(0));
		
		for(int i = 1; i < A.size(); i++) {
			andares += " " + Integer.toString(A.get(i));
		}
		
		System.out.println(andares);
	}
}
