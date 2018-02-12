
import java.util.Scanner;
public class Lista_exercicios {
	public static void main(String[] args) {
	//digite o execicio que deseja .
		
		Ex16();
		
		
	}
	
	private static int Ex1(){
		int n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um nÃºmero: ");
		n = ler.nextInt();
		System.out.print("NÃºmero digitado: " + n);
		return 0;
	}
	
	private static float Ex2(){
		float n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um nÃºmero: ");
		n = ler.nextFloat();
		System.out.print("NÃºmero digitado: " + n);
		return 0;
	}
	
	private static void Ex3(){
		float n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um nÃºmero: ");
		n = ler.nextFloat();
		if(n > 50){
			System.out.print("O nÃºmero Ã© maior que 50");
		}
		
	}

	private static float Ex4(){
		float n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um nÃºmero: ");
		n = ler.nextFloat();
		if(n > 100){
			System.out.print("O nÃºmero Ã© maior que 100");
		}else{
			System.out.print("O valor Ã© menor ou igual a 100");
		}
		return 0;
	}
	
	private static float Ex5(){
		float n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um nÃºmero: ");
		n = ler.nextFloat();
		if(n %2 == 0){
			System.out.print("O nÃºmero Ã© par!");
		}else{
			System.out.print("O nÃºmero Ã© impar!");
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
	
	private static float Ex11(){
		//Escreva um programa que leia dois nï¿½meros inteiros A e B quaisquer indicando se A ï¿½ mï¿½ltiplo de B ou se B ï¿½ mï¿½ltiplo de A.
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
	
	private static float Ex12(){
		/*Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos. O usuário deve
		fornecer o número de copos a serem comprados e o programa deve calcular o preço total a ser cobrado, exibindo-o.
		Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05; se o número de copos está entre
		101 e 500, o preço por copo é R$0.04; finalmente se o número de copos é superior a 500 o preço por copo é R$0.035.*/ 
		float total, copos;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor a Quantidade de Copos que deseja:  ");
		copos = ler.nextFloat();
		
		if(copos <= 100) {
			total = copos * 0.05f;
		}
		else if((copos > 100) && (copos <= 500)) {
			total = copos * 0.04f;
		}else {
			total = copos * 0.035f;
		}
		
		System.out.print("O valor a ser pago em "+ copos +" é : " + total);
		
		return 0;
	}
	
	private static float Ex14(){
		/*Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética. Imprima também
		"Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame" se estiver entre 3 e 7.*/ 
		float nota,nota2,nota3,media;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a primeira Nota: ");
		nota = ler.nextFloat();
		
		System.out.print("Digite a segunda Nota: ");
		nota2 = ler.nextFloat();
		
		System.out.print("Digite a terceiro Nota: ");
		nota3 = ler.nextFloat();
		
		media = (nota + nota2 +nota3)/3;
		
		if(media >= 7) {
			System.out.print("O aluno foi Aprovado com a nota de : " + media);
		}else if(media <= 3) {
			System.out.print("O aluno foi Reprovado com a nota de  : " + media);
		}else {
			System.out.print("O aluno esta de Exame com a nota de  : " + media);
		}
		
		return 0;
	}
	
	private static float Ex16(){
		/*. Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área,
			sabendo que o cálculo da área é dado por: area = (base*altura)/2*/ 
		float area,altura,base;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a altura do triangulo: ");
		altura = ler.nextFloat();
		
		System.out.print("Digite a base do triangulo: ");
		base = ler.nextFloat();
		
		area = (base * altura)/2;
		
			System.out.print("A area do seu triangulo e  : " + area);
		
		return 0;
	}
}
