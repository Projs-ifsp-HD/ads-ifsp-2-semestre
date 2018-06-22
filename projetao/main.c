#include <locale.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "projetao.h"

int main()
{
    int op; ///item escolhido do menu retorna um valor para chamar a arvore .
    int n = 9,i;
    func *vetDados;///Vetor de struct
    //cria e aloca memoria
    vetDados = cria_lista_func();

    //preenche com os dados
    preenche_func(vetDados);

    //ordena
    ordena_quicksort(vetDados,0,8);

    //mostra vetor
    mostraVetor(vetDados);

    //grava os dados em um novo arquivo
    gravaDados(vetDados);

    //menu
    //menu(op);

    return 0;
}
