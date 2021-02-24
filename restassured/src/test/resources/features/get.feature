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

  Cenário: Validando o campo logradouro
    Dado que ao consultar o logradouro "Avenida São José dos Campos"
    Quando realizo uma pesquisa informando um campo
    Então recebo o valor do campo que está preenchido

  Cenário: Validando o campo bairro
    Dado que ao consultar o bairro "Jardim Nova Europa"
    Quando realizo uma pesquisa informando o bairro
    Então recebo o valor do bairro

  Cenário: Validando o campo cidade
    Dado que ao consultar a cidade "Campinas"
    Quando realizo uma pesquisa informando a cidade
    Então recebo o valor da cidade

  Cenário: Validando o campo uf
    Dado que ao consultar o uf "SP"
    Quando realizo uma pesquisa informando o uf
    Então recebo o valor da uf

  Cenario: Imprimindo os campos no console
    Então imprima todos os campos passados