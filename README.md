# Explicação sobre o programa localizado neste repositório

## Introdução

O programa localizado neste repositório se chama **Produtos em Estoque** e foi desenvolvido por mim, **Lorenzo Fernandes Aguiar**. Este programa permite que o usuário saiba quantos e quais são os produtos armazenados em estoque. Isso é feito através de uma lista na qual produtos podem ser adicionados e removidos pelo usuário.

## Tela Principal

![imagem1](https://github.com/user-attachments/assets/da2e0993-cb08-4c6b-a2c6-23faec9f7c54)

Ao entrar no programa **Produtos em Estoque**, o usuário se depara com a tela **Principal** (mostrada na imagem acima). A tela **Principal** conta com um menu lateral composto por dois botões. O primeiro botão se chama **Adicionar um produto na LISTA DE PRODUTOS EM ESTOQUE**. Já o segundo botão se chama **Remover este produto da LISTA DE PRODUTOS EM ESTOQUE**.

A tela **Principal** ainda possui uma lista chamada de **LISTA DE PRODUTOS EM ESTOQUE**.

## Tela Adicionar Produto

Ao clicar no botão **Adicionar um produto na LISTA DE PRODUTOS EM ESTOQUE**, o usuário será direcionado para a tela **Adicionar Produto** (mostrada na imagem acima). Nesta tela, o usuário poderá adicionar um produto (CAFÉ, por exemplo) na **LISTA DE PRODUTOS EM ESTOQUE**.

Quando o usuário adiciona um produto, a **LISTA DE PRODUTOS EM ESTOQUE** é automaticamente atualizada, sendo que o produto é encaixado de modo que a lista fique em ordem alfabética. Isso pode ser observado na imagem acima, a qual mostra como a **LISTA DE PRODUTOS EM ESTOQUE** ficou depois da inserção do produto CAFÉ. Repare também que, abaixo da **LISTA DE PRODUTOS EM ESTOQUE**, o contador passou de 8 para 9.

É importante ressaltar que o programa **Produtos em Estoque** está integrado com o **PostgreSQL**, o qual é um sistema gerenciador de banco de dados. Isso significa que os dados são persistidos mesmo quando o usuário encerra o programa.

## Tela Remover Produto

Ao clicar no botão **Remover este produto da LISTA DE PRODUTOS EM ESTOQUE**, o usuário será direcionado para a tela **Remover Produto**. Este botão somente se tornará visível quando um, e apenas um, item da **LISTA DE PRODUTOS EM ESTOQUE** estiver selecionado, conforme pode ser visto na imagem acima (o produto CAFÉ está selecionado). Perceba também que, acima do referido botão, há uma mensagem que confirma qual item está selecionado.

Na tela **Remover Produto** (mostrada na imagem acima), há uma mensagem perguntando se o usuário deseja realmente remover o produto selecionado. Caso o usuário clique no botão **Sim**, o produto selecionado é removido tanto do **PostgreSQL** quanto da **LISTA DE PRODUTOS EM ESTOQUE**.

A imagem acima mostra como ficou a **LISTA DE PRODUTOS EM ESTOQUE** após a remoção do produto CAFÉ.

A imagem acima mostra como estava a tabela do **PostgreSQL** antes da remoção do produto CAFÉ.

A imagem acima mostra como ficou a tabela do **PostgreSQL** após a remoção do produto CAFÉ.
