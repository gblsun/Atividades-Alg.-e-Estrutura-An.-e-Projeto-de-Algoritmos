
Algoritmo BinarySum

Início
Ler binário1 (string binária)
Ler binário2 (string binária)
resultado ← somarBinarios(binário1, binário2)
Escrever resultado
Fim

Função somarBinarios(binário1: string, binário2: string): string
num1 ← ConverterBinarioParaDecimal(binário1)
num2 ← ConverterBinarioParaDecimal(binário2)
soma ← num1 + num2
retornar ConverterDecimalParaBinario(soma)
FimFunção

Função ConverterBinarioParaDecimal(binário: string): inteiro
retorno ← converter binário em número decimal
FimFunção

Função ConverterDecimalParaBinario(decimal: inteiro): string
retorno ← converter decimal em binário
FimFunção
