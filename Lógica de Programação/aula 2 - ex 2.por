programa {
  funcao inicio() {
    inteiro nLar
      real vUnit, vTotal

       escreva("Quantas laranjas serão compradas? ")
         leia(nLar)

      se (nLar >= 12) {vUnit =  0.3}
        senao {vUnit = 0.5}
          vTotal = nLar * vUnit
             escreva ("Valor total R$ ", vTotal)
  }
}
