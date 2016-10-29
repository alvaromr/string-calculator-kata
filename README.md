# Refactoring StringCalculator Kata

## Description

Refactor a given string-based calculator following SOLID principles.

## Starter Rules

This rules define the behaviour of StringCalculator

1. StringCalculator must keep `int add(String numbers)` method interface.
2. StringCalculator takes an unknown amount of numbers separated by commas and return their sum.
3. Negative numbers are not allowed and must raise an exception.
4. Numbers greater than 1000 must be ignored.

## Advanced Rules

This rules are meant to be applied after refactorization, to prove that resulting code is extensible.
+ Numbers can be separated by dots, whitespaces, etc.
+ Numbers greater than 2000 must not be ignored.
+ Numbers greater than 5000 are not allowed and must raise an exception.
+ StringCalculator can perform product operation with same rules.

## About this kata

This kata is based on [Refactoring-StringCalculator-Kata](https://github.com/xurxodev/Refactoring-StringCalculator-Kata)
 developed by [xurxodev](https://github.com/xurxodev)
