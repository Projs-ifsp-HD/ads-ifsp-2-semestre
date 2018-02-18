
import java.util.Scanner;
public class Lista_exercicios {
	public static void main(String[] args) {
	//digite o execicio que deseja .
		
		Ex26();
		
		
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
	
	private static void Ex3(){
		float n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n = ler.nextFloat();
		if(n > 50){
			System.out.print("O número é maior que 50");
		}
		
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
	
	private static float Ex11(){
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
	
	private static float Ex12(){
		/*Escreva um programa capaz de calcular o pre�o total a ser pago por uma compra de copos pl�sticos. O usu�rio deve
		fornecer o n�mero de copos a serem comprados e o programa deve calcular o pre�o total a ser cobrado, exibindo-o.
		Observe que: se o n�mero de copo � inferior ou igual a 100, o pre�o por copo � R$0.05; se o n�mero de copos est� entre
		101 e 500, o pre�o por copo � R$0.04; finalmente se o n�mero de copos � superior a 500 o pre�o por copo � R$0.035.*/ 
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
		
		System.out.print("O valor a ser pago em "+ copos +" � : " + total);
		
		return 0;
	}
	
	private static float Ex14(){
		/*Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua m�dia aritm�tica. Imprima tamb�m
		"Aprovado" se a m�dia for maior que 7, "Reprovado" se for menor que 3 e "Exame" se estiver entre 3 e 7.*/ 
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
		/*. Preparar um programa para ler as medidas da base e da altura de um tri�ngulo, calculando e imprimindo sua �rea,
			sabendo que o c�lculo da �rea � dado por: area = (base*altura)/2*/ 
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
	private static float Ex16(){
		/*. Preparar um programa para ler as medidas da base e da altura de um tri�ngulo, calculando e imprimindo sua �rea,
			sabendo que o c�lculo da �rea � dado por: area = (base*altura)/2*/ 
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
	
	//EX 18 
	
	private static float Ex20(){
		/*. Preparar um programa para ler as medidas da base e da altura de um tri�ngulo, calculando e imprimindo sua �rea,
			sabendo que o c�lculo da �rea � dado por: area = (base*altura)/2*/ 
		float metros , pes;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a medida em metros: ");
		metros = ler.nextFloat();
		
		if(metros > 0 ) {
		pes = (metros * 3.315f);
		
		System.out.print("A medida Digitada em metros  : " + metros);
		
		System.out.print("\n A medida convertida para p�s : " + pes);
		
		}else {
			System.out.print("Erro valor negativo nao pode ser convertido !!!!");
		}
		return 0;
	}
	
	private static void Ex22(){
		/*Considerando um objeto m�vel em movimento uniformemente variado, escreva um programa que receba as seguintes
		informa��es: um valor real indicando posi��o inicial do m�vel P0, um valor real que corresponde a velocidade do m�vel
		V, um outro valor real A correspondente a acelera��o do m�vel e um n�mero inteiro correspondente ao tempo decorrido
		T. O programa deve calcular a posi��o final PF do m�vel, dado pela rela��o abaixo:
		PF = P0 + V * T +  (A * T2) / 2 */
		float po , v , a;
		double pf;
		int t;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com a posi��o inicial do movel PO: ");
		po = ler.nextFloat();
		
		System.out.print("Entre com a velocidade do mov�l V: ");
		v = ler.nextFloat();
		
		System.out.print("Entre com a Acelara��o do movel A: ");
		a = ler.nextFloat();
		
		System.out.print("Entre com a o tempo decorrido T: ");
		t = ler.nextInt();
		
		pf = (po + ( v * t ) + ( ( a * Math.pow( t,2 )  ) / 2 ) );
		
		System.out.print("A Posi��o final � : " + pf);
	}
	
	private static void Ex24(){
		/*. Implementar tr�s programas para exibir a tabuada de um n�mero inteiro entre 1 e 20 dado pelo usu�rio.
			a) Usando enquanto (while)
			b) Usando fa�a-enquanto (do-while)
			c) Usando para (for)
		 */
		int numero , resultado ,cont = 0 ;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com um numero entre 1 e 20: ");
		numero = ler.nextInt();
		if(numero > 0 || numero <= 20) {
		//-----metodo While -----
		
		System.out.print("-----metodo While -----\n");
		while (cont <= 10) {
			resultado = numero * cont;
			System.out.print(numero +" x "+ cont +" = " + resultado);
			System.out.print("\n");
			cont ++;
		}
		
		
		//-----metodo do - While -----
		System.out.print("-----metodo Do - While -----\n");
		cont = 0 ;
		do{
			resultado = numero * cont;
			System.out.print(numero +" x "+ cont +" = " + resultado);
			System.out.print("\n");
			cont ++;
		}while (cont <= 10);
		
		
		//-----metodo for -----
		System.out.print("-----metodo for -----\n");
		for(cont = 0 ; cont <= 10 ;cont++) {
			resultado = numero * cont;
			System.out.print(numero +" x "+ cont +" = " + resultado);
			System.out.print("\n");
		}
		
		}else {
		
			System.out.print("Numero invelido ! ");	
		
		}
	}
	
	private static void Ex26(){
		/*. Escreva um programa que calcule a soma de N n�meros quaisquer fornecidos pelo usu�rio. O programa deve parar de ler
			e, portanto somar os valores quando for introduzido o n�mero 0 (zero). 
		 */
		int numero, resultado,soma = 0;
		
		Scanner ler = new Scanner(System.in);
	
		do{
			System.out.print("Entre com um numero: ");
			numero = ler.nextInt();
			soma += numero;
			System.out.print("Resultado : "+ soma);
			System.out.print("\n");
		}while (numero != 0);
	}
	
	
	
}
