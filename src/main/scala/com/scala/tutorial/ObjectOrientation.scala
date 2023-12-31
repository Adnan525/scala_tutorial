 package com.scala.tutorial

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

  // trait
  trait Philosopher{
    def ?!(thought : String) : Unit // valid method name
  }

  // can extend single class but multiple traits "mixing"
  class Crocodile extends Animal with Carnivore with Philosopher{

    def ?!(thought: String): Unit = println(s"philosopher : I was thinking : $thought")

    override def eat(animal : Animal) : Unit = println("this is from trait")
    //override def eat() : Unit = println("overriden : I'm eating")
  }
  
  val aCroc : Crocodile = new Crocodile
  aCroc.eat(dog) // from trait
  aCroc eat dog // infix notation, available for methods with one parameter 
  aCroc ?! "What if we could fly?" // +, - operators are also methods


  // anonymous classes
  /*
    behind the scene, the compiler will create a class that extends Carnivore and instantiate it
    so, class Carnivore_anon extends Carnivore{
      override def eat(animal : Animal) : Unit = println("roar")
    }
    val dinosaur : Carnivore = new Carnivore_anon
  */
  val dinosaur : Carnivore = new Carnivore {
    def eat(animal: Animal): Unit = println("roar")
    
  }

  // singleton object
  object Mysingleton{ // the only instance of the Mysingleton type
    val mySpecialValue = 123
    def mySpecialMethod() : Int = 123
    def apply(x : Int) : Int = x + 1
  }
  Mysingleton.apply(65)
  Mysingleton(65) // equivalent to the above
  // the presence of the apply method allows to call the object as a function

  // companion object
  object Animal{ // companion object, can be applied to class or trait
    // can access private fields of Animal class
    // the singleton object and the class are different things
    // factory method
    def apply(x : Int) : Animal = new Animal
  }

  // case classes
  case class Person(name : String, age : Int)
  // Person is a companion object
  val bob = Person("Bob", 54) // Person.apply("Bob", 54)


  // exceptions
  try{
    val x : String = null
    x.length // this will throw a NullPointerException
  } 
  catch {
    case e : Exception => "some faulty error message"
  } 
  finally {
    // execute some code no matter what
  }

  // generics
  // it's like arraylist can contain any type of object
  abstract class MyList[T]{
    def head : T
    def tail : MyList[T]
  }
  val aList : List[Int] = List(1,2,3) // List.apply(1,2,3)
  val first = aList.head
  val rest = aList.tail 
}
