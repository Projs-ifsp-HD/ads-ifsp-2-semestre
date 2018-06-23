/*
*    Biblioteca Arvore binária de Busca
*
*/
typedef struct Funcionarios func;

//Arquivo arvoreLLRB.h
typedef struct NO *arvoreLLRB;

//Arquivo arvoreLLRB.h
arvoreLLRB *cria_arvoreLLRB();

//Arquivo arvoreLLRB.h
void liberar_arvoreLLRB(arvoreLLRB *raiz);

//Arquivo arvoreLLRB.h
int vazia_arvoreLLRB(arvoreLLRB *raiz);

//Arquivo arvoreLLRB.h
int altura_arvoreLLRB(arvoreLLRB *raiz);

//Arquivo arvoreLLRB.h
int totalNO_arvoreLLRB(arvoreLLRB *raiz);

//Arquivo arvoreLLRB.h
void preOrdem_arvoreLLRB(arvoreLLRB *raiz);

//Arquivo arvoreLLRB.h
void emOrdem_arvoreLLRB(arvoreLLRB *raiz);

//Arquivo arvoreLLRB.h
void posOrdem_arvoreLLRB(arvoreLLRB *raiz);

int insere_arvoreLLRB(arvoreLLRB *raiz, func vetDados);

//Arquivo arvoreLLRB.h
int remove_arvoreLLRB(arvoreLLRB *raiz, int valor);

//Arquivo arvoreLLRB.h
int consulta_arvoreLLRB(arvoreLLRB *raiz, int valor);

