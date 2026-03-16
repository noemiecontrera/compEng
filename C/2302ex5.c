//Problema 5 - divisão por 2
#include <stdio.h>

int main() {
    int num, quo, resto;
    printf("Digite o nº a ser dividido por 2: ");
    scanf("%d", &num);
    quo = num / 2;
    resto = num % 2;
    printf("Quociente: %d", quo);
    printf("\nResto: %d", resto);
    return 0;
}