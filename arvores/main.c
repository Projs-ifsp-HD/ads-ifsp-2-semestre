#include <stdio.h>
#include <stdlib.h>
#include "arvoreAVL.h"
#include "arvoreLLRB.h"

int main(){
    int x;
    int y;

    printf("\n\nARVORE AVL\n\n");
    //ARVORE AVL
    arvAVL *raizAVL;
    arvoreLLRB *raizLLRB;

    //Cria as duas arvores
    raizAVL = cria_arvAVL();
    raizLLRB = cria_arvoreLLRB();
    printf("\n");

    //Insere nas duas arvores
    x = insere_arvAVL(raizAVL, 160);
    y = insere_arvoreLLRB(raizLLRB, 150);

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
