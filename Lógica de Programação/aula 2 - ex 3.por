programa {
  funcao inicio() {
    inteiro vlr1, vlr2 
    caracter oper

    escreva ("Insira o primeiro nº: ")
      leia (vlr1)
    escreva ("Insira a operação ")
      leia (oper)
    escreva ("Insira o segundo nº: ")
      leia (vlr2)
    
    se (oper == "+") {escreva("Adição: ", vlr1 + vlr2)}
      senao se (oper == "-") {escreva("Subtração: ", vlr1 - vlr2)}
      senao se (oper == "*") {escreva("Multiplicação: ", vlr1 * vlr2)}
      senao se (oper == "/") {escreva("Divisão: ", vlr1 / vlr2)}
      senao {escreva ("ERRO")}
 
  }
}
