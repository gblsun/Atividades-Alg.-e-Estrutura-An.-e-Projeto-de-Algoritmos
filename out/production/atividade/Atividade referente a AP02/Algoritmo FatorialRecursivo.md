Algoritmo FatorialRecursivo

Início
    Ler número inteiro n
    resultado ← fatorial(n)
    Escrever resultado
Fim

Função fatorial(n: inteiro): inteiro
    Se n == 1 então
        retornar 1
    Senão
        retornar n * fatorial(n - 1)
FimFunção

Referências:
Aula de Técnicas de Programação: Reaproveito do código “fatorial recursivo” e “Linear Fibonacci” realizado durante as aulas. Com base nele utilizei: 
“Atividade AP02” da matéria de Algoritmos e Estrutura de Dados que tinha como objetivo fazer o algoritmo (Conforme o modelo especificado), fui me baseando nele e adaptando coisas nos algoritmos da atividade proposta.
