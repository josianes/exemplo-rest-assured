# new feature
# Tags: optional
# language: pt

Funcionalidade: : Validar chamadas em API Rest
  Como usuário da api
  desejo realizar chamadas Rest
  Com o verbo GET

  Cenário: Realizar GET - consultar endereço com CEP
    Dado que desejo consultar endereço através do CEP "13040145"
    Quando realizo a chamada GET nos correios com o CEP informado
    Então recebo o endereço completo