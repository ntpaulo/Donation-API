
# Donation-API

A DONATION-API é a ferramenta ideal para qualquer organização que deseja otimizar seu processo de gerenciamento de doações e garantir que a ajuda chegue a quem mais precisa, de maneira eficiente e organizada.
*Nossa API foi construída com JAVA e PostgreSQL. *

<div align="center">

![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
</div>

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

Consulte **[Implantação](#-implanta%C3%A7%C3%A3o)** para saber como implantar o projeto.

### 📋 Pré-requisitos

É necessário ter instalado o "PostgreSQL", "JAVA" e alguma "IDE". No nosso caso, escolhemos o "IntelliJ". 

* Dowload do JAVA: https://www.java.com/pt-BR/download/

* Dowload do PostgreSQL: https://www.enterprisedb.com/downloads/postgres-postgresql-downloads

* Dowload do Intellij: https://www.jetbrains.com/idea/download/?section=windows




### 🔧 Instalação

1. Ao instalar o PostgreSQL, guarde a senha que você utilizou na instalação; você também pode usar o Docker. 

2. Baixe o arquivo da API no GitHub como um arquivo zip, e depois extraia-o.

3. Na IDE de sua escolha, crie um novo projeto, selecione "Abrir Pasta" e vá até o diretório onde o arquivo do GitHub foi baixado, então selecione a pasta.

4. Na IDE, abra o arquivo src/main/resources/application.properties e na linha 5, substitua spring.datasource.password=COLOQUE A SENHA DO POSTGRESQL pela senha que você definiu.

5. Navegue até src/main/java/com/nt/apiajudars/ApiAjudaRsApplication e execute o código para criar as tabelas no banco de dados.

6. Verifique se o banco de dados no PostgreSQL foi atualizado.


## ⚙️ Executando os testes

```bash
http://localhost:8080/doacoes
```
Dentro do "Insomnia".

* [ DEL ] DELETE ITEM (Deleta um item)

* [ PUT ] PUT ITEM (Atualiza um item)
* [ GET ] GET ITENS (Lista de itens)
* [ GET ] GET ITEM (Busca um item pelo ID)
* [ DEL ] DELETE DOADOR (Deleta um doador)
* [ PUT ] PUT DOADOR (Atualiza um doador)
* [ POST] POST DOAÇÔES (Criar uma doação)
* [ GET ] GET DOAÇÔES (Lista de doador)
* [ POST] POST DOADOR (Cria um doador)
* [ GET ] GET DOADOR (Lista de doadores)
  
### 🔩 Analise os testes de ponta a ponta

![esquema das classes](https://github.com/ntpaulo/Donation-API/assets/112903273/9425040a-d5e3-49c1-952d-31d99600147c)


Para integrar a API em um Front end basta acessar o link (https://cursos.alura.com.br/forum/topico-cors-113963)


## ✒️ Equipe
Adriel Rosa da Silva_____________RA:1282317340

Cleitisom de Andrade_____________RA:12823214333

Ellen Beatryz da Silva Polito____RA:12823123285

Gabriel Berg dos Santos Nogueira__RA:12823142095

Jussikele Cosme de Araújo_________RA:12823125707

Paulo Lucindo de Lima Neto________RA:1282317109


## 📄 Licença

Este projeto está sob a licença (MIT) - veja o arquivo [/ntpaulo/Donation-API/blob/ece56e0387cc5ff6b2905d4772560300ce19b1d5/LICENSE](https://github.com/ntpaulo/Donation-API/blob/ece56e0387cc5ff6b2905d4772560300ce19b1d5/LICENSE) para detalhes.

## 🎁 Expressões de gratidão

<p align="center" style="font-size: 18px;">
    Agradecemos profundamente ao professor Wanfranklin de Carvalho Moreira Alves por sua orientação incansável e dedicação ao nosso aprendizado ao longo deste semestre. Também expressamos nossa sincera gratidão aos colegas do grupo pelo apoio, colaboração e trabalho em equipe, que foram essenciais para a realização deste projeto.
</p>


---
