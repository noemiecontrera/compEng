import os
num= int(input("Digite o nº: " ))

def fatorial(numero):
	fat = 1
	for i in range(numero, 1, -1):
		fat = fat * i
	return fat

print("Resultado: ", fatorial(num))
	