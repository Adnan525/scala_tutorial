id: file://<WORKSPACE>/src/main/scala/com/scala/tutorial/ObjectOrientation.scala:[770..771) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/com/scala/tutorial/ObjectOrientation.scala", " package com.scala.tutorial

object ObjectOrientation extends App{
  class Animal{
    val age : Int = 0
    def eat() : Unit = println("I'm eating")
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
  abstract class 
}
")
file://<WORKSPACE>/src/main/scala/com/scala/tutorial/ObjectOrientation.scala
file://<WORKSPACE>/src/main/scala/com/scala/tutorial/ObjectOrientation.scala:26: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace