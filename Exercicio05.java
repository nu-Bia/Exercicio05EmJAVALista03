//5) Elaborar um programa que efetue a apresenta��o do valor da convers�o em real de um valor lido em d�lar.
//O programa deve solicitar o valor da cota��o do d�lar e a quantidade de d�lares dispon�vel com o usu�rio, 
//para que seja apresentado o valor em moeda brasileira. 
package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
	
public static void main (String[]args){
	
Scanner sc = new Scanner(System.in);

System.out.println("Quantos reais vo� tem?");

double reais= sc.nextInt();

double cota��o = 5;

double total = reais/cota��o;

System.out.println("O valor em moedas americanas � de :" + total);
System.out.println("O valor em reais � de:" + reais );
System.out.println("O valor da cota��o do d�lar � de :" + cota��o );


}}


