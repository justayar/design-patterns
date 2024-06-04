## Explanation

Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

## Pros

- You can be sure that the products you’re getting from a factory are compatible with each other.
- **Single Responsibility Principle** You can move the product creation code into one place in the program, making the code easier to support.
- **Open/Closed Principle** You can introduce new types of products into the program without breaking existing client code.

## Cons

- The code will be complex to create many subclasses and interface if it is needed.