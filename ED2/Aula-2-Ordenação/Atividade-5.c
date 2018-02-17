#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#include <time.h>
#include <locale.h>

//SHELLSORT - ATIVIDDE 5
void Ordena_ShellSort(int *v,int n);

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
    Ordena_ShellSort(v , n);

    return 0;
}

//Funções
void Ordena_ShellSort(int *v,int n){
  int i,j,gap ,k ;
  int x,a[5]={9, 5, 3, 2, 1};

  for(k = 0; k < 5; k++){
    gap = a[k];
    for(i = gap; i < n;i++){
        x = v[i];
        for(j = i - gap; x < v[j] && j >= 0; j = j -gap){
            v[j + gap] = v[j];
        }
        v[j + gap] = x;
    }
  }
    for(i = 0; i < n; i++){
        printf("%d ", v[i]);
    }
}

