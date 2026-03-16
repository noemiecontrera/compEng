//Problema 2 - contagem regressiva
#include <stdio.h>
int main() {
    int num;
    printf("Insira o número: ");
    scanf("%d", &num);
    for (int i = num; i > 0; i--) {
        printf ("%d \n", i);
    }
    return 0;
}