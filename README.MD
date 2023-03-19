# Aula 1.3: Verbos HTTP e status de respostas
Os verbos http ou métodos http são uma especificação utilizada como semântica para a utilização dos recursos
através do protocolo especificado. 

## Os principais métodos https são:
### GET:
Utilizado para consultar os recursos através de uma requisição, o mesmo deve retornar um status juntamente com o conteúdo solicitado.

### POST:
Utilizado para criação de um recurso através do protocolo HTTP, também retorna como resposta um status e/ou conteúdo informando
a alteração realizada naquele recurso.

### PATCH
Utilizado para aplicar modificações parciais em algum recurso através do protocolo HTTP.

### PUT
Este método já é utilizado para aplicar modificações em todos os elementos de um recurso.

### DELETE
Utilizado para deletar um recurso específico.

## Status
Os status http são uma numeração atribuida ao retorno de resposta para quem realizou a requisição, através
deles podemos fornecer métodos de respostas compreencivas que possam nos nortear em relação a uma requisição realizada.

Os códigos de status se dividem em 5 tipos 

### Respostas informativas: 
utilizada para informar a situação da requisição

### Resposta de sucesso:
utilizado para informar que a requisição foi realizada com sucesso!

### Mensagens de redirecionamento
Utilizado para infromar que a requisição feita foi redirecionada para outro recurso

### Mensagens de erro no cliente:
Utilizado para informar que houve um erro durante a requisição no lado do cliente.

### Mensagens de erro no servidor:
Utilizado para informar que o erro ocorreu do lado do servidor e que ele não soube tratar

# Aula 1.4: Content Negtiation
A negociação de conteúdo e uma forma de fazer com que aplicação aceite outros formatos utilizado pelos clientes, contanto que
seja implementada uma conversão do formato utilizado pelo cliente para o formato padrão.

