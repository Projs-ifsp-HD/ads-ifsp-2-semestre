#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <locale.h>
#define MAX 10
#define N 7 //Declaração da constante


//Protótipos
void bubleSort(int *v,int n);
void selectionSort(int *v,int n);
void insertionSort(int *v,int n);
void shellSort(int *v,int n);
void mergeSort(int inicio, int fim, int *v);
void intercala(int inicio, int meio, int fim, int *v);
void ordena_quicksort(int *v, int inicio, int fim);
int particiona(int *v, int inicio, int fim);
int getMax(int arr[], int size);
void radixSort(int arr[], int size);
void exibeVet(int *vet, int n);

int main(){
    setlocale(LC_ALL,"");
    int v[10]={180,190,170,110,100,140,130,120,160,150};
    int n = 10;
    setlocale(LC_ALL,"");
	printf("\nVetor Ordenado:\n");
    ///bubleSort(v , n);
    ///selectionSort(v , n);
    ///insertionSort(v, n);
    ///shellSort(v, n);
    /**mergeSort(0, 10, v);
    exibeVet(v, n);
    }*/

    /**for(int i = 0; i < n; i++){
      ordena_quicksort(v, 0, n - 1);
      printf("%d ", v[i]);
    }*/

    int size = sizeof(v)/sizeof(v[0]);
    radixSort(v, size);
    exibeVet(v, n);


    /*heapSort(v, n);
    exibeVet(v, n);*/

    return 0;
}

//Funções
void bubleSort(int *v,int n){
   int i, continua, aux,fim = n,count=0;
   do{
    continua = 0;
    for(i = 0 ; i < fim - 1 ;i++){
        if(v[i] > v[i+1]){
            aux = v[i];
            v[i] = v[i+1];
            v[i+1] = aux;
            continua = i;
        }
    }
    fim--;
   }while(continua != 0);

    for(i = 0; i < n; i++){
		printf("%d ", v[i]);
	}
}

void selectionSort(int *v,int n){
  int i,j,menor, troca;
  for(i = 0; i < n - 1; i++){
    menor = i;
    for(j = i + 1; j < n ; j++){
        if(v[j] < v[menor]){
            menor = j;
        }
    }
    if(i!=menor){
        troca = v[i];
        v[i] = v[menor];
        v[menor] = troca;
    }
  }
    for(i = 0; i < n; i++){
        printf("%d ", v[i]);
    }
}

void insertionSort(int *v,int n){
  int i,j,aux;
  for(i = 1; i < n ;i++){
    aux = v[i];
    for(j = i;(j > 0) && (aux < v[j-1]); j--){
        v[j] = v[j-1];
    }
    v[j] = aux;
  }
    for(i = 0; i < n; i++){
        printf("%d ", v[i]);
    }
}

void shellSort(int *v,int n){
  int i,j,gap ,k ;
  int x,a[5]={9, 5, 3, 2, 1};

  for(k = 0; k < 5; k++){
    gap = a[k];
    for(i = gap; i < n;i++){
        x = v[i];
        for(j = i - gap; x < v[j] && j >= 0; j = j -gap){
            v[j + gap] = v[j];
        }
        v[j + gap] = x;
    }
  }
    for(i = 0; i < n; i++){
        printf("%d ", v[i]);
    }
}

///MergeSort
void mergeSort(int inicio, int fim, int *v){
    ///Caso base: inicio ser igual ao fim
    if(inicio < fim-1){
        ///Encontra o meio do vetor passado
        int meio = (inicio+fim)/2;
        ///Chama novamente a função mergeSort para a primeira metade do vetor
        mergeSort(inicio, meio, v);
        ///Chama novamente a função mergeSort para a primeira metade do vetor
        mergeSort(meio, fim, v);
        ///Chama função intercala que irá ordenadar e reagrupar o vetor
        intercala(inicio, meio, fim, v);

    }
}

void intercala(int inicio, int meio, int fim, int *v){
    ///i, j e k são usadas como indices para comparar os valores dos vetores
    int i, j, k, *w;///W será o vetor adcional.
    ///Alocação de memoria para o vetor auxiliar com o mesmo tamanho do vetor original
    w = (int *) malloc((fim-inicio) * sizeof(int));
    i = inicio;
    j = meio;
    k = 0;
    ///compara duas posições do vetor enquanto houverem valores
    while(i < meio && j < fim){
        if(v[i] <= v[j]){
            w[k++] = v[i++];
        }
        else{
            w[k++] = v[j++];
        }
    }

    ///Copia os valores restante de uma metado caso não haja mais valores na outra
    while(i < meio){
        w[k++] = v[i++];
    }

    ///Copia os valores restante de uma metado caso não haja mais valores na outra
    while(j < fim){
        w[k++] = v[j++];
    }

    ///Copia os valores do vetor auxiliar para o original
    for(i = inicio; i < fim; i++){
        v[i] = w[i-inicio];
    }
    ///Libera o vetor auxiliar
    free(w);
}
///Fim MergeSort

