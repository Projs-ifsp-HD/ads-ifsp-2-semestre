
import java.util.Scanner;
public class Lista_exercicios {
	public static void main(String[] args) {
	//digite o execicio que deseja .
		
		Ex11();
		
		
	}
	
	
	
	
	private static int Ex1(){
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n = ler.nextInt();
		System.out.print("Número digitado: " + n);
		return 0;
	}
	
	private static float Ex2(){
		float n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n = ler.nextFloat();
		System.out.print("Número digitado: " + n);
		return 0;
	}
	
	private static float Ex4(){
		float n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n = ler.nextFloat();
		if(n > 100){
			System.out.print("O número é maior que 100");
		}else{
			System.out.print("O valor é menor ou igual a 100");
		}
		return 0;
	}
	
	private static float Ex5(){
		float n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n = ler.nextFloat();
		if(n %2 == 0){
			System.out.print("O número é par!");
		}else{
			System.out.print("O número é impar!");
		}
		return 0;
	}

	private static float Ex6(){
		float a, b;
		char resA = 'V', resB = 'V', resAB = 'F';
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero para A: ");
		a = ler.nextFloat();
		
		System.out.print("Digite um numero para B: ");
		b = ler.nextFloat();
		
		if(a <= 0){
			resA = 'F';
		}
		
		if(b <= 0){
			resB = 'F';
		}
		
		if(resA == 'V' && resB == 'V'){
			resAB = 'V';
		}
		
		System.out.print("\n" +
						"("+ resA +") A e maior que zero? \n" +
						"("+ resB +") B e maior que zero? \n" +
						"("+ resAB +") A e B e maior que zero?");
		
		return 0;
	}
	
	private static float Ex7(){
		float a, b;
		char resA = 'V', resB = 'V', resAB = 'F';
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero para A: ");
		a = ler.nextFloat();
		
		System.out.print("Digite um numero para B: ");
		b = ler.nextFloat();
		
		if(a != 0){
			resA = 'F';
		}
		
		if(b >= 0){
			resB = 'F';
		}
		
		if(a > 0 || b > 0){
			resAB = 'V';
		}
		
		System.out.print("\n" +
						"("+ resA +") A e igual zero? \n" +
						"("+ resB +") B e menor que zero? \n" +
						"("+ resAB +") A ou B sao maiores que zero?");
		
		return 0;
	}
	
	private static int Ex8(){
		int n,n2,n3,maior;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		n = ler.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		n2 = ler.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		n3 = ler.nextInt();
		
		if(n > n2){
		    maior = n;
		}
		else{
		    maior = n2;
		}

		if(maior < n3){
		    maior = n3;
		}
		
		System.out.print("O maior valor digitado e: " + maior);

		
		return 0;
	}
	
	private static float Ex9(){
		float n,n2,n3,maior;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		n = ler.nextFloat();
		
		System.out.print("Digite o segundo numero: ");
		n2 = ler.nextFloat();
		
		System.out.print("Digite o terceiro numero: ");
		n3 = ler.nextFloat();
		
		if(n > n2){
		    maior = n;
		}
		else{
		    maior = n2;
		}

		if(maior < n3){
		    maior = n3;
		}
		
		System.out.print("O maior valor digitado e: " + maior);

		
		return 0;
	}
	
	private static float Ex10(){
		float n,n2,n3;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		n = ler.nextFloat();
		
		System.out.print("Digite o segundo numero: ");
		n2 = ler.nextFloat();
		
		System.out.print("Digite o terceiro numero: ");
		n3 = ler.nextFloat();
		
		if(n > n2) {
			if(n2 > n3) {
				System.out.print("Ordem Crescente:  "+ n +" - "+ n2 +" - "+ n3 +"");
			}else if(n > n3) {
				System.out.print("Ordem Crescente:  "+ n +" - "+ n3 +" - "+ n2 +"");
			}else {
				System.out.print("Ordem Crescente:  "+ n3 +" - "+ n +" - "+ n2 +"");
			}
		}else if(n2 > n3) {
			if(n > n3) {
				System.out.print("Ordem Crescente: "+ n2 +" - "+ n +" - "+ n3 +"");
			}else {
				System.out.print("\"Ordem Crescente: "+ n2 +" - "+ n3 +" - "+ n +"");
			}
		}else {
			System.out.print("Ordem Crescente: "+ n3 +" - "+ n2 +" - "+ n +"");
		}
		
		
		return 0;
	}
	
	private static int Ex11(){
		//Escreva um programa que leia dois n�meros inteiros A e B quaisquer indicando se A � m�ltiplo de B ou se B � m�ltiplo de A.
		float a,b;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		a = ler.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = ler.nextInt();
		
		if( (a % b) == 0) {
			System.out.print("A e multiplo de B");
		}
		else if( (b % a) == 0) {
			System.out.print("B e multiplo de A ");
		}
		else {
			System.out.print("B nao e multiplo de  A | e A nao e multiplo de B ");
		}
		
		
		return 0;
	}
}
