package com.scala.tutorial

object Basics extends App{
  val meaningOfLife : Int = 42 //constant
  val aBoolean : Boolean = false
  val aString = "scala"
  val aComposedString = "I" + " " + "love" + " " + "scala"
  val anInterpolatedString = s"I love $aString"
  // println(anInterpolatedString)
  val ifExpression = if(meaningOfLife > 43) 56 else 999

  //single expression
  val chainedIfExpression = if(meaningOfLife >43) 56
    else if(meaningOfLife < 0) -2
    else if(meaningOfLife > 999) 78
    else 0

  //code blocks
  val aCodeBlock = {
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
}
