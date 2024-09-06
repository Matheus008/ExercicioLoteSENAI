Feature: Produção de camisetas 
  Scenario: Gerar número de lote e mostrar quantidade de camisetas por tamanho e cor
    Given A quantidade total do lote que é 30 camisetas
    And Sendo 10 camisetas da cor "Azul" e tamanho "P"
    And Sendo 10 camisetas da cor "Azul" e tamanho "M"
    And Sendo 10 camisetas da cor "Azul" e tamanho "G"
    And Coloca a produção como finalizada
    When Finalizada emite o número da nota fiscal 
    Then Coloca o lote como pronto para envio
    And É preparado para despacho
    And Gera um código de validação
