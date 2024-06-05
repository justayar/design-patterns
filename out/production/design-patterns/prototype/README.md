## Explanation

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

The Prototype pattern delegates the cloning process to the actual objects that are being cloned. 
The pattern declares a common interface for all objects that support cloning. 
This interface lets you clone an object without coupling your code to the class of that object. 
Usually, such an interface contains just a single clone method.

When you need an object like the one you’ve configured, you just clone a prototype instead of constructing a new object from scratch.

## Pros

- You avoid tight coupling between the creator and the concrete products.
- **Single Responsibility Principle** You can move the product creation code into one place in the program, making the code easier to support.
- **Open/Closed Principle** You can introduce new types of products into the program without breaking existing client code.

## Cons

- The code will be complex to create many subclasses