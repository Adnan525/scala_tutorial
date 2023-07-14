package com.scala.tutorial

object ObjectOrientation extends App{
  class Animal{
    val age : Int = 0
    def eat() : Unit = println("I'm eating")
  }
  val animal : Animal = new Animal
  class Dog(val name : String) extends Animal
  val dog : Dog = new Dog("Lassie")

  //subtype polymorphism
  val anAnimal : Animal = new Dog("Polymorphism");
  anAnimal.eat()
}
