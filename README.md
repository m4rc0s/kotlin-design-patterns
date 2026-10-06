# Kotlin Design Patterns

> The GoF classics, without verbose Java and without 2003-era XML. Pure, idiomatic Kotlin with real tests.

Personal repository for studying and cataloguing the **23 Gang of Four design patterns** — plus a few that showed up later — implemented in modern Kotlin, with no framework hiding what actually matters: the pattern itself.

Each pattern lives on its own, with:

- a lean, idiomatic implementation (no line-by-line translation of Java 1.4);
- tests using [Kotest](https://kotest.io/) for fluent assertions;
- a runnable usage example, logged in a structured way with [Klogging](https://klogging.io/).

## Why this repo exists

A design pattern that only exists on a course slide convinces no one. The idea here is to have code that **compiles, runs, and has tests** — a quick-reference source to remember "how that pattern worked" without reopening the GoF book.

## Patterns

Status: 🚧 work in progress. Checked off once implemented.

### Creational
- [ ] Singleton
- [ ] Factory Method
- [ ] Abstract Factory
- [ ] Builder
- [ ] Prototype

### Structural
- [ ] Adapter
- [ ] Bridge
- [ ] Composite
- [ ] Decorator
- [ ] Facade
- [ ] Flyweight
- [ ] Proxy

### Behavioral
- [ ] Chain of Responsibility
- [ ] Command
- [ ] Interpreter
- [ ] Iterator
- [ ] Mediator
- [ ] Memento
- [ ] Observer
- [ ] State
- [ ] Strategy
- [ ] Template Method
- [ ] Visitor

## Stack

| Tool | Role |
|---|---|
| [Kotlin](https://kotlinlang.org/) | Language — no framework on top |
| [Gradle](https://gradle.org/) (wrapper included) | Build, nothing to install |
| [JUnit 5](https://junit.org/junit5/) | Test runner |
| [Kotest Assertions](https://kotest.io/) | Fluent assertions (`shouldBe`, `shouldNotBeEmpty`, ...) |
| [Klogging](https://klogging.io/) | Structured, colourful console logging |

## Running it

```bash
./gradlew run     # runs the example
./gradlew test    # runs the test suite
```

No need to install Gradle or Kotlin globally — the wrapper (`gradlew`) takes care of that.

## Structure

```
app/
  src/main/kotlin/com/example/   # pattern implementations
  src/test/kotlin/com/example/   # matching tests
```

Every new pattern gets its own file (or package, when that makes sense), with a test right next to it — no exceptions.

## License

Free to use for study. Copy, adapt, learn.
