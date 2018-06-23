#include <stdio.h>
#include <stdlib.h>
#include "arvoreAVL.h"
#include "arvoreLLRB.h"
#include "funcoes.h"

int main(){
    int x;
    int y;
    func *vetDados;///Vetor de struct
    arvAVL *raizAVL;
    arvoreLLRB *raizLLRB;

    vetDados = cria_lista_func();
    preenche_func(vetDados);


    printf("\n\nARVORE AVL\n\n");
    raizAVL = cria_arvAVL();
    raizLLRB = cria_arvoreLLRB();

    printf("\n");
    x = preencheAVL(raizAVL, vetDados);
    if(x){
        printf("Elemento inserido\n");
    }else{
        printf("Não inserido\n\n");
    }

    x = totalNO_arvAVL(raizAVL);
    printf("Total de NÒS: %d\n", x);

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
}
