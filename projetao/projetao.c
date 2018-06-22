#include <locale.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "projetao.h"

void preenche_func(func *vetDados){
    FILE *f;
    int cont=0, cont2=0,s=0,i=0;
    char cod[6], nome[50], idade[3], emp[50], dept[50], sal[15];
    char c[150];
    f=fopen("massaDados.txt","r");
    while(fgets(c,150,f)){

    strtok(c,"/");
    strcpy(cod, c);

    strcpy(nome,strtok(NULL,"/"));
    strcpy(idade,strtok(NULL,"/"));
    strcpy(emp,strtok(NULL,"/"));
    strcpy(dept,strtok(NULL,"/"));
    strcpy(sal,strtok(NULL,"\n"));


    strreplace(sal, ',','.');
    vetDados[i].cod=atoi(cod);
    vetDados[i].idade=atoi(idade);
    vetDados[i].salario = atof(sal);
    strcpy(vetDados[i].nome,nome);
    strcpy(vetDados[i].empresa,emp);
    strcpy(vetDados[i].dept, dept);

    i++;

    }

}
void mostraVetor(func *vetDados){
    int i , n = 9;
    for(i=0; i != n ;i++){
        printf("Cod: %d \n", vetDados[i].cod);
        printf("Nome: %s \n", vetDados[i].nome);
    }
}

func *cria_lista_func(){
    int n = 9;
    func *vetDados;
    vetDados = (func*) malloc(n * sizeof(func));

    if(vetDados == NULL){

        printf("Erro ao alocar memoria");

    }

    return vetDados;

}

void strreplace(char *s, char chr, char repl_chr){
     int i=0;
     while(s[i]!='\0')
     {
           if(s[i]==chr)
           {
               s[i]=repl_chr;
           }
           i++;
     }
    return;
}

void menu(int op){
    printf("Escolha a Arvore:\n");
    printf("Rubro Negra - 1");
    printf("\t|| AVL - 2\n");
    scanf("%d",&op);
    switch(op){
    case 1:
        printf("Rubro");
        break;
    case 2:
        printf("AVL");
        break;
    }
}


void ordena_quicksort(func *vetDados, int inicio, int fim){
    func pivo;
    if(fim >inicio){
        pivo.cod = particiona (vetDados,inicio,fim);
        ordena_quicksort(vetDados,inicio,pivo.cod - 1);
        ordena_quicksort(vetDados,pivo.cod + 1,fim);
    }

}

int particiona(func *vetDados, int inicio, int fim){
    func pivo,aux;
    int  esq, dir;
    esq =inicio;
    dir = fim;
    pivo = vetDados[inicio];
    while(esq < dir){
        while (vetDados[esq].cod <= pivo.cod){
            esq++;
        }
         while (vetDados[dir].cod > pivo.cod){
            dir--;
        }
        if (esq < dir){
        aux = vetDados[esq];
        vetDados[esq] = vetDados[dir];
        vetDados[dir] = aux;
        }
    }
    vetDados[inicio] = vetDados[dir];
    vetDados[dir] = pivo;
    return dir;
}
