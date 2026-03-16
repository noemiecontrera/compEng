//Problema 2 - área de retângulo
#include <stdio.h>

int main() {
    float altura, larg, area;
    printf("Digite o valor da altura: ");
    scanf("%f", &altura);
    printf("Digite o valor da largura: ");
    scanf("%f", &larg);
    area = altura + larg;
    printf("A área é: %f", area);
    return 0;
}