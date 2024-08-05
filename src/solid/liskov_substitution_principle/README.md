## Explanation

The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.
When we use inheritance we assume that the child class inherits everything that the superclass has.
The child class extends the behavior but never narrows it down.

## Pros

- More maintainable and understandable code
- Closed to unexpected failures and exceptions

## Cons

- The code will be complex to create many subclasses and interface if it is needed.
- Potential for over-engineering, leading to too much abstraction and unnecessary code.
