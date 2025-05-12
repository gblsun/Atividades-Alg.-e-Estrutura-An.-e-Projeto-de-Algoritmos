Algoritmo LinearFibonacci:

Início
     Ler número inteiro n
     resultado ← linearFib(n)
     Escrever “Fibonacci de n é: ” + resultado
 Fim
Função linearFib(n: inteiro): inteiro
     Se n == 1 então
         Retornar 0
     Senão se n == 2 então
         Retornar 1
     Senão
         a ← 0
         b ← 1
         Para i de 3 até n faça
             temp ← b
             b ← a + b
             a ← temp
         FimPara
         Retornar b

Referências:
Aula de Técnicas de Programação: Reaproveito do código “fatorial recursivo” e “Linear Fibonacci” realizado durante as aulas. Com base nele utilizei: 
“Atividade AP02” da matéria de Algoritmos e Estrutura de Dados que tinha como objetivo fazer o algoritmo (Conforme o modelo especificado), fui me baseando nele e adaptando coisas nos algoritmos da atividade proposta.
