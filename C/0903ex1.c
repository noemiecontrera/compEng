//Problema 1 - tabuada
#include <stdio.h>
int main() {
    int num;
    printf("Insira o número: ");
    scanf("%d", &num);
    for (int i = 1; i <= 10; i++) {
        printf ("%d x %d = %d \n", num, i, num*i);
    }
    return 0;
}