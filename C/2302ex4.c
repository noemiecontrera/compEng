//Problema 4 - conversão horas
#include <stdio.h>

int main() {
    int horas, min, seg;
    printf("Digite a primeira nota: ");
    scanf("%d", &horas);
    min = horas * 60;
    seg = horas * 3600;
    printf("Minutos: %d", min);
    printf("\nSegundos: %d", seg);
    return 0;
}