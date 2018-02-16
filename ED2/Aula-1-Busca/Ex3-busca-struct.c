#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

struct func{
	int cod;
	char nome[30];
	float salario;
};
//Protótipos
int buscaLinearCod(struct func *v, int n, int cod);
int buscaOrdenadaCod(struct func *v, int n, int cod);
int buscaBinariaCod(struct func *v, int n, int cod);

int main(){
    setlocale(LC_ALL,"");
    int n = 3;
    struct func funcionario[3] = {2, "Hamilton", 1.100, 1, "Dylan", 1.100, 3, "Lucas", 1.400};
    struct func funcionario2[3] = {1, "Hamilton", 1.100, 3, "Dylan", 1.100, 2, "Lucas", 1.400};
    
    printf("Busca Linear:\n");
    printf("Funcionário encontrado na posição %d", buscaLinearCod(funcionario, 5, 2));
    printf("\n\nBusca Ordenada:\n");
    printf("Funcionário encontrado na posição %d", buscaLinearCod(funcionario2, 5, 2));
    printf("\n\nBusca Binaria:\n");
    printf("Funcionário encontrado na posição %d", buscaBinariaCod(funcionario2, 5, 2));
   
    return 0;
}

//Funções
int buscaLinearCod(struct func *v, int n, int cod){
   int i;
   for(i=0; i<n; i++){
	   if(cod == v[i].cod){
		   return i; //Elemento encontrado
	   }
   }
   return -1;
}

int buscaOrdenadaCod(struct func *v, int n, int cod){
   int i;
   for(i=0; i<n; i++){
	   if(cod == v[i].cod){
		   return i; //Elemento encontrado
	   }else{
		   if(cod < v[i].cod){
			   return -1;
		   }
	   }
   }
   return -1;
}

int buscaBinariaCod(struct func *v, int n, int cod){
   int inicio, meio, fim;
	inicio = 0;
	fim = n - 1;
	
	while(inicio <= fim){
		meio = (inicio + fim)/2;
		if(cod < v[meio].cod){
			fim = meio - 1; //Busca na metade esquerda
		}else{
			if(cod > v[meio].cod){
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
