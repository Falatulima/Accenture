@run2
Feature: Teste

	@tag_scenario
  Scenario: Teste
  
  Given Estou na tela do Tricentis
  When Clico para selecionar marca
  Then Seleciono a marca com "BMW"
  And Informo a potencia com "200"
  And Informo a data de fabricação com "10/06/2022"
  Then Seleciono o numero de assentos com "4"
	And Seleciono tipo de combustivel "Gas"
	And Informo valor "10000"
	And informo placa "abc1234"
	And Informo milhagem anual "11000"
	Then Clico em Next na tela de Dados do veículo
	
	Given Estou na tela de Dados do Segurado
	When Informo nome com "Matheus"
	Then Informo sobrenome com "Lima"
	And Informo data de nascimento com "02/15/1999"
	Then Seleciono o sexo com "Male"
	And Informo a rua com "avenida oiapoque"
	Then Seleciono o país com "Brazil"
	And Informo o CEP com "06454070"
	And Informo a Cidade com "Barueri"
	Then Seleciono ocupação com "Employee"
	And Seleciono Hobbi com "Speeding"
	And Informo site com "https://www.linkedin.com/in/matheus-gon%C3%A7alves-lima-177465162/"
	Then Clico em Next na tela de Dados do Segurado
	
	Given Estou na tela de Dados do Produto
	When Informo a data de início com "12/09/2022"
	Then Seleciono o soma do seguro com "7.000.000,00"
	And Seleciono o bonus do seguro com "Bonus 6"
	And Seleciono cobertura de Danos com "Full Coverage"
	And Seleciono os produtos opcionais com "Euro Protection"
	And Seleciono carro de cortesia "Yes"
	Then Clico em Next na tela de Dados do Produto
	
	Given Estou na tela de seleção de preço
	When Seleciono o plano do seguro com "Platinum"
	Then Clico em Next na tela de seleção de preço
	
	Given Estou na tela enviar cotação
	When Informo o email de contato com "mgl1502@gmail.com"
	Then Informo o telefone com "998362364"
	And Informo um usuário com "matheus1502"
	And Informo uma senha com "@Mg12345"
	And Informo a confirmacao de senha com "@Mg12345"
	And Insiro os comentários com "teste teste teste teste teste teste teste."
	And Clico em Send na tela de enviar cotação
	Then Clico no OK do modal de enviado com sucesso
	
	Then Finalizo a cotação
	