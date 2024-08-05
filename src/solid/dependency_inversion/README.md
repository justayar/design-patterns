## Explanation

The general idea of this principle is as simple as it is important:

High-level modules, which provide complex logic, should be easily reusable and unaffected by changes in low-level modules, 
which provide utility features. To achieve that, you need to introduce an abstraction that decouples the high-level and low-level modules from each other.

Based on this idea, Robert C. Martin’s definition of the Dependency Inversion Principle consists of two parts:

1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
2. Abstractions should not depend on details. Details should depend on abstractions.

## Pros

- More flexible and extendable code
- High-level modules will be more independent from changes on low level modules

## Cons

- The code will be complex to create many subclasses and interface if it is needed.
- Potential for over-engineering, leading to too much abstraction and unnecessary code.
