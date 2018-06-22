typedef struct Funcionarios{
    int cod;
    char nome[50];
    int idade;
    char empresa[50];
    char dept[100];
    float salario;
}func;


void preenche_func(func *vetDados);

func *cria_lista_func();

void strreplace(char *s, char chr, char repl_chr);

void mostraVetor();

void ordena_quicksort(func *vetDados, int inicio, int fim);

int particiona(func *vetDados, int inicio, int fim);

void gravaDados(func *vetDados);

