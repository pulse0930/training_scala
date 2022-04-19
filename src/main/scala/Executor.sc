//This is a Worksheet to try out scala

import com.pulse0930.scalatrain.Time

import scala.util.Random
//instantiating two time objects
val time1 = new Time(12,30)
val time2 = new Time(10,30)

//calling a method from Time
println(time1.minus(time2))

//infix operation
println(time1 - time2)

//Accessing companion objects method
val time3 = Time.fromMinutes(20)
println(time3.hours +" : "+ time3.minutes)

//Creating new instances without new keyword, added case keyword in Time
val time4 = Time(10,30)

//------------------------------ COLLECTIONS AND FP BASICS --------------------------------//
Vector(1,2,3)

Seq(1,2,3)

Set(1,2,"3")

//Applying Syntatic Sugar
Vector.apply(1,2,3)
//Each collection has a companion object with an apply method
//Calling an object is translated into calling apply which is used as a factory method

//Collections Take Type Parameters
Vector[String]("Alpha","Beta","Charlie", "Delta")

//Sequences
val numbers = Seq(1,2,3)

numbers(0)

numbers :+ 4

0 +: numbers

Seq(1,2,1,3).distinct

//Right-binding Operators
numbers.+:(0)

0 +: numbers

//Sets
val numbers = Set(1,2,3)

numbers(1)

numbers contains 1

numbers + 4

numbers + 3

//Tuples
Tuple2(1, "a")

Tuple2(1, 2)

(1, "a")

val pair = (1, "a")

pair._2

1 -> "a"
//------------------------------ FOR LOOPS AND EXPRESSIONS --------------------------------//
//For loops
for (n<-1 to 3) println(n)

//Generators
for(n <- Vector(1,2,3)) yield n + 1
for(n <- Set(1,2,3)) yield "#" + n

//Multiple Generators
for {
  n <- 1 to 3
  m <-1 to n
} yield n * m

//Filters
for{
  n <-1 to 3 if n % 2 == 1
  m <-1 to n
} yield n * m

//Translation of For Expressions using map and flatMap
for(n <- 1 to 3) yield n + 1
(1 to 3).map(n => n + 1)

for(n <-1 to 3 ; m <- 1 to n) yield n * m
(1 to 3).flatMap(n => (1 to n).map(m => n * m))

//Translation of For loops
for(n<-1 to 3) println(n)
(1 to 3).foreach(n=>println(n))


//---------------------------------INHERITANCE AND TRAITS-----------------------------------//
//Inheritance Implementation
class Animal {
  def eat() : Unit = println("Yum yum!")
  private def secret() = println("None must see!")
}

class Bird extends Animal

val bill = new Bird
bill.eat()  //All non private members are inherited

// Superclass Constructor
/*
class Animal(val name : String = "Peacock")
class Bird() extends Animal()
(new Bird()).name
*/

//Overriding defs with vals
class Animal{
  def name : String = Random.shuffle("Arnold".toSeq).toString()
}
class Bird extends Animal {
  override val name : String = "Bill"
}
new Bird().name
//A val is stable, but a parameterless def could return different results on different calls
//We can decide to become stable and override a def with a val but the other way around is not possible

//Lazy vals
lazy val lazySeven = {
  println("I am very lazy ;-)")
}

lazySeven
//defers initialization until first usage

//Digression : String Interpolation
val n = 20
s"Value = $n"
f"Hex value = $n%02x"
//x refers to "integer in hexadecimal format"
//String starting with s embeds expressions using $id or ${expr}
//String starting with f formats the results of the expressions

