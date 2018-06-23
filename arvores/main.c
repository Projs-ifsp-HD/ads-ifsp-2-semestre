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

int main(){
    int x, y, op, i, n = 9;
    func *vetDados;///Vetor para axuliar na inserção nas arvores
    arvAVL *raizAVL;///Ponteiro para a arvore AVL
    arvoreLLRB *raizLLRB;///Ponteiro para a arvore LLRB

    vetDados = cria_lista_func();///Cria o vetor auxiliar.
    preenche_func(vetDados);///Lê a massa de dados e salva no vet. auxiliar

    raizAVL = cria_arvAVL();///Cria a arvore AVL
    raizLLRB = cria_arvoreLLRB();///Cria a arvore LLRB

    menu(op,vetDados, raizAVL, raizLLRB);///Excuta o menu de opções

/**
    printf("\n\nARVORE AVL\n\n");


    printf("\n");
    x = preencheAVL(raizAVL, vetDados);
    if(x){
        printf("Elemento inserido\n");
    }else{
        printf("Não inserido\n\n");
    }



    //Verifica se a AVL está vazia
    if(vazia_arvAVL(raizAVL)){
        printf("A arvore esta vazia.");
    }else{
        printf("A Arvore possui elementos.");
    }
    printf("\n");

    //Libera a AVL
    liberar_arvAVL(raizAVL);
    printf("\n\n\n");

    //x = insere_arvAVL(raizAVL, vetDados);
    //y = insere_arvoreLLRB(raizLLRB, 150);

    printf("\n\nARVORE RUBRO NEGRA\n\n");
    y = preencheLLRB(raizLLRB, vetDados);
    if(y){
        printf("Elemento inserido\n");
    }else{
        printf("Não inserido\n\n");
    }
    x = totalNO_arvoreLLRB(raizAVL);
    printf("Total de NÒS LBBR: %d\n\n", x);

    //Verifica se a rubro negra está vazia
    if(vazia_arvoreLLRB(raizLLRB)){
        printf("A arvore esta vazia.");
    }else{
        printf("A Arvore possui elementos.");
    }
    printf("\n");

    //libera a rubro negra
    liberar_arvoreLLRB(raizLLRB);

    */
}
