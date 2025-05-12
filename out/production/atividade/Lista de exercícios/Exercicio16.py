# 1° Solicitei o número de cigarros fumados por dia  
# 2° Solicitei o número de anos que a pessoa fumou  
# 3° Calculei a quantidade total de minutos perdidos devido ao fumo  
# 4° Convertei os minutos perdidos para dias  
# 5° Exibi a quantidade de dias de vida perdidos  

# Exercício 16 - Desenvolvido por Gabriel Muchon Pavanelli. Faculdade Impacta 20/02/2025.

# 16 [DESAFIO] Escreva um programa em Python para calcular a redução do tempo de vida
# de um fumante. Pergunte a quantidade de cigarros fumados por dia e quantos anos ele
# já fumou. Considere que um fumante perde 10 min de vida a cada cigarro.
# Calcule quantos dias de vida um fumante perderá e exiba o total em dias.

# Solicita o número de cigarros fumados por dia
n = int(input("Digite o número de cigarros que você fuma por dia: "))

# Solicita o número de anos que a pessoa fuma
anos = int(input("Digite o número de anos que fumou na vida: "))

# Calcula a quantidade total de minutos perdidos devido ao fumo
minutos_ano = 60 * 24 * 365
total_minutos_perdidos = (minutos_ano * n * anos) / 10

# Converte os minutos perdidos para dias
dias_perdidos = total_minutos_perdidos / (60 * 24)

# Exibe a quantidade de dias de vida perdidos
print(f"Você perdeu: {dias_perdidos:.0f} dias de vida")
