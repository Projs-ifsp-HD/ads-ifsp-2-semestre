
import java.util.Scanner;
public class Lista_exercicios {
	public static void main(String[] args) {
	//digite o execicio que deseja .
		
		Ex18();
		
		
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
	
	private static void Ex13(){
		Scanner ler = new Scanner(System.in);
		float a, b, c;
		System.out.print("Digite um valor para o lado A: ");
			a = ler.nextFloat();
		System.out.print("Digite um valor para o lado B: ");
			b = ler.nextFloat();
		System.out.print("Digite um valor para o lado C: ");
			c = ler.nextFloat();
		
		if(a == 0 || b == 0 || c == 0){
			System.out.print("\nNão é um triangulo");
		}else{
			if(a < (b+c) || b < (a+c) || c < (a+b)){
				System.out.print("\nÉ um triangulo ");
			}
			
			if(a != b && a != c && b != c){
				System.out.print("Escaleno");
			}
			else if(a == b && a == c && b == c){
				System.out.print("Equilátero");
			}
			else if(a == b || a == c || b == c){
				System.out.print("Isósceles");
			}
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
	
	private static void Ex15(){
		Scanner ler = new Scanner(System.in);
		int x, y;
		
		System.out.print("Digite um valor para X: ");
			x = ler.nextInt();
		System.out.print("Digite um valor para X: ");
			y = ler.nextInt();
		
		System.out.print("\nSoma dos valores: " + (x+y));
		System.out.print("\nProduto dos valores: " + (x*y));
		
		if(x > y){
			System.out.print("\nX é maior que Y");
		}
		else if( x == y){
			System.out.print("\nX é igual Y");
		}else{
			System.out.print("\nX é menor que Y");
		}
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
	
	private static void Ex17(){
		Scanner ler = new Scanner(System.in);
		int horas = 0, minutos = 0, segundos;

		System.out.print("Informe os segundos: ");
		segundos = ler.nextInt();
		
		if(segundos < 0){
			System.out.print("\nA conversão não pode ser efetuada. " +
					"\nFoi informado um valor negativo");
		}else{
			
			minutos = segundos/60;
			horas = minutos/60;
			segundos = segundos%60;
			
			if(minutos >= 60){
				minutos = minutos%60;
			}
			System.out.print("\nHorario: " + horas + "h:" + minutos + "m:" + segundos  + "s");
		}
	}
	
	private static void Ex18(){
		Scanner ler = new Scanner(System.in);
		int n, dezena, unidade;
		
		System.out.print("Informe um número: ");
			n = ler.nextInt();
		if(n >= 0 && n <= 100){
				if(n > 10 && n < 20) {
				switch(n) { 
				case 11: 
					 	System.out.print("\nOnze");
					 	break;
				 case 12: 
					 	System.out.print("\nDoze");
					 	break;
				 case 13: 
					 	System.out.print("\nTreze");
					 	break;
				 case 14: 
					 	System.out.print("\nQuatorze");
					 	break;
				 case 15: 
					 	System.out.print("\nQuinze");
					 	break;
				 case 16: 
					 	System.out.print("\nDezesseis");
					 	break;
				 case 17: 
					 	System.out.print("\nDezessete");
					 	break;
				 case 18: 
					 	System.out.print("\nDezoito");
					 	break;
				 case 19: 
					 	System.out.print("\nDezenove");
					 	break;
				}
				}else {
				dezena = n/10;
				unidade = n%10;
				switch(dezena){
				
				 case 1: 
				 	System.out.print("\nDez");
				 	break;
				 case 2: 
					 	System.out.print("\nVinte");
					 	break;
				 case 3: 
					 	System.out.print("\nTrinta");
					 	break;
				 case 4: 
					 	System.out.print("\nQuarenta");
					 	break;
				 case 5: 
					 	System.out.print("\nCinquenta");
					 	break;
				 case 6: 
					 	System.out.print("\nSessenta");
					 	break;
				 case 7: 
					 	System.out.print("\nSetenta");
					 	break;
				 case 8: 
					 	System.out.print("\nOitenta");
					 	break;
				 case 9: 
					 	System.out.print("\nNoventa");
					 	break;
				}
				
				if(unidade != 0) {System.out.print(" e ");}
				
				switch(unidade){
				 case 1: 
					 	System.out.print("um");
					 	break;
				 case 2: 
					 	System.out.print("dois");
					 	break;
				 case 3: 
					 	System.out.print("três");
					 	break;
				 case 4: 
					 	System.out.print("Quatro");
					 	break;
				 case 5: 
					 	System.out.print("Cinco");
					 	break;
				 case 6: 
					 	System.out.print("Seis");
					 	break;
				 case 7: 
					 	System.out.print("Sete");
					 	break;
				 case 8: 
					 	System.out.print("oito");
					 	break;
				 case 9: 
					 	System.out.print("nove");
					 	break;
				}
			
		}
		}else{
			System.out.print("\nNúmero inválido");
		}
		
	} 
	
	private static float Ex20(){
		/*. Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área,
			sabendo que o cálculo da área é dado por: area = (base*altura)/2*/ 
		float metros , pes;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a medida em metros: ");
		metros = ler.nextFloat();
		
		if(metros > 0 ) {
		pes = (metros * 3.315f);
		
		System.out.print("A medida Digitada em metros  : " + metros);
		
		System.out.print("\n A medida convertida para pés : " + pes);
		
		}else {
			System.out.print("Erro valor negativo nao pode ser convertido !!!!");
		}
		return 0;
	}
	
	private static void Ex21(){
		Scanner ler = new Scanner(System.in);
		float a, b, c, delta;
		double x1 = 0, x2 = 0;
		
		System.out.print("Valor de A: ");
			a = ler.nextFloat();
		System.out.print("Valor de A: ");
			b = ler.nextFloat();
		System.out.print("Valor de A: ");
			c = ler.nextFloat();
		
		delta = ((b*b)-(4*a*c));
		
		if(delta >= 0){
			x1 = (-b + (Math.sqrt (delta) )) / ( 2*a );
			x2 = (-b + (Math.sqrt (delta) )) / ( 2*a );
			
			System.out.print("\nX1 = " + x1);
			System.out.print("\nX2 = " + x2);
		}else{
			System.out.println("\nDelta invalido");
		}
		
	}
	
	private static void Ex22(){
		/*Considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba as seguintes
		informações: um valor real indicando posição inicial do móvel P0, um valor real que corresponde a velocidade do móvel
		V, um outro valor real A correspondente a aceleração do móvel e um número inteiro correspondente ao tempo decorrido
		T. O programa deve calcular a posição final PF do móvel, dado pela relação abaixo:
		PF = P0 + V * T +  (A * T2) / 2 */
		float po , v , a;
		double pf;
		int t;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com a posição inicial do movel PO: ");
		po = ler.nextFloat();
		
		System.out.print("Entre com a velocidade do movél V: ");
		v = ler.nextFloat();
		
		System.out.print("Entre com a Acelaração do movel A: ");
		a = ler.nextFloat();
		
		System.out.print("Entre com a o tempo decorrido T: ");
		t = ler.nextInt();
		
		pf = (po + ( v * t ) + ( ( a * Math.pow( t,2 )  ) / 2 ) );
		
		System.out.print("A Posição final é : " + pf);
	}
	
	private static void Ex23(){
		Scanner ler = new Scanner(System.in);
		float pv, j;
		double fv;
		int n;
		
		System.out.print("Informe o capital inicial: ");
			pv = ler.nextFloat();
		System.out.print("Informe a taxa de juros ");
			j = ler.nextFloat();
		System.out.print("Informe o número de aplicações: ");
			n = ler.nextInt();
		
		fv = pv * (Math.pow(1+j, n));
		
		System.out.print("\nResultado: " + fv);
	}
	
	private static void Ex24(){
		/*. Implementar três programas para exibir a tabuada de um número inteiro entre 1 e 20 dado pelo usuário.
			a) Usando enquanto (while)
			b) Usando faça-enquanto (do-while)
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
	
	private static void Ex25(){
		Scanner ler = new Scanner(System.in);
		int a, i, soma = 0, n;
	
		System.out.print("Quantos numeros quer somar: ");
		n = ler.nextInt();
		System.out.print("\n");
		for(i=0; i < n; i++){
			System.out.print("Digite o " + (i+1) + "º número: ");
			a = ler.nextInt();
			soma = soma + a;
		}
			
		
		
		System.out.print("\nSoma: " + soma);
	}
	
	private static void Ex26(){
		/*. Escreva um programa que calcule a soma de N números quaisquer fornecidos pelo usuário. O programa deve parar de ler
			e, portanto somar os valores quando for introduzido o número 0 (zero). 
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
	
	private static void Ex27(){
		Scanner ler = new Scanner(System.in);
		int cont = 0, soma = 0, nota;
	
		do{
			System.out.print("Digite a nota " + (cont+1) + ": ");
			nota = ler.nextInt();
			if(nota >= 0){
				soma = soma + nota;
				cont++;
			}
		}while(nota >= 0);
		
		System.out.print("\nMédia: " + soma/(cont));
		
	}
	
	private static void Ex28(){
		Scanner ler = new Scanner(System.in);
		int a = -1, b = -2, c = -3;
		
		System.out.print("Digite um número entre 0 e 1: ");
		a = ler.nextInt();
		System.out.print("Digite um número entre 0 e 1: ");
		b = ler.nextInt();
		System.out.print("Digite um número entre 0 e 1: ");
		c = ler.nextInt();
		
		if(a < 0 || a > 1 || b < 0 || b > 1 || c < 0 || c > 1){
			System.out.print("\nNúmeros inválido");
		}else{
			if(a > 0 && b > 0 && c > 0){
				System.out.print("V");
			}else if(a < 0 && b < 0 && c < 0){
				System.out.print("V");
			}else{
				System.out.print("F");
			}
		}
	}		
	
	
}
