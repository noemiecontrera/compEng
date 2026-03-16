programa {
  funcao inicio() {
    real comp, alt, lar, volume 

    escreva("Insira o comprimento em metros: ")
      leia (comp)
    escreva("Insira a altura em metros: ")
      leia (alt)
    escreva("Insira a largura em metros: ")
      leia (lar)
    
    limpa()
    volume = (comp * alt * lar)
      escreva ("O volume é ", volume, "m³")

  }
}
