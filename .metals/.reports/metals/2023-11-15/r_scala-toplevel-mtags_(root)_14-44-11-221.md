id: file://<WORKSPACE>/src/main/scala/com/scala/tutorial/ObjectOrientation.scala:[1549..1550) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/com/scala/tutorial/ObjectOrientation.scala", " package com.scala.tutorial

object ObjectOrientation extends App{
  class Animal{
    val age : Int = 0
    def eat() : Unit = println("base : I'm eating")
  }
  val animal : Animal = new Animal

  // inheritence
  // if nothing more to add : class Dog extends Animal
  class Dog(name : String) extends Animal // Dog(name : String) is a constructor definition
  val dog : Dog = new Dog("Lassie")
  // but Dog.name is not accessible so it's not a field

  // to add the name field to the class
  // class Dog(val name : String) extends Animal{}
  // now Dog.name is accessible

  // subtype polymorphism
  val anAnimal : Animal = new Dog("Polymorphism");
  anAnimal.eat() // the most derived method will be called at runtime, so from Dog

  // abstract class
  abstract class WalkingAnimal{
    val hasLegs = true 
    // by default public, can restrict with private or protected
    // protected : accessible from subclasses, but not from outside
    def walk() : Unit // abstract method
  }

  // interface = ultimate abstract type, so everything is abstract
  trait Carnivore{
    def eat(animal : Animal) : Unit
  }

  // can extend single class but multiple traits "mixing"
  class Crocodile extends Animal with Carnivore{
    override def eat(animal : Animal) : Unit = println("this is from trait")
    //override def eat() : Unit = println("overriden : I'm eating")
  }
  
  val aCroc : Crocodile = new Crocodile
  aCroc.eat(dog) // from trait
  aCroc eat dog // infix notation, available for methods with one parameter 

  // trait
  trait 
}
")
file://<WORKSPACE>/src/main/scala/com/scala/tutorial/ObjectOrientation.scala
file://<WORKSPACE>/src/main/scala/com/scala/tutorial/ObjectOrientation.scala:49: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace