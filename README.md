# 🐉 Dragon Ball Java Battle

Projeto de estudos em **Java** inspirado no universo de Dragon Ball.

## 🎮 O que o projeto faz

* Cadastra personagens.
* Lista personagens cadastrados.
* Inicia batalhas por turnos.
* Calcula dano com base nos atributos.
* Permite técnicas especiais.
* Registra um histórico simples de batalhas.
* Possui personagens de diferentes raças.
* Demonstra herança, encapsulamento, abstração e polimorfismo.

## 🧠 Conceitos de Java praticados

### Fundamentos

* Variáveis e tipos primitivos
* `if/else`
* `switch`
* `for` e `while`
* Métodos
* `Random`
* `Scanner`
* Compilação e execução pelo JDK (`javac` e `java`)

### POO

* Classes e objetos
* Atributos e métodos
* Construtores
* Encapsulamento
* Herança
* Classes abstratas
* Polimorfismo
* Sobrescrita (`@Override`)
* `enum`

### Coleções

* `List`
* `ArrayList`

## 🏗️ Estrutura

```text
src/main/java/com/jpbortolin/dragonball/
├── Main.java
├── model/
│   ├── Personagem.java
│   ├── Saiyajin.java
│   ├── Humano.java
│   └── Android.java
├── service/
│   └── BatalhaService.java
└── util/
    └── TipoAtaque.java
```

## ▶️ Como executar

### Pelo terminal no Windows

Entre na pasta do projeto e execute:

## ▶️ Como executar

### Pelo terminal no Windows

Entre na pasta do projeto e execute:

```bat
cd src\main\java
javac -encoding UTF-8 -d ..\..\..\out com\jpbortolin\dragonball\Main.java com\jpbortolin\dragonball\model\*.java com\jpbortolin\dragonball\service\*.java com\jpbortolin\dragonball\util\*.java
java -cp ..\..\..\out com.jpbortolin.dragonball.Main
```

Também é possível abrir a classe `Main.java` diretamente pela sua IDE.

Também é possível abrir a classe `Main.java` diretamente pela sua IDE.

## 🚀 Próximas evoluções

Este projeto foi propositalmente criado como uma **versão inicial**.

Sugestões para as próximas versões:

1. Criar sistema de experiência e nível.
2. Adicionar transformações como Super Saiyajin.
3. Criar mais técnicas.
4. Criar ranking de personagens.
5. Salvar dados em banco de dados.
6. Criar uma API REST com Spring Boot.
7. Separar melhor domínio, serviços e persistência.

## 👨‍💻 Autor

**João Pedro Bortolin**

Projeto educacional desenvolvido para estudos de Java e Programação Orientada a Objetos.

