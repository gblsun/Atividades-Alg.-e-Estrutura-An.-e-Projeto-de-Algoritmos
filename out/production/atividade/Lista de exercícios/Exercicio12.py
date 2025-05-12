# Exercício 12 - Desenvolvido por Gabriel Muchon Pavanelli. Faculdade Impacta 19/02/2025.

# 12 - Crie um programa em Python que leia o preço de um produto, calcule e mostre o
# seu PREÇO PROMOCIONAL, com 5% de desconto.

# Solicita o nome do produto ao usuário
produto = input("Digite o nome do produto: ")

# Solicita o preço do produto ao usuário
preco = float(input("Digite o preço do produto: "))

# Calcula o preço promocional com 5% de desconto
preco_promocional = preco - (preco * 0.05)

# Exibe o resultado
print(f"O valor do produto {produto} possui o valor de: {preco:.2f}.")
print(f"Porém, com o desconto de 5%, o produto acaba saindo por: {preco_promocional:.2f}")
