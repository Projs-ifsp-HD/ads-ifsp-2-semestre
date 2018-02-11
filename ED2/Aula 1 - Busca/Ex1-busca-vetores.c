#include <stdio.h>
#include <stdlib.h>

//Protótipos
int buscaLinear(int *v, int n, int elem);
int buscaOrdenada(int *v2, int n, int elem);
int buscaBinaria(int *v, int n, int elem);

int main(){
	int elem = 7, n = 10;
	int v[10] = {9, 0, 1, 7, 3, 2, 8, 4, 5, 6};
	int v2[10] = {1, 2, 3, 4, 5, 6 , 7, 8, 9};
	
	printf("Numero a ser procurado: %d", elem);
	
	printf("\n\nNumero na posição: %d\n\n", buscaLinear(v, n, elem));
	
	printf("\n\nNumero na posição: %d\n\n", buscaOrdenada(v2, n, elem));
	
	printf("\n\nNumero na posição: %d\n\n", buscaBinaria(v2, n, elem));
	
	return 0;
}

int buscaLinear(int *v, int n, int elem){
	int i;
	printf("\n\nVetor desordenado: ");
	for(i = 0; i < n; i++){
		printf("%d ", v[i]);
	}
	for(i = 0; i < n; i++){
		if(v[i] == elem){
			return i+1;	
		}
	}
	return -1;
}

int buscaOrdenada(int *v, int n, int elem){
	int i;
	printf("\nVetor ordenado: ");
	for(i = 0; i < n; i++){
		printf("%d ", v[i]);
	}
	
	for(i = 0; i < n; i++){
		if(v[i] == elem){
			return i;
		}
	}
	
	return 0;
}

int buscaBinaria(int *v, int n, int elem){
	int inicio, meio, fim;
	inicio = 0;
	fim = n - 1;
	
	while(inicio <= fim){
		meio = (inicio + fim)/2;
		if(elem < v[meio]){
			fim = meio - 1; //Busca na metade esquerda
		}else{
			if(elem > v[meio]){
				inicio = meio + 1;//Busca na metade da direita
			}else{
				return meio;
			}
		}
		printf("\nInicio: %d \t", inicio);
		printf("Fim: %d", fim);
	}
	
	return -1; //Numero não encontrado
}
