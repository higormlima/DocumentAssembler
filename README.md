# Document Assembler

Projeto desenvolvido em Java com o objetivo de demonstrar um pouco das minhas habilidades como desenvolvedor. O projeto foi implementado em algumas horas e não está completo. Como o objetivo é demonstrar o que poderia ser feito em um intervalo de tempo restrito, eu acredito que o que foi feito é o suficiente.

## Como funciona?

O projeto define documentos que possuem uma estrutura de árvore. Nessa estrutura, existem dois tipos de nós: Ramos e Folhas. As Folhas, em específico, possuem um atributo de texto que pode ser exibido através de estruturas definidas como "Printer".

## Tipos de Printer

Como forma de exemplificação, foram criados dois tipos de Printer. O PreorderPrinter percorre os documentos com a estratégias denominada como Pré-Ordem e imprime o valor do atributo de texto de cada uma das folhas da árvore conforme percorre a árvore.

O segundo componente criado é chamado de ByLevelPrinter. Esse componente percorre a árvore por nível e assim como o PreorderPrinter, imprime o valor do campo de texto de cada um dos nós folhas conforme percorre a árvore.

## Exemplos

Ao iniciar o projeto, alguns exemplos são inicializados. São criados dois documentos nos quais são percorridos pelos dois tipos de Printer e então exibidos no console.

## Monitoramento da execução

Um sistema de log foi criado para monitorar a execução da aplicação. Os logs são registrados em um arquivo chamado "log_file.txt". No projeto, com o propósito de mostrar um exemplo de monitoramento, existe um arquivo "log_file.txt" commitado com algumas informações de execução anteriormente realizadas.

## User Interface

Uma interface de usuário simples foi criada para aceitar comandos do usuário através da linha de comando. A interface está imcompleta e apenas o recurso de criar um novo documento está disponível. A interface é inicializada logo após a exibição dos exemplos.