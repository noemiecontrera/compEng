programa {
  funcao inicio() {
     real saldo, cred1, cred2, cred3

     escreva("Insira o seu saldo R$ ")
      leia(saldo)

      cred1 = (saldo * 0.2)
      cred2 = (saldo * 0.3)
      cred3 = (saldo * 0.4)
      
        se (saldo <= 200 ) {escreva("Você não possui créditos suficientes!")}
          senao se (200 < saldo <= 400) {escreva("(C1) Seu crédito é de R$ ", cred1)}
            senao se (400 < saldo <= 600) {escreva("(C2) Seu crédito é de R$ ", cred2)}
              senao se (saldo>= 601) {escreva("(C3) Seu crédito é de R$ ", cred3)}
  }
}
