#include <stdio.h>
#include <stdlib.h>

main(){
    Menu();
}

void Menu(){
    int opcao;
    int num;
    do{
        system("cls");
        printf("1 - Radix Sort\n");
        printf("2 - Quick Sort\n");
        printf("3 - Heap Sort\n");
        printf("4 - Merge Sort\n");
        printf("5 - Buble Sort\n");
        printf("6 - Selection Sort\n");
        printf("7 - Isertion Sort\n");
        printf("8 - Shell Sort\n");
        printf("9 - Media Todas\n");
        printf("0 - Sair\n");
        scanf("%d", &opcao);
        switch(opcao)
        {
            case 1:
                num = submenu();
                elementos(num);
                break;
            case 2:
                oi();
                break;
            case 3:
                oi();
                break;
            case 4:
                oi();
                break;
            case 5:
                oi();
                break;
            case 6:
                oi();
                break;
            case 7:
                oi();
                break;
            case 8:
                oi();
                break;
            case 9:
                oi();
                break;
        }
    }while( opcao != 0);
    sair();
}

int submenu(){
    int op;
    system("cls");
    printf("Escolha um valor: \n");
    printf("1 - 1.000\n");
    printf("2 - 5.000\n");
    printf("3 - 10.00\n");
    printf("4 - 50.00\n");
    printf("5 - 100.000\n");
    scanf("%d",&op);

    switch(op){
    case 1:
        return 1000;
        break;
    case 2:
        return 5000;
        break;
    case 3:
        return 10000;
        break;
    case 4:
        return 50000;
        break;
    case 5:
        return 100000;
        break;

    }
}

void oi(){
    int op;
    printf("Oi!\n");
    printf("1 - Continuar Programa\n");
    printf("2 - Finalizar Programa\n");
    scanf("%d", &op);
    (op == 1) ? Menu() : sair();
}

void elementos(num){
    int i;
    int *array;
    array =malloc (num* sizeof (int));
        for (i=0; i < num; i++) {
           array[i] = rand();
        }

           printf("feito");
       system("pause");
}

void sair(){
    system("cls");
    printf("\n\n\n\n\n\n");
    printf("=============Obrigado  por Utilizar Nosso Programa ! ==============!");
    printf("\n\n\n\n\n\n");
    exit(0);
}
