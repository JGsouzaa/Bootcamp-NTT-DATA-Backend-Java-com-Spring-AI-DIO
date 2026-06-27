Esta é uma API para registros controle de gastos utilizando reconhecimento de fala e inteligência artificial

Este projeto tem como base explorar as possibilidades das ferramentas spring para o desenvolvimento de uma solução moderna utilizando inteligência artificial, buscando aplicar os principais conceitos de Domain Driven Design.

Fluxo principal:
1 - O cliente envia um audio
2 - O audio é transcrito em texto
3 - A aplicação seleciona um use case baseado nas regras de negocio
4 - O use case faz a persistência no banco de dados
5 - A resposta final é convertida em audio

Este é um projeto desenvolvido utilizando as ferramentas de spring:

Spring boot para inicialização da aplicação
Spring data para persistência em banco de dados
Spring AI para integração com o modelo GPT da OpenAI

A entry point da aplicação é o BudgetApplication

É utilizado Docker para isolamento do banco de dados


