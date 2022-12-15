//5) Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar.
//O programa deve solicitar o valor da cotação do dólar e a quantidade de dólares disponível com o usuário, 
//para que seja apresentado o valor em moeda brasileira. 
package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
	
public static void main (String[]args){
	
Scanner sc = new Scanner(System.in);

System.out.println("Quantos reais voê tem?");

double reais= sc.nextInt();

double cotação = 5;

double total = reais/cotação;

System.out.println("O valor em moedas americanas é de :" + total);
System.out.println("O valor em reais é de:" + reais );
System.out.println("O valor da cotação do dólar é de :" + cotação );


}}


