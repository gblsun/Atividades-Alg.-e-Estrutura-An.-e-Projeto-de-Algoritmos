# Exercício 15 - Desenvolvido por Gabriel Muchon Pavanelli. Faculdade Impacta 20/02/2025.

# 15 - Crie um programa Python que leia o número de dias trabalhados em um mês e mostre o
# salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

# Solicita o número de dias trabalhados no mês
n = int(input("Digite o número de dias trabalhados em um mês: "))

# Calcula o salário com base no número de dias e horas trabalhadas por dia
salario = 25 * (n * 8)

# Exibe o salário calculado
print(f"Seu salário é: R$ {salario:.2f}")
