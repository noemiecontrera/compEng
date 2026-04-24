import os, math

def distancia(xa, ya, za, xc, yc, zc):
    return math.sqrt((xc-xa)**2 + (yc-ya)**2  + (zc-za)**2)


xc = float(input("Coordenada Xc: "))
yc = float(input("Coordenada Yc: "))
zc = float(input("Coordenada Zc: "))
r = float(input("Raio da circunferência: "))
xa = float(input("Digite Xa: "))
ya = float(input("Digite Ya: "))
za = float(input("Digite Za: "))
d = distancia(xa, ya, za, xc, yc, zc)

if d < r:
    print("Dentro da esfera")
elif d == r:
    print("Sobre da esfera")
elif d > r:
    print("Fora da esfera")