# Programação Orientada a Objetos em Java (com League of Legends)

Estudos de POO em Java que fiz na disciplina de Programação Orientada a Objetos do curso de
Análise e Desenvolvimento de Sistemas (UniSenai). Para fixar cada conceito, usei campeões e
itens de League of Legends como exemplos, em vez de só "Animal" e "Carro".

Cada conceito está em uma pasta própria, com um arquivo `.java` independente.

## Conceitos abordados

| Pasta | Conceito | O que o código mostra |
|---|---|---|
| `01-encapsulamento` | Encapsulamento | Classe `Thresh` com atributos privados, dois construtores, getters/setters com validação e métodos como `levarDano` e `curar` |
| `02-composicao` | Composição | Um `Guerreiro` "tem uma" `Arma` |
| `03-colecoes` | Coleções | `ArrayList<String>` com `add`, `get`, `remove`, `size` e `for-each` |
| `04-heranca` | Herança | `Mago` herda de `Campeao`, usando `super` e `@Override` |
| `05-classes-abstratas` | Classes abstratas | `Campeao` abstrata com o método `usarHabilidade()` implementado por `Blitz` e `Lux` |
| `06-interfaces` | Interfaces | `Atacante` e `Curador`; `Nami` implementa as duas |
| `07-polimorfismo` | Polimorfismo | Variáveis do tipo `Animal` chamando o comportamento de `Cachorro` e `Gato` |
| `08-excecoes` | Tratamento de exceções | `try`/`catch`/`finally` com `NumberFormatException` e `ArithmeticException` |
| `09-excecao-personalizada` | Exceção personalizada | `SaldoInsuficienteException`, lançada com `throw` |
| `10-validacao-e-sobrecarga` | Validação e sobrecarga | `Matricula` com notas limitadas de 0 a 10 e `calcularMediaFinal()` com e sem pesos |

## Como rodar

Precisa do JDK 17 ou superior. Exemplo com o conceito de herança:

```bash
cd 04-heranca
javac Heranca.java
java Heranca
```

Cada pasta é independente, porque algumas classes (como `Campeao`) aparecem em mais de uma pasta com
formatos diferentes.

## Sobre este repositório

São exercícios de estudo, escritos por mim durante as aulas, com o objetivo de praticar os
fundamentos de orientação a objetos.
