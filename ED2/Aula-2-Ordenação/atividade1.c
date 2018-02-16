#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#include <time.h>
#include <locale.h>

//Protótiposkhdskfhdjskfhjkdshfjkdsk
//fdfsdfsdfsd
//gdfdf
void Ordena_bubleSort(int *v,int n);

int main(){
    v[7]={110,100,130,140,120,160,150}
    n = 7;
    setlocale(LC_ALL,"");

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
    fim--;
   }while(continua != 0);
}
