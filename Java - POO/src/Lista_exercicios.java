
import java.util.Scanner;
public class Lista_exercicios {
	public static void main(String[] args) {
		Ex6();
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
	
	private static float Ex3(){
		float n;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n = ler.nextFloat();
		if(n > 50){
			System.out.print("O número é maior que 50");
		}
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
		System.out.print("Digite um número para A: ");
		a = ler.nextFloat();
		
		System.out.print("Digite um número para B: ");
		b = ler.nextFloat();
		
		if(a > 0 && b > 0){
			resAB = 'V';
		}else{
			resAB = 'F';
		}
		
		if(a < 0){
			resA = 'F';
		}else{
			resA = 'V';
		}
		
		if(b < 0){
			resB = 'F';
		}else{
			resB = 'V';
		}
		
		System.out.print("\n" +
						"("+ resA +") A é maior que zero? \n" +
						"("+ resB +") B é maior que zero? \n" +
						"("+ resAB +") A e B é maior que zero?");
		
		return 0;
	}
}
