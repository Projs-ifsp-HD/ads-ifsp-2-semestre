#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#include <time.h>
#include <locale.h>

//INSERTIONSORT - ATIVIDDE 4
void Ordena_InsertionSort(int *v,int n);

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
    Ordena_InsertionSort(v , n);

    return 0;
}

//Funções
void Ordena_InsertionSort(int *v,int n){
  int i,j,aux;
  for(i = 1; i < n ;i++){
    aux = v[i];
    for(j = i;(j > 0) && (aux < v[j-1]); j--){
        v[j] = v[j-1];
    }
    v[j] = aux;
  }
    for(i = 0; i < n; i++){
        printf("%d ", v[i]);
    }
}

