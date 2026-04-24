import os, math

def distancia(xa, ya, xc, yc):
    return math.sqrt((xc-xa)**2 + (yc-ya)**2)


xc = float(input("Coordenada Xc: "))
yc = float(input("Coordenada Yc: "))
r = float(input("Raio da circunferência: "))
xa = float(input("Digite Xa: "))
ya = float(input("Digite Ya: "))
d = distancia(xa, ya, xc, yc)

if d < r:
    print("Dentro da circunferência")
elif d == r:
    print("Sobre da circunferência")
elif d > r:
    print("Fora da circunferência")