//Problema 1 - potencial elétrico
#include <stdio.h>

int main() {
    float corrente, tensao, potencial;
    printf("Digite a corrente: ");
    scanf("%f", &corrente);
    printf("Digite a tensão: ");
    scanf("%f", &tensao);
    potencial = corrente * tensao;
    printf("O potencial elétrico é: %.2f", potencial);
    return 0;
}