# Java Interview Katas

Starter repository for Java backend interview practice: **TDD, legacy code, refactoring, clean code, OOP and classic coding exercises**.

## Recommended order

### Highest priority — interview / craft
1. Trip Service — legacy code + characterization tests + seams
2. Gilded Rose — legacy refactoring
3. String Calculator — pure TDD
4. Tennis — refactoring
5. Bank Account — TDD + OOP
6. Bowling Game — TDD
7. Movie Rental — refactoring + polymorphism
8. Mars Rover — TDD + design

### Then
9. Roman Numerals
10. Password Validator
11. Shopping Cart
12. Game of Life
13. FizzBuzz
14. Palindrome
15. Anagram
16. Valid Parentheses
17. Two Sum
18. Frequency Counter

## How to work

For TDD katas the starter tests are intentionally `@Disabled`. Pick **one kata**, remove `@Disabled`, then work in small cycles:

`RED -> GREEN -> REFACTOR`

Run one kata:

```bash
mvn -Dtest=StringCalculatorTest test
```

Run all currently enabled tests:

```bash
mvn test
```

## Interview rules

- Do not jump straight to the final design.
- Write the smallest failing test first.
- Make it green with the minimum implementation.
- Refactor only while tests are green.
- Explain trade-offs aloud.
- Prefer readable Java over clever Java.
- On legacy katas, characterize existing behaviour before changing it.

## Suggested session format

- 5 min: read requirements / inspect legacy code
- 25-35 min: coding
- 10 min: refactoring and discussion
- 5 min: edge cases / complexity / alternatives

Java 21 + Maven + JUnit 5 + Mockito.
