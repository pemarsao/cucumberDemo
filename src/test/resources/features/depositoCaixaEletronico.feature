#language: pt

Funcionalidade: Depósito em caixa eletrônico

Cenário: Primeiro depósito em caixa eletrônico
Dado que o Sr Pedro informou a agência "0001"
E informou a conta "54678-0"
E informou o valor de 100.00
Quando confirmar a operação
Entao Ele terá 100.00 na conta

Cenário: Segundo depósito em caixa eletrônico
Dado que o Sr Pedro informou a agência "0001"
E informou a conta "54678-0"
E informou o valor de 100.00
E já tenha um saldo de 100.00
Quando confirmar a operação
Entao Ele terá 200.00 na conta