///QuickSort
void ordena_quicksort(int *v, int inicio, int fim){
    int pivo;
    //Se o fim for maior que o inicio
    if(fim >inicio){
        //pivo chama a função de particionar o vetor para achar a posição central
        pivo = particiona (v,inicio,fim);
        //Ordena a parte da esquerda do vetor
        ordena_quicksort(v,inicio,pivo - 1);
        //Ordena a parte direita do vetor
        ordena_quicksort(v,pivo + 1,fim);
    }

}

int particiona(int *v, int inicio, int fim){
    int  esq, dir,pivo,aux;
    esq =inicio; // recebe a primeira posição do vetor
    dir = fim;  // recebe ultima posição do vetor
    pivo = v[inicio];//recebe o o valor da primeira posição do vetor
    while(esq < dir){ //Nesse momento faz a comparação das posições do vetor

    //Compara o valor da posição esquerda com o pivo,
    //caso satisfaça a comparação a posicação esquerda
    //anda para a direita e compara novamente o valor
        while (v[esq] <= pivo){
            esq++;
        }
    /*Quando o valor da posição esquerda for maior que o pivo,ele vem para essa condição, e executa:
      O valor da posição da direita for maior que o pivo, a poisição direita anda para esquerda fazendo a mesma comparação*/
         while (v[dir] > pivo){
            dir--;
        }
    /*Momento da troca quando a posição esquerda for menor que o direito uma variavel auxiliar recebe o valor de onde a
    posição esquerda está O valor de esquerdo recebe o valor da posição direita e a posição direita recebe o valor de
    auxiliar*/

        if (esq < dir){
        aux = v[esq];
        v[esq] = v[dir];
        v[dir] = aux;
        }
    }
   /*Nesse momento é quando a posição do esquerdo é maior que o direito então o valor que está no inicio
   recebe o valor que esta na posição direita, e o valor da posição direita recebe o valor do Pivo e
   retorna posição direita*/
    v[inicio] = v[dir];
    v[dir] = pivo;
    return dir;
}
///Fim QuickSort

///radixSort
int getMax(int arr[], int size) {
    int i, max = arr[0];
    for(i = 1; i < size; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

void radixSort(int arr[], int size) {
    int i, max, bucket[MAX], count[10], expo = 1;

    //Recebe o maior valor do Array não ordenado
    max = getMax(arr, size);

    while(max / expo > 0) {
        //Reseta a contagem
        for(i = 0; i < 10; i++) {
            count[i] = 0;
        }

        //Salva a contagem das ocorrencias
        for(i = 0; i < size; i++) {
            count[ (arr[i] / expo) % 10 ]++;
        }

        //Coloca a contagem para conter a posição dos digitos
        for(i = 1; i < size; i++) {
            count[i] += count [i - 1];
        }

        //Constroi o "bucket", nosso vetor de apoio
        for(i = size - 1; i >= 0; i--) {
            bucket[ count[ (arr[i]/expo) % 10 ]  - 1] = arr[i];
            count[ (arr[i]/expo) % 10 ]--;
        }

        //Copia o resultado pro array
        for(i = 0; i < size; i++) {
            arr[i] = bucket[i];
        }

        //Aumenta o expoente em 10
        expo *= 10;
    }
}
///Fim radixSort

///HeapSort
void heapSort(int *vet, int n) {
	int k, aux;
	for (k = (n - 1) / 2; k >= 0; k--) { //Começa da metade do vetor, e vai até o inicio. Nesse loop é definido que os vetores "pais" serão maiores que os filhos
		criaHeap(vet, k, n - 1); //Chamada da função para organização do vetor
	}
	for (k = n - 1; k >= 1; k--) { //Alocação dos maiores vetores ao final em sequência (maior para menor).
		aux = vet[0]; //Guarda o valor da 1 posição do vetor
		vet[0] = vet[k]; //Substitui o valor da 1 posição do vetor com o valor da ultima.
		vet[k] = aux; //Atribui o valor da 1 posição (começo do loop) para a ultima.
		criaHeap(vet, 0, k - 1); //Chamada da função para alocação. PASSADO UM NOVO FIM, O VALOR ATUAL DE K - 1.
	}
}

void criaHeap(int *vet, int i, int f) {
	int aux = vet[i]; //Guarda o valor do pai.
	int j = (i * 2) + 1; //Acha o valor do 1º filho
	while (j <= f) {
		if (j < f) { //verifica se o pai tem 2 filhos
			if (vet[j] < vet[j + 1]) { //Seleciona o maior filho para operação
				j = j + 1;
			}
		}
		if (aux < vet[j]) { //Verifica se o pai é menor que o filho (maior), selecionado anteriormente
			vet[i] = vet[j];  //troca pai com filho
			i = j; //Muda posição do index (pai) a ser verificada
			j = (2 * i) + 1; //Determina o 1º filho do novo index (pai)
		} else { //Caso o pai seja maior
			j = f + 1; //sai do loop
		}
	}
	vet[i] = aux; //Ao final do loop, insere no index verificado o valor passado pela função "heapSort" guardado pelo
}
///Fim HeapSprt

void exibeVet(int *vet, int n) {
	int i;
	for (i = 0; i < n; i++) {
		printf("%d ", vet[i]);
	}
}
