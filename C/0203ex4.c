//Problema 4 - Calculadora
#include <stdio.h>

int main() {
    float num1, num2, result;
    char operacao;
    printf("Insira o primeiro número: ");
    scanf("%f", &num1);
    do {printf("Insira a operação: ");
    scanf(" %c", &operacao);
    } while (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/');
    printf("Insira o segundo número: ");
    scanf("%f", &num2);
    if (operacao == '+') {
        result = num1 + num2;
    } else if (operacao == '-') {
        result = num1 - num2;
    } else if (operacao == '*') {
        result = num1 * num2;
    } else if (operacao == '/') {
        result = num1 / num2;
    } printf ("O resultado é: %.2f", result);
    return 0;
}