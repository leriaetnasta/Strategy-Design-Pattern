


Strategy Pattern

> “Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it. ”

_Design Patterns: Elements of Reusable Object Oriented Software_

The 3 attack() methods represents a family of algorithms. Each algorithm is encapsulated in an independent class. 
The 3 classes implement the IWeapon interface, which is what renders the algorithms interchangeable.
The class StarwarsCharacter by using the IWeapon Interface it could access any algorithm without depending on the class.

This design is very powerful, it makes it possible to add algorithms as you go when needed without altering any existing code.

![Strategy design pattern-8](https://user-images.githubusercontent.com/61632665/211913277-0d4a83d6-e832-4c96-821c-bfec6af54476.png)


So in case the character is a Clone they could attack using a Blaster and if it is a Jedi they could attack using a Lightsaber. 

But what if it is Chewbacca ? 

In this case all we have to do is add a new class Bowcaster that implements the IWeapon Interface and overrides the method attack().

![Strategy design pattern-9](https://user-images.githubusercontent.com/61632665/211913288-866eb6c6-c992-4f9d-ae4a-3edaa8079ecf.png)


And now Chewbacca could use his Bowcaster.

