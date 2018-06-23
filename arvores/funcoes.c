#include <locale.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <locale.h>
#include <sys/time.h>
#include "arvoreAVL.h"
#include "arvoreLLRB.h"
#include "funcoes.h"
#define N 14999

double calcTempo(struct timeval tempo_inicio, struct timeval tempo_fim);

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

    vetDados[i].cod=atoi(cod);
    vetDados[i].idade=atoi(idade);
    vetDados[i].salario = atof(sal);
    strcpy(vetDados[i].nome,nome);
    strcpy(vetDados[i].empresa,emp);
    strcpy(vetDados[i].dept, dept);

    i++;

    }

}

int preencheAVL(arvAVL *raiz, func *vetDados){
    int i, x=0;
    for(i=0; i < N; i++){
        x = insere_arvAVL(raiz, vetDados[i]);
    }

    return x;
}

int preencheLLRB(arvoreLLRB *raiz, func *vetDados){
    int i, x=0;
    for(i=0; i < N; i++){
        x = insere_arvoreLLRB(raiz, vetDados[i]);
    }

    return x;
}

void mostraVetor(func *vetDados){
    int i;
    for(i=0; i != N ;i++){
        printf("Cod: %d | ", vetDados[i].cod);
        printf("Nome: %s \n", vetDados[i].nome);
    }
    getchar();
}

func *cria_lista_func(){
    func *vetDados;
    vetDados = (func*) malloc(N * sizeof(func));

    if(vetDados == NULL){
        printf("Erro ao alocar memoria");
    }
    return vetDados;

}

void menu(int op,func *vetDados, arvAVL raizAVL, arvoreLLRB raizLLRB){
    int x, y;
    struct timeval tempo_inicio,tempo_fim;
    double ti,tf,tempo;
    float tempoAVLDesord, tempoAVLOrd, tempoLLRBDesord, tempoLLRBOrd;
    do{
        system("clear");
        ///system("cls");
        printf("Esse programa tem como objetivo mostrar a comparação da Inserção de dados em uma Arvore. ");
        printf("Usaremos para comparar Avl e Rubro-Negra.\n\n");
        printf("Valores Ordenados - 1\n");
        printf("Valores Desordenados - 2\n");
        printf("Escolha o tipo de comparação:\n");
        printf("Sair - 0\n");
        scanf("%d",&op);
        switch(op){
        case 1:
            gettimeofday(&tempo_inicio,NULL);
                ordena_quicksort(vetDados,0,N-1);
                gravaDados(vetDados);
                system("clear");
                ///system("cls");
                printf("Arvore AVL:\n");
                x = preencheAVL(raizAVL, vetDados);
                if(x){
                    printf("Elemento inserido\n");
                }else{
                    printf("Não inserido\n\n");
                }
                x = totalNO_arvAVL(raizAVL);
                printf("Total de NÒS: %d\n\n", x);
            gettimeofday(&tempo_fim,NULL);
            tempoAVLOrd = calcTempo(tempo_inicio,tempo_fim);


            gettimeofday(&tempo_inicio,NULL);
                ordena_quicksort(vetDados,0,N-1);
                printf("\nArvore LLRB:\n");
                y = preencheLLRB(raizLLRB, vetDados);
                if(y){
                    printf("Elementos inseridos\n");
                }else{
                    printf("Não inserido\n\n");
                }
                y = totalNO_arvoreLLRB(raizLLRB);
                printf("Total de NÒS: %d\n\n", y);
            gettimeofday(&tempo_fim,NULL);
            tempoLLRBOrd = calcTempo(tempo_inicio,tempo_fim);


            printf("\n\nTempo gasto durante a operação:");
            printf("\nInserção ordenada na AVL: %.3f milisegunos", tempoAVLOrd/1000);
            printf("\nInserção ordenada na LLRB: %.3f milisegundos", tempoLLRBOrd/1000);
            break;
        case 2:
            system("clear");
            ///system("cls");
            gettimeofday(&tempo_inicio,NULL);
                printf("Arvore AVL:\n");
                x = preencheAVL(raizAVL, vetDados);
                if(x){
                    printf("Elemento inserido\n");
                }else{
                    printf("Não inserido\n\n");
                }
                x = totalNO_arvAVL(raizAVL);
                printf("Total de NÒS: %d\n\n", x);
            gettimeofday(&tempo_fim,NULL);
            tempoAVLDesord = calcTempo(tempo_inicio,tempo_fim);

            gettimeofday(&tempo_inicio,NULL);
                printf("\nArvore LLRB:\n");
                y = preencheLLRB(raizLLRB, vetDados);
                if(y){
                    printf("Elementos inseridos\n");
                }else{
                    printf("Não inserido\n\n");
                }
                y = totalNO_arvoreLLRB(raizLLRB);
                printf("Total de NÒS: %d\n\n", y);
            gettimeofday(&tempo_fim,NULL);
            tempoLLRBDesord = calcTempo(tempo_inicio,tempo_fim);
            printf("\n\nTempo gasto durante a operação:");
            printf("\nInserção Desordenada na AVL: %.3f", tempoAVLDesord/1000);
            printf("\nInserção Desordenada na LLRB: %.3f", tempoLLRBDesord/1000);
            break;

        default:
            printf("\n\nPrograma encerrado!");
            exit(0);
        }
        printf("\n\nPrecione ENTER tecla para continua...");
        getchar();
        getchar();
    }while(op != 0);

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

void gravaDados(func *vetDados){
    FILE *arq;
    arq = fopen("novaMassa.txt","w");
    int i;
	if(arq == NULL)
			printf("Erro, nao foi possivel abrir o arquivo\n");
	else{
        for(i = 0 ; i != N ; i++){
            fprintf(arq,"%d/",vetDados[i].cod);

            fprintf(arq,"%s/",vetDados[i].nome);

            fprintf(arq,"%d/",vetDados[i].idade);

            fprintf(arq,"%s/",vetDados[i].empresa);

            fprintf(arq,"%s/",vetDados[i].dept);

            fprintf(arq,"%.2f;\n",vetDados[i].salario);
        }
	}
	fclose(arq);
}

double calcTempo(struct timeval tempo_inicio, struct timeval tempo_fim){
    double tempo, tf, ti;
    ti = tf = tempo = 0;

    tf = (double)tempo_fim.tv_usec + ((double)tempo_fim.tv_sec * (1000000.0));
    ti = (double)tempo_inicio.tv_usec + ((double)tempo_inicio.tv_sec * (1000000.0));
    tempo = (tf - ti);
    return tempo;
}
