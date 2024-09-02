
Feature: Testar o aluguel de veículos 

  Scenario: Pesquisar veículos disponíveis para alugar
  				  e realizar o aluguel
    Given O veículo possui mais de 5 diarias disponiveis
    And O valor da diária deve ser R$ 250 
    When Realizado o aluguel para dias 5 
    Then O status do veículo muda para "indisponível"
    And O reltório da locação deve retornar o preço de 12250


 