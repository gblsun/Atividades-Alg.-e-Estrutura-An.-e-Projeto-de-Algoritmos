FUNÇÃO LinearSum(A: vetor de inteiros, n: inteiro) RETORNA inteiro
    SE n == 0 ENTÃO
        RETORNAR 0
    SENÃO
        RETORNAR LinearSum(A, n - 1) + A[n - 1]
    FIM SE
FIM FUNÇÃO

Referências:
LinearSum

Recursão Linear e LinearSum
https://www.youtube.com/watch?v=lrI37ofURAo
no vídeo ele aborda o tema linearsum sutilmente mas já da um claro entendimento