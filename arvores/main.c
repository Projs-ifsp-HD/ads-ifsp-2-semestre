#include <stdio.h>
#include <stdlib.h>
#include "arvoreAVL.h"
#include "arvoreLLRB.h"
#include "funcoes.h"

int main(){
    int x;
    int y;
    func *vetDados;///Vetor de struct
    //cria e aloca memoria
    vetDados = cria_lista_func();
    //preenche com os dados
    preenche_func(vetDados);


    printf("\n\nARVORE AVL\n\n");
    //ARVORE AVL
    arvAVL *raizAVL;
    arvoreLLRB *raizLLRB;

    //Cria as duas arvores
    raizAVL = cria_arvAVL();
    raizLLRB = cria_arvoreLLRB();
    printf("\n");

    //Insere nas duas arvores

    x = preencheAVL(raizAVL, vetDados);
    if(x){
        printf("Elemento inserido\n");
    }else{
        printf("Não inserido\n\n");
    }

    if(vazia_arvAVL(raizAVL)){
        printf("A arvore esta vazia.");
    }else{
        printf("A Arvore possui elementos.");
    }
    printf("\n");

    //x = insere_arvAVL(raizAVL, vetDados);
    //y = insere_arvoreLLRB(raizLLRB, 150);


    x = mostra(raizAVL);
    //Verifica se a AVL está vazia


    //Libera a AVL
    liberar_arvAVL(raizAVL);
    printf("\n\n\n");

    printf("\n\nARVORE RUBRO NEGRA\n\n");
    //Verifica se a rubro negra está vazia
    if(vazia_arvoreLLRB(raizLLRB)){
        printf("A arvore esta vazia.");
    }else{
        printf("A Arvore possui elementos.");
    }
    printf("\n");

    //libera a rubro negra
    liberar_arvoreLLRB(raizLLRB);
}
