programa {
  funcao inicio() {
    real A, B, abTroca

    escreva("Insira o valor A ")
      leia(A)

    escreva("Insira o valor B ")
      leia(B)
      
    abTroca = A
    A = B 
    B = abTroca
      escreva ("Valor de A = ", A, "\n", "Valor de B = ", abTroca)
    
  }
}
