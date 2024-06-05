## Explanation

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

The Prototype pattern delegates the cloning process to the actual objects that are being cloned. 
The pattern declares a common interface for all objects that support cloning. 
This interface lets you clone an object without coupling your code to the class of that object. 
Usually, such an interface contains just a single clone method.

When you need an object like the one you’ve configured, you just clone a prototype instead of constructing a new object from scratch.

## Pros

- You can clone objects without coupling to their concrete classes.
- You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
- You can produce complex objects more conveniently.
- You get an alternative to inheritance when dealing with configuration presets for complex objects.

## Cons

- Cloning complex objects that have circular references might be very tricky.