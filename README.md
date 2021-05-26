

# Prova 1 descrição

## Aluno: Luís Gustavo Morais Teixeira Campos

## Divisão

 - Principal
 - Lutador
 - Torneio
 - Combate

## Método Principal
Contém a importação das outras classes e o teste delas

## Método Lutador
**Métodos** 

 - Construtor
	 - Cria um novo lutador.
	 - Coleta e armazena os Atributos nome, raca e objetivo.
 - FichaLutador
	 - Coleta e armazena os atributos forca, destreza, inteligencia e energia.
	 - Chama o método 'DeterminaCategoria'.
	 - Exibe a Ficha do lutador criado.
 - StatusLutador
	 - Confere se já possuí todos os atributos do lutador.
	 - Exibe os *status* do Lutador.
 - DeterminaCategoria
	 - Calcula os Atributos poder, fisico e magico.
	 - Determina o Atributo categoria com base do valor do atributo poder.
	 - Determina o estilo de combate do lutador comparando os atributos fisico e magico do lutador.

**Atributos** 

 - nome
	 - Guarda o nome do lutador.
 - raca
	 - Guarda a raça do lutador.
 - objetivo
	 - Guarda os objetivos do lutador.
 - categoria
	 - Guarda a categoria em que o lutador se encontra.
 - poder
	 - Guarda o valor número referente ao poder do lutador.
 - inteligencia
	 - Guarda o valor numérico referente a inteligência do lutador.
 - forca 
	 - Guarda o valor numérico referente a força do lutador.
 - destreza 
	 - Guarda o valor numérico referente a destreza do lutador.
 - energia
	 - Guarda o valor numérico referente a energia do lutador.
 - fisico
	 - Guarda o valor numérico referente ao lado físico do lutador.
 - magico
	 - Guarda o valor numérico referente ao lado mágico do lutador.
 - estilo
	 - Guarda o estilo de combate do lutador

## Método Torneio
**Métodos** 

 - Construtor
	 - Cria um novo torneio.
	 - Coleta e armazena os Atributos nome, local, descricao e numeroPatrocinadores.
 - AbrirInscricao
	 - Coleta e armazena os Atributos abertura, encerramento e valortaxa.
	 - Muda o Atributo abertoInscricao para *true*.
	 - Informa a data de abertura das inscrições para entrar no torneio, quanto é para entrar e até quando você poderá se inscrever.
 - FecharInscricao
	 - Coleta e armazena o Atributo numeroInscritos.
	 - Verifica se o Atributo abertoInscricao é *true* ou *false*.
	 - Se o valor for *true*, informa o número de participantes do torneio, de quanto será o valor do prêmio, encerra as inscrições e chama o Método 'CalculoPremio'.
	 - Se o valor for *false*, informa que as inscrições ainda não foram abertas.
 - CalculoPremio
	 - Calcula o Atributo valorPremio com base nos Atributo valorTaxa, numeroParticipantes e numeroPatrocinadores.

**Atributos** 

 - nome
	 - Guarda o nome do torneio.
 - local
	 - Guarda o nome do local do torneio.
 - descricao
	 - Guarda a descrição do torneio.
 - valorPremio
	 - Guarda o valor que será dado como prêmio pelo torneio.
 - numeroPatrocinadores
	 - Guarda o número de patrocinadores do torneio.
 - numeroParticipantes
	 - Guarda o número de participantes do torneio.
 - valorTaxa
	 - Guarda o valor número referente a taxa necessária para entrar no torneio.
 - abertura
	 - Guarda a data de abertura das inscrições do torneio.
 - encerramento
	 - Guarda a data de encerramento das inscrições do torneio.
 - abertoInscricao
	 - Guarda se as inscrições estão abertas.

## Método Combate 
**Métodos**

 - Construtor
	 - Cria um novo combate.
	 - Coleta e armazena os Atributos nomeLutador1, nomeLutador2 e localLuta.
 - PrepararLuta
	 - Coleta e armazena os Atributos dataLuta, poderLutador1 e poderLutador2.
	 - Informa que os preparos foram iniciados.
	 - Chama o método 'PrepararLocal'.
	 - Chama o método 'PrepararLutador1'.
	 - Chama o método 'PrepararLutador2'.
	 - Informa que os preparos foram concluídos e onde e quando será a luta.
 - ResultadoLuta
	 - Confere se os Atributos lutador1Preparado, lutador2Preparado e localPreparado são *true*.
	 - Se todos forem *true*, chama o método 'DecideVencedor'. e informa o vencedor.
	 - Se algum deles for false, informa qual deles não está pronto.
 - PrepararLocal
	 - Coleta e armazena o Atributo dataLuta.
	 - Escolhe qual será a arena.
	 - Muda o Atributo localPreparado para *true*.
 - PrepararLutador1
	 - Coleta e armazena o Atributo poderLutador1.
	 - Solta uma frase de efeito do primeiro lutador.
	 - Concede um bônus ao primeiro lutador.
	 - Muda o Atributo lutador1Preparado para *true*.
 - PrepararLutador2
	 - Coleta e armazena o Atributo poderLutador2.
	 - Solta uma frase de efeito do segundo lutador.
	 - Concede um bônus ao segundo lutador.
	 - Muda o Atributo lutador2Preparado para *true*.
 - DecideVencedor
	 - Compara os Atributos poderLutador1 e poderLutador2, o maior vence.
	 - Caso os Atributos tenham valores iguais, há um empate e o programa pede para que outra partida seja marcada

**Atributos** 

 - nomeLutador1
	 - Guarda o nome do primeiro lutador.
 - nomeLutador2
	 - Guarda o nome do segundo lutador.
 - poderLutador1
	 - Guarda o valor número referente ao poder do primeiro lutador.
 - poderLutador2
	 - Guarda o valor número referente ao poder do segundo lutador.
 - localLuta
	 - Guarda o nome do local de onde acontecerá a luta.
 - lutador1Preparado
	 - Guarda se o primeiro lutador está preparado para a luta.
 - lutador2Preparado
	 - Guarda se o segundo lutador está preparado para a luta.
 - localPreparado
	 - Guarda se o local está preparado para a luta
 - dataLuta
	 - Guarda a data em que ocorrerá a luta.
 - vencedor
	 - Guarda o nome do vencedor da luta.
