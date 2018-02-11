#include <stdio.h>
#include <stdlib.h>

int ordenacao(int *v, int n);
int main(){
	int n = 10, v[10] = {9, 0, 1, 4, 3, 2, 7, 4, 5, 6};
	
	printf("Ordenação!!\n\n");
	ordenacao(v, n);
	
	return 0;
}

int ordenacao(int *v, int n){
	int i, j, aux;
	int control = n;
	for(i = 0; i < n; i++){
		printf("%d ", v[i]);
	}
	printf("\n\n");
	for(i = 0; i< n; i++){
		for(j = 0; j < control; j++){
			if(v[j] > v[j+1]){
				aux = v[j+1];
				v[j+1] = v[j];
				v[j] = aux;
			}
		}
		printf("%d ", v[i]);
		control--;
	}
	
	return 0;
}
