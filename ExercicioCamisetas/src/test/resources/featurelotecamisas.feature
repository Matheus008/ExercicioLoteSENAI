Feature: Produção de camisetas
	Scenario: Foram fabricados camisetas da cor azul
		Given A quantidade total de itens: 30 e lote:123
		And Cadastra 10 camisetas da cor "Azul" e tamanho "P"
		And Cadastra 10 camisetas da cor "Azul" e tamanho "M"
		And Cadastra 10 camisetas da cor "Azul" e tamanho "G"
		And Muda o status da produção como finalizada
		When Finalizada a produção uma nota fiscal é emitida para cada lote
		And Detalhando as informações do lote e lista as camisetas do lote
		Then Gera um código de validação para o despacho
		And o lote é marcado como pronto para envio
		
	Scenario: Foram fabricados camisetas da cor branco
		Given A quantidade total de itens: 50 e lote:456
		And Cadastra 15 camisetas da cor "Branco" e tamanho "P"
		And Cadastra 15 camisetas da cor "Branco" e tamanho "M"
		And Cadastra 20 camisetas da cor "Branco" e tamanho "G"
		And Muda o status da produção como finalizada
		When Finalizada a produção uma nota fiscal é emitida para cada lote
		And Detalhando as informações do lote e lista as camisetas do lote
		Then Gera um código de validação para o despacho
		And o lote é marcado como pronto para envio
		
	Scenario: Foram fabricados camisetas da cor preta
		Given A quantidade total de itens: 15 e lote:789
		And Cadastra 5 camisetas da cor "Preto" e tamanho "P"
		And Cadastra 5 camisetas da cor "Preto" e tamanho "M"
		And Cadastra 5 camisetas da cor "Preto" e tamanho "G"
		And Muda o status da produção como finalizada
		When Finalizada a produção uma nota fiscal é emitida para cada lote
		And Detalhando as informações do lote e lista as camisetas do lote
		Then Gera um código de validação para o despacho
		And o lote é marcado como pronto para envio