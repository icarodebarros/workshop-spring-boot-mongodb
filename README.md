# workshop-spring-boot-mongodb

Introdução ao paradigma orientado a documentos com MongoDB.

O projeto consiste em um sistema simples de Postagem, com 3 elementos principais: Usuário, Post e Comentário.

### O projeto contém:
* Operações de CRUD;
* Uma modelagem de banco de dados orientado a documentos;
* Associações entre objetos aninhados e por referências;
* Consultas com [String Data](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#reference) e [MonoRepository](https://docs.mongodb.com/manual/reference/operator/query/regex/);

## Visão relacional
Modelo Relacional:

![Imagem ModeloRelacional](https://github.com/icarodebarros/workshop-spring-boot-mongodb/blob/master/src/main/resources/images/ModeloRelacional.jpg)

Diagrama de Objetos - UML:

![Imagem DiagramaUML](https://github.com/icarodebarros/workshop-spring-boot-mongodb/blob/master/src/main/resources/images/DiagramaDeObjetosUML.jpg)

## Visão orientada a documentos

### Possível modelagem
Essa modelagem gera uma única coleção: a de Usuários. As outras entidades estarão agregadas, onde cada Usuário contém os posts criados e esses por sua vez contém seus respectivos comentários.

![Imagem Design1](https://github.com/icarodebarros/workshop-spring-boot-mongodb/blob/master/src/main/resources/images/Design1.jpg)

### Modelagem usada no projeto
Essa modelagem gera duas coleções: Usuários e Posts. Onde o Usuário contém uma lista de referências aos seus Posts criados. E estes por sua vez contém seus comentários agregados.

![Imagem Design2](https://github.com/icarodebarros/workshop-spring-boot-mongodb/blob/master/src/main/resources/images/Design2.jpg)
