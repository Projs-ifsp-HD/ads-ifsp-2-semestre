
import java.util.Scanner;
public class Lista_exercicios {
	public static void main(String[] args) {
		Ex3();
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
}
