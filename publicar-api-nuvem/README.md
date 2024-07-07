# Bootcamp DIO Santander 2024 - Backend Java
## Trilha Java Básico
### Repositorio para armazenar todo o conteudo do curso de java basico

Os desafios estão organizados em branches, sendo uma branch para cada desafio.

| # | Desafio | Branch |
|---|---------|--------|
| 7 | Publicar API na nuvem | [publicar-api-nuvem](https://github.com/alexandre-melgarejo/dio-java-basico/tree/publicar-api-nuvem) |


#### Sobre a branch "aulas"

Além das branches dos desafios (listadas na tabela acima), existe a [branch aulas](https://github.com/alexandre-melgarejo/dio-java-basico/tree/aulas) que armazena materiais de estudo, tais como rascunho, experiências, códigos desenvolvidos durante as aulas, explorações de novos recursos, etc.

Nenhum desafio está contido nessa branch.

A lista completa dos desafios encontra-se na tabela acima.



Se você tiver alguma contribuição, sugestão, reclamação, etc [registre uma issue](https://github.com/alexandre-melgarejo/dio-java-basico/issues).

---
Feito com 💙, ☕, 📚 e 🤖 · direto de MS - Brasil.


---
# Arquivo README original está listado abaixo:
---

# Santander Dev Week 2023

Java RESTful API criada para a Santander Dev Week.

## Principais Tecnologias
 - **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
 - **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
 - **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
 - **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## [Link do Figma](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421%3A432&mode=design&t=6dPQuerScEQH0zAn-1)

O Figma foi utilizado para a abstração do domínio desta API, sendo útil na análise e projeto da solução.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

## IMPORTANTE

Este projeto foi construído com um viés totalmente educacional para a DIO. Por isso, disponibilizamos uma versão mais robusta dele no repositório oficial da DIO:

### [digitalinnovationone/santander-dev-week-2023-api](https://github.com/digitalinnovationone/santander-dev-week-2023-api)

Lá incluímos todas os endpoints de CRUD, além de aplicar boas práticas (uso de DTOs e refinamento na documentação da OpenAPI). Sendo assim, caso queira um desafio/referência mais completa é só acessar 👊🤩
