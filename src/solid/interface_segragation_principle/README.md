## Explanation

Segregation means keeping things separated, and the Interface. Segregation Principle is about separating the interfaces.
The principle states that many client-specific interfaces are better than one general-purpose interface.
Clients should not be forced to implement a function they do no need.

## Pros

- More flexible and extendable code
- Do not need to have boilerplate and unsupported methods from super classes

## Cons

- The code will be complex to create many subclasses and interface if it is needed.
- Potential for over-engineering, leading to too much abstraction and unnecessary code.
