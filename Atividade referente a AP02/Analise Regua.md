FUNÇÃO desenhar_regua(n: inteiro)
    SE n > 0 ENTÃO
        CHAMAR desenhar_regua(n - 1)
        IMPRIMIR uma linha com n traços ("-")
        CHAMAR desenhar_regua(n - 1)
    FIM SE
FIM FUNÇÃO

FUNÇÃO regua(n: inteiro)
    IMPRIMIR "|", SEM QUEBRA DE LINHA
    PARA i DE 1 ATÉ n FAÇA
        CHAMAR desenhar_regua(n)
        IMPRIMIR "|", SEM QUEBRA DE LINHA
    FIM PARA
    IMPRIMIR nova linha
FIM FUNÇÃO
Referências:
REGUA RECURSIVIDADE

Aula 14 - Recursividade - Estruturas de Dados com Java
https://www.youtube.com/watch?v=S4Ugy4jqSmM
Uma boa base de recursividade e durante a aula ele da um bom exemplo de como utilizar com régua recursiva
