# Exercício 13 - Desenvolvido por Gabriel Muchon Pavanelli. Faculdade Impacta 19/02/2025.

# 13 - Faça um programa em Python que leia o salário de um funcionário, calcule e mostre o
# seu novo salário, com 15% de aumento.

# Solicita o nome do funcionário
nome = input("Digite o seu nome: ")

# Solicita o salário do funcionário
salario = float(input("Digite o seu salário: "))

# Calcula o novo salário com 15% de aumento
salario_novo = salario + (salario * 0.15)

# Exibe o novo salário com reajuste
print(f"{nome}, seu novo salário com reajuste, será de: {salario_novo:.2f}")
