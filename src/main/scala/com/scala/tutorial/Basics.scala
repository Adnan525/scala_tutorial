package com.scala.tutorial

object Basics extends App{
  val meaningOfLife : Int = 42 // java : const int meaningOfLife = 42
  val aBoolean : Boolean = false
  val aString = "scala" // type mentioning is optional
  val aComposedString = "I" + " " + "love" + " " + "scala"
  val anInterpolatedString = s"I love $aString" // python : f"I love {aString}"
  // println(anInterpolatedString)
  val ifExpression = if(meaningOfLife > 43) 56 else 999

  //chaned if expression that will resut a single value or expression
  val chainedIfExpression = if(meaningOfLife >43) 56
    else if(meaningOfLife < 0) -2
    else if(meaningOfLife > 999) 78
    else 0

  //code blocks
  // the Int is optional but it shows the variable will hold a single value only, not the whole funnction
  val aCodeBlock : Int= {
    val aLocalValue: Int = 67
    aLocalValue + 3 //return value
  } 


  def myFunction(x : Int, y : String) : String = {
     y + " " + x
  }

  def factorial(i : Int) : Int = {
    if(i == 1) 1
    else i * factorial(i - 1)
  }
  println(factorial(5))

  // unit return type
  // unit == void
  // side effects
  def unitReturningFunction() : Unit = {
    println("side effect return type")
  }
  unitReturningFunction()
}
