/**
 * Below class is to show the simple example for inheritance in scala.
 */
package com

//creating base class with salary as variable.
class BaseClass {
  var salary: Float = 1000;
}

//creating child class which extends the base class.
class Childclass extends BaseClass {
  var name: String = "manjunath";
  println("Salary from base class: \t" + salary); //base class variable
  println("\nName from childclass: \t" + name); //child class variable
}
object ScalaInheritance {
  def main(args: Array[String]) {
    new Childclass() //calling child class which extends base class.
  }
}