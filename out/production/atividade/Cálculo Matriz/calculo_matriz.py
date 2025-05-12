#Crie um programa que crie uma matriz de dimensão 3x3 
#e preencha com valores lidos pelo teclado.
#No final, mostre a matriz na tela, com a formatação correta.
matriz_a = [[0,0,0], [0,0,0],[0,0,0]]
for l in range(0, 3): #o l representa as linhas da matriz A
    for c in range(0,3): # e o c representa as colunas da matriz
        matriz_a [l] [c] = int(input(f'Digite um valor para [{l}, {c}] da matriz A: '))
for l in range(0, 3):
    for c in range(0, 3):
        print(f'[{matriz_a[l][c]:^5}]', end='')
    print()
print('-=' * 30)

matriz_b = [[0,0,0],[0,0,0],[0,0,0]]
for l in range(0,3): #o k representa as linhas da matriz B
    for c in range(0,3):#o v representa as colunas da matriz B
        matriz_b [l] [c] = int(input(f'Digite um valor para [{l}, {c}] da matriz B: '))
for l in range(0, 3):
    for c in range(0, 3):
        print(f'[{matriz_b[l][c]:^5}]', end='')
    print()
print('-=' * 30)

escolha=int(input("Você quer somar(1), subtrair(2) ou multiplicar(3) as matrizes?: "))

resultado = [[0,0,0],[0,0,0],[0,0,0]]

if escolha==1:
    for l in range(3):
        for c in range(3):
            resultado[l][c] = matriz_a[l][c] + matriz_b[l][c]
    print("Resultado da soma:")
elif escolha==2:
    for l in range(3):
        for c in range(3):
            resultado[l][c] = matriz_a[l][c] - matriz_b[l][c]
    print("Resultado da subtração:")
elif escolha==3:
    for l in range(3):
        for c in range(3):
            resultado[l][c] = matriz_a[l][c] * matriz_b[l][c]
    print("Resultado da multiplicação:")
else:
    print("Opção inválida!")

for l in range(3):
    for c in range(3):
        print(f'[{resultado[l][c]:^5}]', end='')
    print()