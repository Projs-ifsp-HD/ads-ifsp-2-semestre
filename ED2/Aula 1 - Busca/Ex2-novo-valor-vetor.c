#include <stdio.h>
#include <stdlib.h>

//Protótipos
int buscaLinear(int *v, int n, int elem);

int main(){
	int elem = 15, n = 6;
	int v[6] = {10,  30, 40, 50, 60};
	
	
	pushArray(v, n, elem);
	return 0;
}

int pushArray(int *v, int n, int elem){
	int i, control, j, aux;
	control = n-1;
	v[control] = elem;
	
	for(i = 0; i< n; i++){
		for(j = n-1; j > 0; j--){
			if(v[j] < v[j-1]){
				aux = v[j-1];
				v[j-1] = v[j];
				v[j] = aux;
			}
		}
		printf("%d ", v[i]);
		//control++;
	}
	
	return 0;
}
