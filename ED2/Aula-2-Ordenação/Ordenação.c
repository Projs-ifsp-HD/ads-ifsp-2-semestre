#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#include <time.h>
#include <locale.h>

//Protótipos
void Ordena_bubleSort(int *v,int n);

int main(){
   int v[10]={180,190,170,110,100,140,130,120,160,150};
   int n = 10,i;
    setlocale(LC_ALL,"");
    printf("Vetor Desordenado:\n");
    for(i = 0; i < n; i++){
		printf("%d ", v[i]);
	}
	printf("\n");
	printf("Vetor Ordenado:\n");
    Ordena_bubleSort(v , n);

    return 0;
}

//Funções
void Ordena_bubleSort(int *v,int n){
   int i, continua, aux,fim = n;
   do{
    continua = 0;
    for(i = 0 ; i < fim - 1 ;i++){
        if(v[i] > v[i+1]){
            aux = v[i];
            v[i] = v[i+1];
            v[i+1] = aux;
            continua = i;
        }
    }
     for(i = 0 ; i < fim - 1 ;i++){
        if(v[i] > v[i+1]){
            aux = v[i];
            v[i] = v[i+1];
            v[i+1] = aux;
            continua = i;
        }
    }
   }while(continua != 0);

    for(i = 0; i < n; i++){
		printf("%d ", v[i]);
	}
}
