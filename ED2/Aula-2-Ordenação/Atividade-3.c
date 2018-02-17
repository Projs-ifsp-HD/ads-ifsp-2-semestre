#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#include <time.h>
#include <locale.h>

//SELECTIONSORT - ATIVIDDE 3
void Ordena_SelectionSort(int *v,int n);

int main(){
   int v[10]={190,170,110,180,140,130,120,160,150,100};
   int n = 10,i;
    setlocale(LC_ALL,"");
    printf("Vetor Desordenado:\n");
    for(i = 0; i < n; i++){
		printf("%d ", v[i]);
	}
	printf("\n");
	printf("Vetor Ordenado:\n");
    Ordena_SelectionSort(v , n);

    return 0;
}

//Funções
void Ordena_SelectionSort(int *v,int n){
  int i,j,menor, troca;
  for(i = 0; i < n - 1; i++){
    menor = i;
    for(j = i + 1; j < n ; j++){
        if(v[j] < v[menor]){
            menor = j;
        }
    }
    if(i!=menor){
        troca = v[i];
        v[i] = v[menor];
        v[menor] = troca;
    }
  }
    for(i = 0; i < n; i++){
        printf("%d ", v[i]);
    }
}
