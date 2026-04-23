import os, math

def distancia2p(xa, ya, xb, yb):
    return math.sqrt((xb-xa)**2 + (yb-ya)**2)

xa = float(input("Digite X (1): "))
ya = float(input("Digite Y (1): "))
xb = float(input("Digite X (2): "))
yb = float(input("Digite Y (2): "))

os.system('cls')
d = distancia2p(xa, xb, ya, yb)
print("A distância é ", d)
