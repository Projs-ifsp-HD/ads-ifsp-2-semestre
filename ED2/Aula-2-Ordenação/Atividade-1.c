#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#include <time.h>
#include <locale.h>

<<<<<<< HEAD:ED2/Aula-2-Ordena√ß√£o/Atividade-1.c
//BUBLESORT - ATIVIDDE 1
=======
//ProtÛtiposkhdskfhdjskfhjkdshfjkdsk
//fdfsdfsdfsd
//gdfdf
>>>>>>> d8f75e6f95fcf2c54ece87d9573e05e41faf5a1c:ED2/Aula-2-Ordena√ß√£o/atividade1.c
void Ordena_bubleSort(int *v,int n);

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
    Ordena_bubleSort(v , n);

    return 0;
}

//FunÁıes
void Ordena_bubleSort(int *v,int n){
   int i, continua, aux,fim = n,count=0;
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
    fim--;
   }while(continua != 0);

    for(i = 0; i < n; i++){
		printf("%d ", v[i]);
	}
}
