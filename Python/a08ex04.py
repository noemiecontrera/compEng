import os

a = float(input("Digite o 1º lado: "))
b = float(input("Digite o 2º lado: "))
c = float(input("Digite o 3º lado: "))

if (a + b)> c and (a + c)> b  and (b +c)> a:  
	semip = (a + b + c)/2
	area = (semip * (semip - a) * (semip - b) * (semip - c))**0.5
	print("Área do triângulo = ", area)
else:
	print("Não é um triângulo!")
