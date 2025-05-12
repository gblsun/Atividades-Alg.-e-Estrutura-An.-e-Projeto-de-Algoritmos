# Exercício 14 - Desenvolvido por Gabriel Muchon Pavanelli. Faculdade Impacta 19/02/2025.

# 14 - A locadora de carros precisa da sua ajuda para cobrar seus serviços.
# Escreva um programa em Python que pergunte a quantidade de Km percorridos por um carro alugado
# e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, sabendo
# que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.

# Solicita o modelo do carro alugado
modelo = input("Digite o modelo do carro alugado: ")

# Solicita a quilometragem percorrida pelo veículo alugado
quilometragem = float(input("Digite a quilometragem percorrida do veículo alugado: "))

# Solicita a quantidade de dias pelo qual o veículo foi alugado
quantidade_dias = int(input("Digite a quantidade de dias pelos quais o veículo foi alugado: "))

# Calcula o valor total a ser pago
valor_total = (quilometragem * 0.20) + (quantidade_dias * 90)

# Exibe o valor total a ser pago
print(f"Você deverá pagar: R$ {valor_total:.2f}, por usar por {quantidade_dias} dias e rodar {quilometragem:.2f} km.")
