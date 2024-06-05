## Explanation

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class. 


## Pros

- You avoid tight coupling between the creator and the concrete products.
- **Single Responsibility Principle** You can move the product creation code into one place in the program, making the code easier to support.
- **Open/Closed Principle** You can introduce new types of products into the program without breaking existing client code.

## Cons

- The code will be complex to create many subclasses