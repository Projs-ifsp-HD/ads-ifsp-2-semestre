/*
*    Biblioteca Arvore AVL
*
*/
typedef struct Funcionarios func;

//Arquivo arvoreAVL.h
typedef struct NO *arvAVL;

//Arquivo arvoreAVL.h
arvAVL *cria_arvAVL();

//Arquivo arvoreAVL.h
void liberar_arvAVL(arvAVL *raiz);

//Arquivo arvoreAVL.h
int vazia_arvAVL(arvAVL *raiz);

//Arquivo arvoreAVL.h
int altura_arvAVL(arvAVL *raiz);

//Arquivo arvoreAVL.h
int totalNO_arvAVL(arvAVL *raiz);

//Arquivo arvoreAVL.h
void preOrdem_arvAVL(arvAVL *raiz);

//Arquivo arvoreAVL.h
void emOrdem_arvAVL(arvAVL *raiz);

//Arquivo arvoreAVL.h
void posOrdem_arvAVL(arvAVL *raiz);

//Arquivo arvoreAVL.h
int insere_arvAVL(arvAVL *raiz, func vetDados);

//Arquivo arvoreAVL.h
int remove_arvAVL(arvAVL *raiz, int valor);

//Arquivo arvoreAVL.h
int consulta_arvAVL(arvAVL *raiz, int valor);
